/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.REST;

import ec.edu.espe.Controller.EmployeeController;
import ec.edu.espe.Model.Employee;
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
@Path("employee")
public class EmployeeResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of EmployeeResource
     */
    public EmployeeResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.REST.EmployeeResource
     * @return an instance of ec.edu.espe.Model.Employee
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getAll() {
        EmployeeController employeeController = new EmployeeController();
        return employeeController.getAllEmployee();
    }
    
    /*@POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Employee postEmployee(@PathParam("employee")Employee employee) {
        EmployeeController employeeController = new EmployeeController();
        return employeeController.postEmployee(employee);
    }*/

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteAllAgenda() {
        EmployeeController employeeController = new EmployeeController();
        employeeController.deleteAllEmployee();
        return "Deleted";
    }

    @GET
    @Path("/{employeeID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getAgendaByID(@PathParam("employeeID")String employeeID) {
        EmployeeController employeeController = new EmployeeController();
        return employeeController.getAllEmployeeByID(employeeID);
    }

    @DELETE
    @Path("/{employeeID}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteAgendaByID(@PathParam("employeeID")String employeeID) {
        EmployeeController employeeController = new EmployeeController();
        employeeController.deleteEmployeeByID(employeeID);
        return "Deleted all";
    }
}
