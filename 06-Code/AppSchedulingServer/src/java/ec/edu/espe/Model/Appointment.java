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
public class Appointment {
    private String appointment;
    private String agendaCode;
    private String appointmentStartHour;
    private String appointmentEndHour;
    private String appointmentDays;

    public Appointment() {
        this("","","","","");
    }
    
    public Appointment(String appointment, String agendaCode, String appointmentStartHour, String appointmentEndHour, String appointmentDays) {
        this.appointment = appointment;
        this.agendaCode = agendaCode;
        this.appointmentStartHour = appointmentStartHour;
        this.appointmentEndHour = appointmentEndHour;
        this.appointmentDays = appointmentDays;
    }

    /**
     * @return the appointment
     */
    public String getAppointment() {
        return appointment;
    }

    /**
     * @param appointment the appointment to set
     */
    public void setAppointment(String appointment) {
        this.appointment = appointment;
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
     * @return the appointmentStartHour
     */
    public String getAppointmentStartHour() {
        return appointmentStartHour;
    }

    /**
     * @param appointmentStartHour the appointmentStartHour to set
     */
    public void setAppointmentStartHour(String appointmentStartHour) {
        this.appointmentStartHour = appointmentStartHour + ":00";
    }

    /**
     * @return the appointmentEndHour
     */
    public String getAppointmentEndHour() {
        return appointmentEndHour;
    }

    /**
     * @param appointmentEndHour the appointmentEndHour to set
     */
    public void setAppointmentEndHour(String appointmentEndHour) {
        this.appointmentEndHour = appointmentEndHour + ":00";
    }

    /**
     * @return the appointmentDays
     */
    public String getAppointmentDays() {
        return appointmentDays;
    }

    /**
     * @param appointmentDays the appointmentDays to set
     */
    public void setAppointmentDays(String appointmentDays) {
        this.appointmentDays = appointmentDays;
    }
}
