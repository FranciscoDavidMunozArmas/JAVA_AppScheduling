/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Controller;

import ec.edu.espe.DB.DBConnection;
import ec.edu.espe.Model.User;
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
public class UserController {
    
    public UserController() { }
    
    public List<User> getAllUser () {
        Connection conn = null;
        Statement statement = null;
        List<User> userList = new ArrayList<>();
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from user";
            ResultSet res = statement.executeQuery(sql);
            
            while((res != null) && (res.next())){
                userList.add(new User(res.getString("USERCODE"),res.getString("USERNAME"),res.getString("USERPASSWORD")));
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return userList;
    }
    
    public User getAllUserByID (String userCode) {
        Connection conn = null;
        Statement statement = null;
        User user = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from user where usercode= '" + userCode + "'";
            System.out.println(sql);
            ResultSet res = statement.executeQuery(sql);
            
            while((res != null) && (res.next())){
                user = new User(res.getString("USERCODE"),res.getString("USERNAME"),res.getString("USERPASSWORD"));
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user;
    }
    
    public List<User> getAllUserByName (String userName) {
        Connection conn = null;
        Statement statement = null;
        List<User> userList = new ArrayList<>();
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from user where username = '" + userName + "'";
            ResultSet res = statement.executeQuery(sql);
            
            while((res != null) && (res.next())){
                userList.add(new User(res.getString("USERCODE"),res.getString("USERNAME"),res.getString("USERPASSWORD")));
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return userList;
    }
    
    public User postUser (User user) {
        Connection conn = null;
        Statement statement = null;
        List<User> userList = new ArrayList<>();
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "insert into user values('" + user.getUserCode() + "','" + user.getUserName() + "','" + user.getUserPassword() + "')";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user;
    }
    
    public void deleteUserByID (String userCode) {
        Connection conn = null;
        Statement statement = null;
        User user = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "delete from user where usercode = '" + userCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteUserByName (String userName) {
        Connection conn = null;
        Statement statement = null;
        User user = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "delete from user where username = '" + userName + "'";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteAllUser () {
        Connection conn = null;
        Statement statement = null;
        User user = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "delete from user";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
