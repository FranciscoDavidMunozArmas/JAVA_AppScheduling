/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.DB;

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
    
    private final String SQL_HOST = "localhost";
    private final String SQL_NAME = "appscheduling";
    private final String SQL_USER = "root";
    //David
    private final String SQL_PASSWORD = "12345";
    //Bryan
    //private final String SQL_PASSWORD = "bajd1726";
    //Steven
    //private final String SQL_PASSWORD = "steven03";
    
    public Connection getDBConnection(){
        Connection conn = null;
        
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mariadb://" + this.SQL_HOST + ":3306/" + this.SQL_NAME
                    + "?user=" + this.SQL_USER + "&password=" + this.SQL_PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
}
