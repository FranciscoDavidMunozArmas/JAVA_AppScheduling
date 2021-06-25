<%-- 
    Document   : saveAppointment
    Created on : 23-jun-2021, 15:07:27
    Author     : Steven
--%>

<%@page import="ec.edu.espe.REST.AppointmentResource"%>
<%@page import="ec.edu.espe.REST.AgendaResource"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="ec.edu.espe.Model.Appointment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <link rel="stylesheet" href="style.css">
        <title>Cita guardada</title>
    </head>
    <body>
        <div class=" wrapper bg-gradient-primary">
            <div class="d-flex justify-content-center">
                <h1>Datos guardados</h1>
            </div>
            <div class="container d-flex justify-content-center" >
                <div class="card">
                    <div class="card-body">
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="createAppointment.jsp"><span class="fa fa-chevron-left"></span> Regresar</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%
        Appointment appointment =new Appointment();
        Gson json = new Gson();
        AppointmentResource appointmentResource= new AppointmentResource();
        appointment.setAppointment(request.getParameter("numberCodeAppointment"));
        appointment.setAgendaCode(request.getParameter("numberAgendaCode"));
        appointment.setAppointmentStartHour(request.getParameter("timeStartHour"));
        appointment.setAppointmentEndHour(request.getParameter("timeEndHour"));
        appointment.setAgendaCode(request.getParameter("txtDayAppointment"));
        json.toJson(appointment);
        appointmentResource.postAppointment(appointment);
    %>
    </body>
</html>
