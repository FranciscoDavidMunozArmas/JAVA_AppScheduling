/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Controller;

import ec.edu.espe.Config.DBConnection;
import ec.edu.espe.Model.Agenda;
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
public class AgendaAppointmentController {
    
    public Agenda getAgendaByAppointmentID(String appointmentCode){
        Connection conn = null;
        Statement statement = null;
        Agenda agenda = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from agenda join appointment on agenda.agendacode = appointment.appointmentcode where appointment.appointmentcode = '" + appointmentCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
            while((res != null) && (res.next())){
                agenda = new Agenda(res.getString("AGENDACODE"),res.getString("USERCODE"),res.getString("AGENDADATE"),res.getString("AGENDADESCRIPTION"));
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return agenda;
    }
    
    public List<Appointment> getAppointmentByAgendaID(String agendaCode){
        Connection conn = null;
        Statement statement = null;
        List<Appointment> appointmentList = new ArrayList<>();
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from agenda join appointment on agenda.agendacode = appointment.appointmentcode where agenda.agendacode = '" + agendaCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
            while((res != null) && (res.next())){
                //String appointment, String agendaCode, String appointmentStartHour, String appointmentEndHour, String appointmentDays
                appointmentList.add(new Appointment(res.getString("APPOINTMENTCODE"),res.getString("AGENDACODE"),res.getString("APPOINTMENTSTARTHOUR"),res.getString("APPOINTMENTENDHOUR"),res.getString("DIASCITA")));
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return appointmentList;
    }
}
