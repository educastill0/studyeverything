
package clases;

import examen.Examen;

public class pregunta {
    
    //Examen baseDatos = new Examen().conectar();
    String[][] pregunta = new Examen().getPreguntas();

    public String getPregunta(int x, int y){
        return pregunta[x][y];
    }
}