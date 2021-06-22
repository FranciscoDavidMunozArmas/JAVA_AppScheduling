/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.REST;

import ec.edu.espe.Controller.AppointmentController;
import ec.edu.espe.Model.Appointment;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author panch
 */
@Path("appointment")
public class AppointmentResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AppointmentResource
     */
    public AppointmentResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.Model.AppointmentResource
     * @return an instance of ec.edu.espe.Model.Appointment
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Appointment> getAll() {
        AppointmentController appointmentController = new AppointmentController();
        return appointmentController.getAllAppointment();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Appointment postAgenda(Appointment appointment) {
        AppointmentController appointmentController = new AppointmentController();
        return appointmentController.postAppointment(appointment);
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteAllAgenda() {
        AppointmentController appointmentController = new AppointmentController();
        appointmentController.deleteAllAppointment();
        return "Deleted";
    }

    @GET
    @Path("/{appointmentID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Appointment getAgendaByID(@PathParam("appointmentID")String appointmentID) {
        AppointmentController appointmentController = new AppointmentController();
        return appointmentController.getAppointmentByID(appointmentID);
    }

    @DELETE
    @Path("/{appointmentID}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteAgendaByID(@PathParam("appointmentID")String appointmentID) {
        AppointmentController appointmentController = new AppointmentController();
        appointmentController.deleteAppointmentByID(appointmentID);
        return "Deleted all";
    }
}
