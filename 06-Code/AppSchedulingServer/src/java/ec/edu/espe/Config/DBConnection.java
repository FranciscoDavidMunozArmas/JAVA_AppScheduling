/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author panch
 */
public class DBConnection {
    
    public Connection getDBConnection(){
        Connection conn = null;
        String path = "C:\\Users\\panch\\Documents\\NetBeansProjects\\AppSchedulingServer\\src\\java\\ec\\edu\\espe\\Config\\config.json";
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mariadb://" + Config.readConfig(path, "SQL_HOST") + ":" 
                    + Config.readConfig(path, "SQL_PORT") + "/" 
                    + Config.readConfig(path, "SQL_NAME")
                    + "?user=" + Config.readConfig(path, "SQL_USER")
                    + "&password=" + Config.readConfig(path, "SQL_PASSWORD"));
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
}
