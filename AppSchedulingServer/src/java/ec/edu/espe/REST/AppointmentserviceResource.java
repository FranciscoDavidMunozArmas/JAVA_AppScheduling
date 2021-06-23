/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.REST;

import ec.edu.espe.Controller.AppointmentServiceController;
import ec.edu.espe.Model.AppointmentService;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author bryan
 */
@Path("appointmentservice")
public class AppointmentserviceResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AppointmentserviceResource
     */
    public AppointmentserviceResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.REST.AppointmentserviceResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<AppointmentService> getAllAppointmentService() {
        AppointmentServiceController appointmentServiceController = new AppointmentServiceController();
        return appointmentServiceController.getAllAppointmentService();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public AppointmentService postAppointmentService(AppointmentService content) {
        AppointmentServiceController appointmentServiceController = new AppointmentServiceController();
        return appointmentServiceController.postAppointmentService(content);
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteAllAppointmentService() {
        AppointmentServiceController appointmentServiceController = new AppointmentServiceController();
        appointmentServiceController.deleteAllAppointmentService();
        return "Deleted";
    }

    @GET
    @Path("/{appointmentID}")
    @Produces(MediaType.APPLICATION_JSON)
    public AppointmentService getAppointmentServiceByID(@PathParam("appointmentID")String appointmentID) {
        AppointmentServiceController appointmentServiceController = new AppointmentServiceController();
        return appointmentServiceController.getAppointmentServiceByID(appointmentID);
    }    

    @DELETE
    @Path("/{appointmentID}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteAppointmentServiceByID(@PathParam("appointmentID")String appointmentID) {
        AppointmentServiceController appointmentServiceController = new AppointmentServiceController();
        appointmentServiceController.deleteAppointmentServiceByID(appointmentID);
        return "Deleted";
    }
}
