package examen;

import clases.*;
import java.sql.*;
import java.util.ArrayList;

public class Examen extends javax.swing.JFrame {

   public static Connection conexion;

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Examen conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String BaseDeDatos = "jdbc:mysql://db.interface.mx:3306/examendb?user=examenusr&password=3X4m3n2017";
            setConexion(DriverManager.getConnection(BaseDeDatos));
            if (conexion != null) {
                System.out.println("Conexion exitosa!");
            } else {
                System.out.println("Conexion fallida!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ocurrio la siguiente excepcion : " + e.toString());
            System.out.close();
        }

        return this;
    }

    public String[][] getPreguntas() {
        String[ ][ ] listaPreguntas = new String[15][7];
        try{
            PreparedStatement consulta = conexion.prepareStatement("select idpregunta,pregunta,respuesta_a,respuesta_b,respuesta_c,respuesta_correcta,materia from tpreguntas order by idpregunta");
            ResultSet result;
            result = consulta.executeQuery();
            int count = 0;
            while(result.next()){
                listaPreguntas[count][0] = result.getString("idpregunta");
                listaPreguntas[count][1] = result.getString("pregunta");
                listaPreguntas[count][2] = result.getString("respuesta_a");
                listaPreguntas[count][3] = result.getString("respuesta_b");
                listaPreguntas[count][4] = result.getString("respuesta_c");
                listaPreguntas[count][5] = result.getString("respuesta_correcta");
                listaPreguntas[count][6] = result.getString("materia");
                count++;
            }
            return listaPreguntas;
        }catch(SQLException e){
            System.out.println("Ocurrio la siguiente excepcion : " + e.toString());
            System.out.close();
        }
       return null;
    } 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Examen baseDatos = new Examen().conectar();
        /*
        String[][] pregunta = new Examen().getPreguntass();
       
        int lon = pregunta.length;
        
        System.out.println("preguntas: " + lon);
        */
        /*
        ArrayList materias = new Examen().getMateria();
        System.out.println("");
       
        Iterator it = materias.iterator();
        while(it.hasNext()){
            Object objeto = it.next();
            materia m = (materia)objeto;
            System.out.println("id: " + m.getIdMateria() + " Materia: " + m.getMateria());
          
            
        }
       */
        login l = new login();
        l.setConexion(conexion);
        l.setVisible(true);
    }
}