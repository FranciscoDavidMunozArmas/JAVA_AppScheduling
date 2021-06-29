/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Controller;

import ec.edu.espe.Config.DBConnection;
import ec.edu.espe.Model.AppointmentService;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bryan
 */
public class AppointmentServiceController {
    public List<AppointmentService> getAllAppointmentService () {
        Connection conn = null;
        Statement statement = null;
        List<AppointmentService> appointmentServiceList = new ArrayList<>();
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from appointmentservice";
            ResultSet res = statement.executeQuery(sql);
            
            while((res != null) && (res.next())){
                appointmentServiceList.add(new AppointmentService(res.getString("APPOINTMENTCODE"),res.getString("SERVICECODE")));
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return appointmentServiceList;
    }
    
    public AppointmentService getAppointmentServiceByID (String appointmentCode) {
        Connection conn = null;
        Statement statement = null;
        AppointmentService appointmentService = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from appointmentservice where appointmentcode = '" + appointmentCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
            appointmentService = new AppointmentService(res.getString("APPOINTMENTCODE"),res.getString("SERVICECODE"));
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return appointmentService;
    }
    
    public AppointmentService postAppointmentService (AppointmentService appointmentService) {
        Connection conn = null;
        Statement statement = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "insert into appointmentservice values('" + appointmentService.getAppointmentCode() + "','" + appointmentService.getServiceCode() + "')";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return appointmentService;
    }
    
    public void deleteAppointmentServiceByID (String appointmentCode) {
        Connection conn = null;
        Statement statement = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "delete from appointmentservice where appointmentcode = '" + appointmentCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteAllAppointmentService () {
        Connection conn = null;
        Statement statement = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "delete from appointmentservice";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
