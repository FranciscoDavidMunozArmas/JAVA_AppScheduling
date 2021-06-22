/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.REST;

import ec.edu.espe.Controller.AgendaController;
import ec.edu.espe.Model.Agenda;
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
@Path("agenda")
public class AgendaResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AgendaResource
     */
    public AgendaResource() {
    }
    
    /**
     * Retrieves representation of an instance of ec.edu.espe.REST.AgendaResource
     * @return an instance of ec.edu.espe.Model.Agenda
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Agenda> getAll() {
        AgendaController agendaController = new AgendaController();
        return agendaController.getAllAgenda();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Agenda postAgenda(Agenda agenda) {
        AgendaController agendaController = new AgendaController();
        return agendaController.postAgenda(agenda);
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteAllAgenda() {
        AgendaController agendaController = new AgendaController();
        agendaController.deleteAllAgenda();
        return "Deleted";
    }

    @GET
    @Path("/{agendaID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Agenda getAgendaByID(@PathParam("agendaID")String agendaID) {
        AgendaController agendaController = new AgendaController();
        return agendaController.getAgendaByID(agendaID);
    }

    @DELETE
    @Path("/{agendaID}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteAgendaByID(@PathParam("agendaID")String agendaID) {
        AgendaController agendaController = new AgendaController();
        agendaController.deleteAgendaByID(agendaID);
        return "Deleted all";
    }
}
