/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Model;

/**
 *
 * @author panch
 */
public class Agenda {
    private String agendaCode;
    private String userCode;
    private String agendaDate;
    private String agendaDescription;

    public Agenda() {
        this("","","","");
    }
    
    public Agenda(String agendaCode, String userCode, String agendaDate, String agendaDescription) {
        this.agendaCode = agendaCode;
        this.userCode = userCode;
        this.agendaDate = agendaDate;
        this.agendaDescription = agendaDescription;
    }

    /**
     * @return the agendaCode
     */
    public String getAgendaCode() {
        return agendaCode;
    }

    /**
     * @param agendaCode the agendaCode to set
     */
    public void setAgendaCode(String agendaCode) {
        this.agendaCode = agendaCode;
    }

    /**
     * @return the userCode
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * @param userCode the userCode to set
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * @return the agendaDate
     */
    public String getAgendaDate() {
        return agendaDate;
    }

    /**
     * @param agendaDate the agendaDate to set
     */
    public void setAgendaDate(String agendaDate) {
        this.agendaDate = agendaDate;
    }

    /**
     * @return the agendaDescription
     */
    public String getAgendaDescription() {
        return agendaDescription;
    }

    /**
     * @param agendaDescription the agendaDescription to set
     */
    public void setAgendaDescription(String agendaDescription) {
        this.agendaDescription = agendaDescription;
    }
    
}
