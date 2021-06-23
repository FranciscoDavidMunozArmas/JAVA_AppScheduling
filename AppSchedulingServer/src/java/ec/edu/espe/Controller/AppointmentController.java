/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Controller;

import ec.edu.espe.DB.DBConnection;
import ec.edu.espe.Model.Appointment;
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
public class AppointmentController {
    
    public List<Appointment> getAllAppointment () {
        Connection conn = null;
        Statement statement = null;
        List<Appointment> appointmentList = new ArrayList<>();
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from appointment";
            ResultSet res = statement.executeQuery(sql);
            
            while((res != null) && (res.next())){
                appointmentList.add(new Appointment(res.getString("APPOINTMENTCODE"),res.getString("AGENDACODE"),res.getString("APPOINTMENTSTARTHOUR"),res.getString("APPOINTMENTENDHOUR"),res.getString("DIASCITA")));
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return appointmentList;
    }
    
    public Appointment getAppointmentByID (String appointmentCode) {
        Connection conn = null;
        Statement statement = null;
        Appointment appointment = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from appointment where appointmentcode = '" + appointmentCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
            appointment = new Appointment(res.getString("APPOINTMENTCODE"),res.getString("AGENDACODE"),res.getString("APPOINTMENTSTARTHOUR"),res.getString("APPOINTMENTENDHOUR"),res.getString("DIASCITA"));
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return appointment;
    }
    
    public Appointment postAppointment (Appointment appointment) {
        Connection conn = null;
        Statement statement = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            // HH:MI:SS
            String sql = "insert into appointment values('" + appointment.getAppointment() + "','" + appointment.getAgendaCode() + "','" + appointment.getAppointmentStartHour()+ "', '" + appointment.getAppointmentEndHour()+ "', '" + appointment.getAppointmentDays()+ "')";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return appointment;
    }
    
    public void deleteAppointmentByID (String appointmentCode) {
        Connection conn = null;
        Statement statement = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "delete from appointment where appointmentcode = '" + appointmentCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteAllAppointment () {
        Connection conn = null;
        Statement statement = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "delete from appointment";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
