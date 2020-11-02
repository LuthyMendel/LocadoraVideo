package com.br.locadora.dao;




import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;



public class ConnectionMVC {
    
    public Connection getConection() throws InstantiationException, IllegalAccessException{
    
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException e) {
                  
            e.printStackTrace();
            
        }
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/locadora?serverTimezone=UTC", "root", "200924823f");
        } catch (SQLException e) {
            
            e.printStackTrace();
        }

        return conn;
    }
  
}
