package connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mariane
 */

public class ConnectionFactory {
        
    private static String URL = "jdbc:mysql://localhost:3306/FilmeCinema1";
    private static String USER = "root";
    private static String PASS = "";
    
    public static Connection getConnection() {
        
        try {
            System.out.println("Deu certo!");
            return DriverManager.getConnection(URL, USER, PASS);    
        } 
        catch(SQLException ex) {
            System.out.println("ERRO");
            ex.printStackTrace();
        }
        
        return null;
    }
    
}
