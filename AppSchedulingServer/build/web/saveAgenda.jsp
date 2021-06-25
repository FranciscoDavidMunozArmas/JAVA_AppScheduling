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
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <link rel="stylesheet" href="style.css">
        <title>Agenda Guardada</title>
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
                            <a class='btn btn-primary btn-block' href="createAgenda.jsp"><span class="fa fa-chevron-left"></span> Regresar</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
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
    
    %>
    </body>
</html>
