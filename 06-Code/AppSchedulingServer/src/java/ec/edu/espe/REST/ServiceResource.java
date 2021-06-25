/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.REST;

import ec.edu.espe.Controller.ServiceController;
import ec.edu.espe.Model.Service;
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
@Path("service")
public class ServiceResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ServiceResource
     */
    public ServiceResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.REST.ServiceResource
     * @return an instance of ec.edu.espe.Model.Service
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Service> getAll() {
        ServiceController serviceController = new ServiceController();
        return serviceController.getAllService();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Service postService(Service service) {
        ServiceController serviceController = new ServiceController();
        return serviceController.postService(service);
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteAllAgenda() {
        ServiceController serviceController = new ServiceController();
        serviceController.deleteAllService();
        return "Deleted";
    }

    @GET
    @Path("/{serviceID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Service getAgendaByID(@PathParam("serviceID")String serviceID) {
        ServiceController serviceController = new ServiceController();
        return serviceController.getServiceByID(serviceID);
    }

    @DELETE
    @Path("/{serviceID}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteAgendaByID(@PathParam("serviceID")String serviceID) {
        ServiceController serviceController = new ServiceController();
        serviceController.deleteServiceByID(serviceID);
        return "Deleted all";
    }
}
