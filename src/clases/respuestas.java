/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.StringTokenizer;

public class respuestas {
    
    String[] respuestas = {
      "4","2","3","4","5","6","7","8","9","10","11","12","13","14"
    };
    
    String[] radioR = {
        "4,2*2,3+1",
        "2,3,4,5",
        "3,4,5,6",
        "4,5,6,7",
        "5,6,7,8",
        "6,6,7,8",
        "7,6,7,8",
        "8,6,7,8",
        "9,6,7,8",
        "10,6,7,8",
        "11,6,7,8",
        "12,6,7,8",
        "13,6,7,8",
        "14,6,7,8",
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[14];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}


