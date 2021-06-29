/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Controller;

import ec.edu.espe.Config.DBConnection;
import ec.edu.espe.Model.Service;
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
 * @author panch
 */
public class ServiceController {
    
    public List<Service> getAllService () {
        Connection conn = null;
        Statement statement = null;
        List<Service> serviceList = new ArrayList<>();
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from service";
            ResultSet res = statement.executeQuery(sql);
            
            while((res != null) && (res.next())){
                serviceList.add(new Service(res.getString("SERVICECODE"),res.getString("SERVICENAME"),res.getString("SERVICEDESCRIPTION")));
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return serviceList;
    }
    
    public Service getServiceByID (String serviceCode) {
        Connection conn = null;
        Statement statement = null;
        Service service = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from service where servicecode = '" + serviceCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
            service = new Service(res.getString("SERVICECODE"),res.getString("SERVICENAME"),res.getString("SERVICEDESCRIPTION"));
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return service;
    }
    
    public Service postService (Service service) {
        Connection conn = null;
        Statement statement = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "insert into service values('" + service.getServiceCode() + "','" + service.getServiceName() + "','" + service.getServiceDescription() + "')";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return service;
    }
    
    public void deleteServiceByID (String serviceCode) {
        Connection conn = null;
        Statement statement = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "delete from service where servicecode = '" + serviceCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteAllService () {
        Connection conn = null;
        Statement statement = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "delete from service";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
