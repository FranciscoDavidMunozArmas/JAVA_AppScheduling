<%-- 
    Document   : viewService
    Created on : jun 24, 2021, 12:38:55 a.m.
    Author     : bryan
--%>

<%@page import="ec.edu.espe.Model.Service"%>
<%@page import="ec.edu.espe.REST.ServiceResource"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styleOfPage.css">
        <title>JSP viewService</title>
    </head>
    <body>
        <h1>Datos del servicio</h1>

        <table width="800" border="1">
            <thead>
                <tr>
                    <th>
                        Código de servicio
                    </th>
                    <th>
                        Servicio
                    </th>
                    <th>
                        Descripcion
                    </th>
                </tr>
            </thead>
            <tbody>
                <%
                    ServiceResource serviceResource = new ServiceResource();
                    for (Service service : serviceResource.getAll()) {
                %>

                <tr>
                    <td>
                        <%=service.getServiceCode()%>
                    </td>
                    <td>
                        <%=service.getServiceName()%>
                    </td>
                    <td>
                        <%=service.getServiceDescription()%>
                    </td>
                </tr>
                <%  }

                %>
            </tbody>
        </table>
    </body>
</html>
