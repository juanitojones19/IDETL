/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Traductores.idetl.Utils;

import java.util.StringTokenizer;



/**
 *
 * @author JC
 */
public class LectorArchivoXML 
{
    //private String texto = "";
    public LectorArchivoXML(String rua)
    {
        obtenerXML(rua);
    }
    
    public static String obtenerXML(String ruta)
    {
        
        System.out.println(LectorArchivo.obtenerTexto(ruta));
        String texto = LectorArchivo.obtenerTexto(ruta);
        StringTokenizer st = new StringTokenizer(texto,">");
        System.out.println("Hay un total de: "+st.countTokens()+" tokens.");
        //System.out.print(st.nextToken()+ ">\n");
        //System.out.print(st.nextToken()+ ">\n");
        texto = "";
        texto += st.nextToken()+ ">\n";
        texto += st.nextToken()+ ">\n";
        while (st.hasMoreTokens()) 
        {  
            String token = st.nextToken();
            if(token.equals("</classtl"))
            {
                texto += token+ ">";
            }else{
                 //System.out.print("\t"+token + ">\n"); 
                texto += "\t"+token + ">\n";
            }
        }
            
        return texto;
    }// fin del metodo obtenerXML
        
   
}
