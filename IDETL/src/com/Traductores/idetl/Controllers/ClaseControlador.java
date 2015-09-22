/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Traductores.idetl.Controllers;
import com.Traductores.idetl.Utils.ArchivoXML;
import com.Traductores.idetl.Utils.Diccionario;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author JC
 */
public class ClaseControlador 
{
    private static final String regexIdentificador = "[^\\d]\\w*";
    
    public ClaseControlador(String nombreClase, JDialog jDialogVentana)
    {
        Diccionario.cargarPalabras("palabrasReservadas.txt");
        generarXmlClase(nombreClase);
        System.out.println("Valido?: " + esNombreValido(nombreClase));
        System.out.println("PalabraReservada?: " + esPalabraReservada(nombreClase));
        if(esPalabraReservada(nombreClase))
        {
            JOptionPane.showMessageDialog(jDialogVentana, Diccionario.obtenerListaPalabras().get(nombreClase));
        }else{
            ArchivoXML.crearDocumentoXML();
            ArchivoXML.crearTagClase(nombreClase);
        }
    }
    
    public boolean esNombreValido(String nombreClase)
    {
        return nombreClase.matches(regexIdentificador);
    }
    
    public boolean esPalabraReservada(String nombreClase)
    {
        return Diccionario.buscarPalabra(nombreClase);
    }
    
    public static void generarXmlClase(String nombreClase)
    {
        System.out.printf("Se genero la clase %s\n", nombreClase);
    }
    
}
