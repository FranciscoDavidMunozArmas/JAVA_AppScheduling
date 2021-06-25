<%-- 
    Document   : saveEmployee
    Created on : 24/06/2021, 19:35:46
    Author     : Sashael
--%>

<%@page import="ec.edu.espe.REST.EmployeeResource"%>
<%@page import="ec.edu.espe.Model.Employee"%>
<%@page import="com.google.gson.Gson"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <link rel="stylesheet" href="style.css">
        <title>User Employee Information</title>
    </head>
    <body>
        <div class=" wrapper bg-gradient-primary">
            <div class="d-flex justify-content-center">
                <h1>Datos Guardados con exito</h1>
            </div>
            <div class="container d-flex justify-content-center" >
                <div class="card">
                    <div class="card-body">
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="createEmployee.jsp"><span class="fa fa-chevron-left"></span> Regresar</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%
        Employee employee =new Employee();
        Gson json = new Gson();
        EmployeeResource employeeResource= new EmployeeResource();
        employee.setEmployeeCode(request.getParameter("numberCodeEmployee"));
        employee.setEmployeeName(request.getParameter("textEmployeeName"));
        json.toJson(employee);
        employeeResource.postEmployee(employee);
    %>
    </body>
</html>