/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Controller;

import ec.edu.espe.Config.DBConnection;
import ec.edu.espe.Model.Employee;
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
public class EmployeeController {
        
    public List<Employee> getAllEmployee () {
        Connection conn = null;
        Statement statement = null;
        List<Employee> employeeList = new ArrayList<>();
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from employee";
            ResultSet res = statement.executeQuery(sql);
            
            while((res != null) && (res.next())){
                employeeList.add(new Employee(res.getString("EMPLOYEECODE"),res.getString("EMPLOYEENAME")));
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return employeeList;
    }
    
    public Employee getAllEmployeeByID (String employeeCode) {
        Connection conn = null;
        Statement statement = null;
        Employee employee = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from employee where employeecode = '" + employeeCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
            employee = new Employee(res.getString("EMPLOYEECODE"),res.getString("EMPLOYEENAME"));
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return employee;
    }
    
    public Employee postEmployee (Employee employee) {
        Connection conn = null;
        Statement statement = null;
        List<Employee> employeeList = new ArrayList<>();
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "insert into employee values('" + employee.getEmployeeCode() + "','" + employee.getEmployeeName() + "')";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return employee;
    }
    
    public void deleteEmployeeByID (String employeeCode) {
        Connection conn = null;
        Statement statement = null;
        Employee employee = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "delete from employee where employeecode = '" + employeeCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteAllEmployee () {
        Connection conn = null;
        Statement statement = null;
        Employee employee = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "delete from employee";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
