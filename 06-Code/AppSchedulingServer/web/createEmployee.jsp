<%-- 
    Document   : createEmployee
    Created on : 24/06/2021, 18:12:14
    Author     : Sashael
--%>

<%@page import="com.google.gson.Gson"%>
<%@page import="ec.edu.espe.REST.EmployeeResource"%>
<%@page import="ec.edu.espe.Controller.EmployeeController"%>
<%@page import="ec.edu.espe.Model.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Create User</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <link rel="stylesheet" href="style.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="validation.js"></script>
    </head>
    <body>
        <div class=" wrapper bg-gradient-primary">
            <div class="d-flex justify-content-center">
                <h1>Crear Empleado</h1>
            </div>
            <div class="container d-flex justify-content-center" >
                <div class="card">
                    <div class="card-body">
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="pageStart.jsp"><span class="fa fa-chevron-left"></span> Regresar</a>
                        </div>
                        <form action="saveEmployee.jsp" method="POST" class="form-container" >
                            <div class="form-group">
                                <label for="numberCodeEmployee">Código Empleado</label>
                                <input class="form-control" placeholder="Código Empleado" type="text" name="numberCodeEmployee">
                            </div>
                            <div class="form-group">
                                <label for="textEmployeeName">Nombre Empleado</label>
                                <input class="form-control" placeholder="Nombre Empleado" type="text" name="textEmployeeName">
                            </div>
                            <input class="btn btn-primary btn-block" type="submit" value="Crear Empleado"/>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="float-right-bottom">
            <a href="createLogin.jsp" class="btn btn-primary btn-float" data-toggle="tooltip" data-placement="top" title="Log out"><span class="fa fa-power-off"></span></a>
        </div>
    </body>
</html>
