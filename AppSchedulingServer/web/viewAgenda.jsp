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
        <link rel="stylesheet" href="styleOfPage.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos de la Agenda</h1>

        <table width="800" border="1">
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

    </body>
</html>
