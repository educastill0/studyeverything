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
public class materia {

    private int idmateria;
    private String materia;

    public materia(int idmateria, String materia) {
        this.idmateria = idmateria;
        this.materia = materia;
    }

    /**
     * @return the idmateria
     */
    public int getIdMateria() {
        return idmateria;
    }

    /**
     * @param idmateria the idmateria to set
     */
    public void setIdMateria(int idmateria) {
        this.idmateria = idmateria;
    }

    /**
     * @return the pregunta
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }
}