package clases;

import examen.Examen;
import java.util.ArrayList;

public class materia {

    private int idmateria;
    private String materia;
 
    //Examen baseDatos = new Examen().conectar();
    String[][] Materia = new Examen().getMateria();
    public String getMateria;

    public materia() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getMateria(int x,int y){
        return Materia [x][y];
    }
       

    public materia(int idmateria, String materia) {
        this.idmateria = idmateria;
        this.materia = materia;
    }

    public int getIdMateria() {
        return idmateria;
        
    }

    public void setIdMateria(int idmateria) {
        this.idmateria = idmateria;
    }

    public String getMateria() {
        return materia;
        
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    private String Materia(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}