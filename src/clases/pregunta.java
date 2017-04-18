
package clases;

import examen.Examen;

public class pregunta {

    public static int lenght;
    
    //Examen baseDatos = new Examen().conectar();
    String[][] pregunta = new Examen().getPreguntas();

    public String getPregunta(int x, int y){
        return pregunta[x][y];
    }

    public String getMateria(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}