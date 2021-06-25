/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.REST;

import ec.edu.espe.Controller.UserAgendaController;
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
@Path("/useragenda")
public class UseragendaResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UseragendaResource
     */
    public UseragendaResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.REST.UseragendaResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/user/{agendaID}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserByAgendaID(@PathParam("agendaID")String agendaID) {
        UserAgendaController useragenda = new UserAgendaController();
        return useragenda.getUserByAgendaID(agendaID);
    }

    @GET
    @Path("/agenda/{userID}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Agenda> getAgendaByUserID(@PathParam("userID")String userID) {
        UserAgendaController useragenda = new UserAgendaController();
        return useragenda.getAgendaByUserID(userID);
    }
}
