
package clases;

import examen.Examen;
import java.util.ArrayList;
import java.util.Iterator;

public class pregunta {
    
    Examen baseDatos = new Examen().conectar();
    String[] pregunta = new Examen().getPreguntass();

    public String getPregunta(int posicion){
        return pregunta[posicion];
    }
    private int idpregunta;
    //private String pregunta;
    private String respuesta_a;
    private String respuesta_b;
    private String respuesta_c;
    private String respuesta_correcta;

    public pregunta(int idpregunta, String pregunta, String respuesta_a, String respuesta_b, String respuesta_c, String respuesta_correcta) {
        this.idpregunta = idpregunta;
        //this.pregunta = pregunta;
        this.respuesta_a = respuesta_a;
        this.respuesta_b = respuesta_b;
        this.respuesta_c = respuesta_c;
        this.respuesta_correcta = respuesta_correcta;
    }

    public pregunta() {
        //throw new UnsupportedOperationException("No Uso"); //To change body of generated methods, choose Tools | Templates.
    }



    /**
     * @return the idpregunta
     */
    public int getIdPregunta() {
        return idpregunta;
    }
   
  


        

    /**
     * @param idpregunta the idpregunta to set
     */
    public void setIdPregunta(int idpregunta) {
        this.idpregunta = idpregunta;
    }

    /**
     * @return the 
     */
   // public String getPregunta(int posicion) {
        //return pregunta[posicion];
    //}

    /**
     * @param pregunta the to set
     */
    public void setPregunta(String pregunta) {
       // this.pregunta = pregunta;
    }
    
    /**
     * @return the
     */
    public String getRespuesta_a() {
        return respuesta_a;
    }

    /**
     * @param respuesta_a the  to set
     */
    public void setRespuesta_a(String respuesta_a) {
        this.respuesta_a = respuesta_a;
    }
  
        /**
     * @return the 
     */
    public String getRespuesta_b() {
        return respuesta_b;
    }

    /**
     * @param respuesta_b the_b to set
     */
    public void setRespuesta_b(String respuesta_b) {
        this.respuesta_b = respuesta_b;
    }
    
        /**
     * @return the c
     */
    public String getRespuesta_c() {
        return respuesta_c;
    }

    /**
     * @param respuesta_ the respuesta_c to set
     */
    public void setRespuesta_c(String respuesta_c) {
        this.respuesta_c = respuesta_c;
    }
    
        /**
     * @return the 
     */
    public String getRespuesta_correcta() {
        return respuesta_correcta;
    }

    /**
     * @param respuesta_correct the  to set
     */
    public void setRespuesta_correcta(String respuesta_correcta) {
        this.respuesta_correcta = respuesta_correcta;
    }

}