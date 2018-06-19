/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.estudiante.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SENA
 */
public class Conexion {
    private static Conexion conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/Estudiantes";
    
    public Conexion (){
        conn = null;
        try{
            Class.forName(driver);
            conn = (Conexion) DriverManager.getConnection(url, user, password);
            if(conn !=null){
                System.out.println("Conexion establecida");
            }
        } catch (ClassNotFoundException |SQLException e){
            
        }
    }

    Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
