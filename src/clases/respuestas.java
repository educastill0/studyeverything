
package clases;

import java.util.StringTokenizer;

public class respuestas {
    
    String[] respuestas ={
        "1.55","29.40 y 8.75","4000","49","15 y 8","40 y 20","32, 34 y 36","Ecuacion de primer grado",
        "4 metros","Leer los poemas que en contraron y compartirlos con los compañeros",
        "los datos del libro de donde se obtuvo","El Verbo","Pretérito","Recuadro Blanco y Mayúsculas",
        "Introducción",
    };
    
    String[] radioR={
        
        "1,2,3,4",
        "2,3,4,5",
        "3,4,5,6",
        "4,5,6,7",
        "5,6,7,8",
        
    };
        public String getRespuesta(int posicion){
            return respuestas[posicion];
            }
        public String[] separar (String cadena,String separador){
           StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[15];
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

