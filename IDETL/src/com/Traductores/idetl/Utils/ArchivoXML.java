/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Traductores.idetl.Utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
/**
 *
 * @author JC
 */
public class ArchivoXML 
{
    private static Document doc;
    private static Element clase;
    private static Element variable;
    private static Element metodo;
    public ArchivoXML()
    {
        crearDocumentoXML();

    }//fin del constructor

    //prepara el documento XML
    public static void crearDocumentoXML()
    {
        try
        {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            doc = docBuilder.newDocument();
            doc.setXmlStandalone(true);

            //crea tag principal
            //documento = doc.createElement("Documento");
        }catch(ParserConfigurationException ex){
            ex.printStackTrace();
        }
    }// fin del metodo crearDocumetnoXML


    public static void crearTagClase(String nombreClase )
    {

        clase = doc.createElement("classtl");
        clase.setAttribute("nombreClase", nombreClase);

    }// fin del elemento crearTagParrafoOracion

    public static void crearTagVarialbe(String nombreVariable, String tipoValor, String valor)
    {
        variable = doc.createElement("variable");
        variable.setAttribute("nombre", nombreVariable);
        variable.setAttribute("Tipodevalor", tipoValor);
        variable.setAttribute("Valor", valor);
        clase.appendChild(variable);
    }
    
    public static void crearTagMetodo(String nombreMetodo, String tipoRetorno)
    {
        metodo = doc.createElement("metodo");
        metodo.setAttribute("nombre", nombreMetodo);
        metodo.setAttribute("tipoderetorno", tipoRetorno);
        
    }
    
    public static void atributoParametro(int contador, String nombreParametro, String tipoDato)
    {
        metodo.setAttribute("nombreParametro" + contador, nombreParametro);
        metodo.setAttribute("tipoDato" + contador, tipoDato);
        
    }

    //crear documento XML
    public static void crearXML()
    {

        try
        {
            //se agrega el tago principal al documento
            doc.appendChild(clase);
            clase.appendChild(metodo);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            DOMSource source = new DOMSource(doc);
            File archivo = new File("archivoXML.xml");
            StreamResult result = new StreamResult(archivo);
            transformer.transform(source, result);
        }catch (TransformerConfigurationException ex){
            ex.printStackTrace();
        }catch (TransformerException ex){
            ex.printStackTrace();
        }

    }// fin del metodo crearXML
}
