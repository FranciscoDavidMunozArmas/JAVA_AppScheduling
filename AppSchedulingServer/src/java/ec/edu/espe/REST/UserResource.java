/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.REST;

import ec.edu.espe.Controller.UserController;
import ec.edu.espe.Model.User;
import java.util.List;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author panch
 */
@Path("user")
public class UserResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UserResource
     */
    public UserResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.REST.AgendaResource
     * @return an instance of ec.edu.espe.Model.Agenda
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllUser() {
        UserController userController = new UserController();
        return userController.getAllUser();
    }
    
    @POST
    //@Path("/{content}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public User postUser(User content) {
        UserController userController = new UserController();
        return userController.postUser(content);
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteAllAgenda() {
        UserController userController = new UserController();
        userController.deleteAllUser();
        return "Deleted";
    }

    @GET
    @Path("/{userID}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getAgendaByID(@PathParam("userID")String userID) {
        UserController userController = new UserController();
        return userController.getAllUserByID(userID);
    }

    @DELETE
    @Path("/{userID}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteAgendaByID(@PathParam("userID")String userID) {
        UserController userController = new UserController();
        userController.deleteUserByID(userID);
        return "Deleted";
    }
    
    @GET
    @Path("/name/{userName}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAgendaByName(@PathParam("userName")String userName) {
        UserController userController = new UserController();
        return userController.getAllUserByName(userName);
    }
    
    @DELETE
    @Path("/name/{userName}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteAgendaByName(@PathParam("userName")String userName) {
        UserController userController = new UserController();
        userController.deleteUserByID(userName);
        return "Deleted";
    }
}
