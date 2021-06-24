<%-- 
    Document   : viewAppointment
    Created on : 23-jun-2021, 17:20:30
    Author     : Steven
--%>

<%@page import="ec.edu.espe.Model.Appointment"%>
<%@page import="ec.edu.espe.REST.AppointmentResource"%>
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
        <h1>Datos de las citas </h1>

        <table width="800" border="1">
            <thead>
                <tr>
                    <th>
                        Dia
                    </th>
                    <th>
                        Hora Inicio
                    </th>
                    <th>
                        Hora Final
                    </th>
                </tr>
            </thead>
            <tbody>
                <%
                    AppointmentResource appointmentResource = new  AppointmentResource();
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

    </body>
</html>
