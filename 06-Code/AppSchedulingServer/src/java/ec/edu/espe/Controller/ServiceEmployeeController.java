
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Controller;

import ec.edu.espe.Config.DBConnection;
import ec.edu.espe.Model.ServiceEmployee;
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
public class ServiceEmployeeController {
    public List<ServiceEmployee> getAllServiceEmployee () {
        Connection conn = null;
        Statement statement = null;
        List<ServiceEmployee> serviceEmployeeList = new ArrayList<>();
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from serviceemployee";
            ResultSet res = statement.executeQuery(sql);
            
            while((res != null) && (res.next())){
                serviceEmployeeList.add(new ServiceEmployee(res.getString("SERVICECODE"),res.getString("EMPLOYEECODE")));
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return serviceEmployeeList;
    }
    
    public ServiceEmployee getServiceEmployeeByID (String serviceCode) {
        Connection conn = null;
        Statement statement = null;
        ServiceEmployee serviceEmployee = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from serviceemployee where servicecode = '" + serviceCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
            serviceEmployee = new ServiceEmployee(res.getString("SERVICECODE"),res.getString("EMPLOYEECODE"));
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return serviceEmployee;
    }
    
    public ServiceEmployee postServiceEmployee (ServiceEmployee serviceEmployee) {
        Connection conn = null;
        Statement statement = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "insert into serviceemployee values('" + serviceEmployee.getServiceCode() + "','" + serviceEmployee.getEmployeeCode() + "')";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return serviceEmployee;
    }
    
    public void deleteServiceEmployeeByID (String serviceCode) {
        Connection conn = null;
        Statement statement = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "delete from serviceemployee where servicecode = '" + serviceCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteAllServiceEmployee () {
        Connection conn = null;
        Statement statement = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "delete from serviceemployee";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
