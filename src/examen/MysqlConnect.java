/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Fam.GTZ And MTZ
 */
class MysqlConnect {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection coon=DriverManager.getConnection("jdbc:mysql://localhost:3306/datos","root","6461605611");
            //JOptionPane.showMessageDialog(null,"Connected to database");
            return coon;
        }
        
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
    } 
        
    }
    
}

