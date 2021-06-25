<%-- 
    Document   : viewAgenda
    Created on : 23-jun-2021, 16:36:12
    Author     : Steven
--%>

<%@page import="ec.edu.espe.Model.Agenda"%>
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
        <title>Vista Agenda</title>
    </head>
    <body>
        <div class=" wrapper bg-gradient-primary">
            <div class="d-flex justify-content-center">
                <h1>Datos Agenda</h1>
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
                                        Fecha
                                    </th>
                                    <th>
                                        Descripcion
                                    </th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    AgendaResource agendaResource = new AgendaResource();
                                    for (Agenda agenda : agendaResource.getAll()) {

                                %>

                                <tr>
                                    <td>
                                        <%=agenda.getAgendaDate()%>
                                    </td>
                                    <td>
                                        <%=agenda.getAgendaDescription()%>
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
    </body>
</html>
