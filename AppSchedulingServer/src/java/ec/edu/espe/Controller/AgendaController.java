/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Controller;

import ec.edu.espe.DB.DBConnection;
import ec.edu.espe.Model.Agenda;
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
public class AgendaController {
    
    public List<Agenda> getAllAgenda () {
        Connection conn = null;
        Statement statement = null;
        List<Agenda> agendaList = new ArrayList<>();
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from agenda";
            ResultSet res = statement.executeQuery(sql);
            
            while((res != null) && (res.next())){
                agendaList.add(new Agenda(res.getString("AGENDACODE"),res.getString("USERCODE"),res.getString("AGENDADATE"),res.getString("AGENDADESCRIPTION")));
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return agendaList;
    }
    
    public Agenda getAgendaByID (String agendaCode) {
        Connection conn = null;
        Statement statement = null;
        Agenda agenda = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from agenda where agendacode = '" + agendaCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
            agenda = new Agenda(res.getString("AGENDACODE"),res.getString("USERCODE"),res.getString("AGENDADATE"),res.getString("AGENDADESCRIPTION"));
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return agenda;
    }
    
    public Agenda postAgenda (Agenda agenda) {
        Connection conn = null;
        Statement statement = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "insert into agenda values('" + agenda.getAgendaCode() + "','" + agenda.getUserCode() + "','" + agenda.getAgendaDate() + "','" + agenda.getAgendaDescription() + "')";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return agenda;
    }
    
    public void deleteAgendaByID (String agendaCode) {
        Connection conn = null;
        Statement statement = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "delete from agenda where agendacode = '" + agendaCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteAllAgenda () {
        Connection conn = null;
        Statement statement = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "delete from agenda";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
