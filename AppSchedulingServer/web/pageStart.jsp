<%-- 
    Document   : pageStart
    Created on : 23-jun-2021, 17:27:21
    Author     : Steven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <link rel="stylesheet" href="style.css">
    </head>
    
    <body>
        <div class=" wrapper bg-gradient-primary">
            <div class="d-flex justify-content-center">
                <h1>App Scheduling</h1>
            </div>
            <div class="container d-flex justify-content-center" >
                <div class="card">
                    <div class="card-body">
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="createEmployee.jsp"> Crear Empleado</a>

                        </div>
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="createAgenda.jsp"> Crear Agenda</a>

                        </div>
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="createService.jsp">Crear Servicio</a>    
                        </div>                        
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="createAppointment.jsp"> Crear Cita</a>
                        </div>
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="viewAgenda.jsp"> Ver Agenda</a>
                        </div>
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="viewAppointment.jsp">Ver Cita</a>

                        </div>
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="viewEmployee.jsp">Ver Empleado</a>

                        </div>
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="viewService.jsp">Ver Servicios</a>    
                        </div>
                        
                    </div>
                </div>
            </div>
        </div>


        <div class="float-right-bottom">
            <a href="createLogin.jsp" class="btn btn-primary btn-float" data-toggle="tooltip" data-placement="top" title="Log out"><span class="fa fa-power-off"></span></a>
        </div>
    </body>
</html>
