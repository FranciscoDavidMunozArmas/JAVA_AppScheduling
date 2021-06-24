<%-- 
    Document   : viewEmployee
    Created on : jun 24, 2021, 12:38:29 a.m.
    Author     : bryan
--%>

<%@page import="ec.edu.espe.Model.Employee"%>
<%@page import="ec.edu.espe.REST.EmployeeResource"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styleOfPage.css">
        <title>JSP viewEmployee</title>
    </head>
    <body>
        <h1>Datos del empleado</h1>

        <table width="800" border="1">
            <thead>
                <tr>
                    <th>
                        Código del empleado
                    </th>
                    <th>
                        Nombre del empleado
                    </th>
                </tr>
            </thead>
            <tbody>
                <%
                    EmployeeResource employeeResource = new EmployeeResource();
                    for (Employee employee : employeeResource.getAll()) {
                %>

                <tr>
                    <td>
                        <%=employee.getEmployeeCode()%>
                    </td>
                    <td>
                        <%=employee.getEmployeeName()%>
                    </td>
                </tr>
                <%  }

                %>
            </tbody>
        </table>
    </body>
</html>
