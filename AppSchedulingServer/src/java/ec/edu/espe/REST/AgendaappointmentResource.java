/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.REST;

import ec.edu.espe.Controller.AgendaAppointmentController;
import ec.edu.espe.Model.*;
import java.util.List;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author panch
 */
@Path("agendaappointment")
public class AgendaappointmentResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AgendaappointmentResource
     */
    public AgendaappointmentResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.REST.AgendaappointmentResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/user/{appointmetID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Agenda getAgendaByAppointmentID(@PathParam("appointmetID")String appointmetID) {
        AgendaAppointmentController useragenda = new AgendaAppointmentController();
        return useragenda.getAgendaByAppointmentID(appointmetID);
    }

    @GET
    @Path("/agenda/{agendaID}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Appointment> getAgendaByUserID(@PathParam("agendaID")String agendaID) {
        AgendaAppointmentController useragenda = new AgendaAppointmentController();
        return useragenda.getAppointmentByAgendaID(agendaID);
    }
}
