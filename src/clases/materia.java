/*
 * 
 */
package clases;

/**
 *
 * @author SIMGE
 */
public class materia {

    private int idmateria;
    private String materia;
     //Materia.setText(getMateria);
       

    public materia(int idmateria, String materia) {
        this.idmateria = idmateria;
        this.materia = materia;
    }

    /**
     * @return the iDmateria
     */
    public int getIdMateria() {
        return idmateria;
        
    }

    /**
     * @param idmateria the iDmateria to set
     */
    public void setIdMateria(int idmateria) {
        this.idmateria = idmateria;
    }

    /**
     * @return the iDpregunta
     */
    public String getMateria() {
        return materia;
        
    }

    /**
     * @param materia the iDmateria to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }
}