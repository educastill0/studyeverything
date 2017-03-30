/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import clases.materia;
import clases.pregunta;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author SIMGE
 */
public class Examen {

  
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

    public ArrayList getPregunta(int idmateria) {
        ArrayList listaPreguntas=new ArrayList();
        try{
            PreparedStatement consulta1 = conexion.prepareStatement("select idpregunta,pregunta,respuesta_a,respuesta_b,respuesta_c,respuesta_correcta from tpreguntas where idmateria = " + idmateria + "order by rand()");
            ResultSet result1;
            result1 = consulta1.executeQuery();
            while(result1.next()){
                int idpregunta = result1.getInt("idpregunta");
                String pregunta = result1.getString("pregunta");
                String respuesta_a = result1.getString("respuesta_a");
                String respuesta_b = result1.getString("respuesta_b");
                String respuesta_c = result1.getString("respuesta_c");
                String respuesta_correcta = result1.getString("respuesta_correcta");

                //Creas un objeto del tipo que te estas trayendo de la bd, en mi caso, un objeto Persona

                pregunta x = new pregunta(idpregunta,pregunta,respuesta_a,respuesta_b,respuesta_c,respuesta_correcta);//le mandas los parametros necesarios al constructor del Bean Persona. 

                listaPreguntas.add(x); //agregas ese objeto a la lista
            }
            return listaPreguntas;
        }catch(SQLException e){
            System.out.println("Ocurrio la siguiente excepcion : " + e.toString());
            System.out.close();
        }
       return null;
    }  
    
        public ArrayList getMateria() {
        ArrayList listaMaterias=new ArrayList();
        try{
            PreparedStatement consulta = conexion.prepareStatement("Select idmateria,materia from tmaterias order by idmateria");
            ResultSet result;
            result = consulta.executeQuery();
            while(result.next()){
                int idmateria = result.getInt("idmateria");
                String materia = result.getString("materia");

                //Creas un objeto del tipo que te estas trayendo de la bd, en mi caso, un objeto Persona

                materia x = new materia(idmateria,materia);//le mandas los parametros necesarios al constructor del Bean Persona. 

                listaMaterias.add(x); //agregas ese objeto a la lista
            }
            return listaMaterias;
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
        ArrayList materias = new Examen().getMateria();
        Examen baseDatos = new Examen().conectar();
        Iterator it = materias.iterator();
        while(it.hasNext()){
            Object objeto = it.next();
            materia materia = (materia)objeto;
            System.out.println(materia);
        }
        login l = new login();
        l.setConexion(conexion);
        l.setVisible(true);
    }
    



}


