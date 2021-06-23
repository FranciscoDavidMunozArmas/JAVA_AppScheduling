/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.REST;

import ec.edu.espe.Controller.ServiceEmployeeController;
import ec.edu.espe.Model.ServiceEmployee;
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
@Path("serviceemployee")
public class ServiceemployeeResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ServiceemployeeResource
     */
    public ServiceemployeeResource() {
    }
    /**
     * Retrieves representation of an instance of ec.edu.espe.REST.ServiceemployeeResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ServiceEmployee> getAllServiceEmployee() {
        ServiceEmployeeController serviceEmployeeController = new ServiceEmployeeController();
        return serviceEmployeeController.getAllServiceEmployee();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ServiceEmployee postServiceEmployee(ServiceEmployee content) {
        ServiceEmployeeController serviceEmployeeController = new ServiceEmployeeController();
        return serviceEmployeeController.postServiceEmployee(content);
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteAllService() {
        ServiceEmployeeController serviceEmployeeController = new ServiceEmployeeController();
        serviceEmployeeController.deleteAllServiceEmployee();
        return "Deleted";
    }

    @GET
    @Path("/{serviceID}")
    @Produces(MediaType.APPLICATION_JSON)
    public ServiceEmployee getServiceByID(@PathParam("serviceID")String serviceID) {
        ServiceEmployeeController serviceEmployeeController = new ServiceEmployeeController();
        return serviceEmployeeController.getServiceEmployeeByID(serviceID);
    }    

    @DELETE
    @Path("/{serviceID}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteServiceByID(@PathParam("serviceID")String serviceID) {
        ServiceEmployeeController serviceEmployeeController = new ServiceEmployeeController();
        serviceEmployeeController.deleteServiceEmployeeByID(serviceID);
        return "Deleted";
    }  
}
