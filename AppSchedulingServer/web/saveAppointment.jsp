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
        <title>Appointment Save Information</title>
    </head>
    <body>
        <h1>Datos Guardados</h1>
        <%
        Appointment appointment =new Appointment();
        Gson json = new Gson();
        AppointmentResource appointmentResource= new AppointmentResource();
        appointment.setAppointment(request.getParameter("numberCodeAppointment"));
        appointment.setAgendaCode(request.getParameter("numberAgednaCode"));
        appointment.setAppointmentStartHour(request.getParameter("timeStartHour"));
        appointment.setAppointmentEndHour(request.getParameter("timeEndHour"));
        appointment.setAgendaCode(request.getParameter("txtDayAppointment"));
        json.toJson(appointment);
        appointmentResource.postAgenda(appointment);
        out.println("Los datos de la funcion se han guardado con exito");
    
    %>
    </body>
</html>
