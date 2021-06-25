<%-- 
    Document   : viewAppointment
    Created on : 23-jun-2021, 17:20:30
    Author     : Steven
--%>

<%@page import="ec.edu.espe.Model.Agenda"%>
<%@page import="ec.edu.espe.Model.Appointment"%>
<%@page import="ec.edu.espe.REST.AppointmentResource"%>
<%@page import="ec.edu.espe.REST.AgendaResource"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <link rel="stylesheet" href="style.css">
        <title>Ver cita</title>
    </head>
    <body>
        <div class=" wrapper bg-gradient-primary">
            <div class="d-flex justify-content-center">
                <h1>Datos de las cita</h1>
            </div>
            <div class="container d-flex justify-content-center" >
                <div class="card">
                    <div class="card-body">
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="pageStart.jsp"><span class="fa fa-chevron-left"></span> Regresar</a>
                        </div>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>
                                        Día
                                    </th>
                                    <th>
                                        Hora de inicio
                                    </th>
                                    <th>
                                        Hora de finalización
                                    </th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    AppointmentResource appointmentResource = new AppointmentResource();
                                    for (Appointment appointment : appointmentResource.getAll()) {

                                %>

                                <tr>
                                    <td>
                                        <%=appointment.getAppointmentDays()%>
                                    </td>
                                    <td>
                                        <%=appointment.getAppointmentStartHour()%>
                                    </td>
                                    <td>
                                        <%=appointment.getAppointmentEndHour()%>
                                    </td>
                                </tr>
                                <%  }

                                %>
                            </tbody>

                        </table>
                    </div>
                </div>
            </div>
        </div>
                            
        <div class="float-right-bottom">
            <a href="createLogin.jsp" class="btn btn-primary btn-float" data-toggle="tooltip" data-placement="top" title="Log out"><span class="fa fa-power-off"></span></a>
        </div>
    </body>
</html>
