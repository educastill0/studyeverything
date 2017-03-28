/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author SIMGE
 */
public class pregunta {

    private int idpregunta;
    private String pregunta;
    private String respuesta_a;
    private String respuesta_b;
    private String respuesta_c;
    private String respuesta_correcta;

    public pregunta(int idpregunta, String pregunta, String respuesta_a, String respuesta_b, String respuesta_c, String respuesta_correcta) {
        this.idpregunta = idpregunta;
        this.pregunta = pregunta;
        this.respuesta_a = respuesta_a;
        this.respuesta_b = respuesta_b;
        this.respuesta_c = respuesta_c;
        this.respuesta_correcta = respuesta_correcta;
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
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    /**
     * @return the respuesta_a
     */
    public String getRespuesta_a() {
        return respuesta_a;
    }

    /**
     * @param respuesta_a the respuesta_a to set
     */
    public void setRespuesta_a(String respuesta_a) {
        this.respuesta_a = respuesta_a;
    }
  
        /**
     * @return the respuesta_b
     */
    public String getRespuesta_b() {
        return respuesta_b;
    }

    /**
     * @param respuesta_b the respuesta_b to set
     */
    public void setRespuesta_b(String respuesta_b) {
        this.respuesta_b = respuesta_b;
    }
    
        /**
     * @return the respuesta_c
     */
    public String getRespuesta_c() {
        return respuesta_c;
    }

    /**
     * @param respuesta_c the respuesta_c to set
     */
    public void setRespuesta_c(String respuesta_c) {
        this.respuesta_c = respuesta_c;
    }
    
        /**
     * @return the respuesta_correcta
     */
    public String getRespuesta_correcta() {
        return respuesta_correcta;
    }

    /**
     * @param respuesta_correcta the respuesta_correcta to set
     */
    public void setRespuesta_correcta(String respuesta_correcta) {
        this.respuesta_correcta = respuesta_correcta;
    }

}