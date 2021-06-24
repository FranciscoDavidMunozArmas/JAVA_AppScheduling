<%-- 
    Document   : saveAgenda
    Created on : 23-jun-2021, 14:33:07
    Author     : Steven
--%>

<%@page import="ec.edu.espe.REST.AgendaResource"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="ec.edu.espe.Model.Agenda"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styleOfPage.css">
        <link rel="stylesheet" href="styleOfPage.css">
        <title>Agenda Guardada</title>
    </head>
    <body>
        <h1>App Scheduling</h1>
        <%
        Agenda agenda =new Agenda();
        Gson json = new Gson();
        AgendaResource agendaResource = new AgendaResource();
        agenda.setAgendaCode(request.getParameter("numberCodeAgenda"));
        agenda.setUserCode(request.getParameter("numberUserCode"));
        agenda.setAgendaDate(request.getParameter("dateAgenda"));
        agenda.setAgendaDescription(request.getParameter("description"));
        json.toJson(agenda);
        agendaResource.postAgenda(agenda);
        out.println("Los datos de la funcion se han guardado con exito");
    
    %>
    </body>
</html>
