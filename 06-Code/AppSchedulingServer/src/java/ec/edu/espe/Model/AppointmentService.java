/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Model;

/**
 *
 * @author bryan
 */
public class AppointmentService {
    private String appointmentCode;
    private String serviceCode;   
    
    public AppointmentService() {
        this("","");
    }

    public AppointmentService(String appointmentCode, String serviceCode) {
        this.appointmentCode = appointmentCode;
        this.serviceCode = serviceCode;
    }

    /**
     * @return the appointmentCode
     */
    public String getAppointmentCode() {
        return appointmentCode;
    }

    /**
     * @param appointmentCode the appointmentCode to set
     */
    public void setAppointmentCode(String appointmentCode) {
        this.appointmentCode = appointmentCode;
    }

    /**
     * @return the serviceCode
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * @param serviceCode the serviceCode to set
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }    
}
