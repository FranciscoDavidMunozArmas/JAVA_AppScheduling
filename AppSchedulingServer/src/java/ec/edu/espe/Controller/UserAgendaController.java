/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Controller;
import ec.edu.espe.DB.DBConnection;
import ec.edu.espe.Model.User;
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
public class UserAgendaController {
    
    public User getUserByAgendaID(String agendaCode){
        Connection conn = null;
        Statement statement = null;
        User user = null;
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from user join agenda on user.usercode = agenda.usercode where agenda.agendacode = '" + agendaCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
            while((res != null) && (res.next())){
                user = new User(res.getString("USERCODE"),res.getString("USERNAME"),res.getString("USERPASSWORD"));
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user;
    }
    
    public List<Agenda> getAgendaByUserID(String userCode){
        Connection conn = null;
        Statement statement = null;
        List<Agenda> agendaList = new ArrayList<>();
        
        DBConnection dbConnection = new DBConnection();
        try{
            conn = dbConnection.getDBConnection();
            statement = conn.createStatement();
            
            String sql = "select * from user join agenda on user.usercode = agenda.usercode where user.usercode = '" + userCode + "'";
            ResultSet res = statement.executeQuery(sql);
            
            while((res != null) && (res.next())){
                agendaList.add(new Agenda(res.getString("AGENDACODE"),res.getString("USERCODE"),res.getString("AGENDADATE"),res.getString("AGENDADESCRIPTION")));
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return agendaList;
    }
}
