<%-- 
    Document   : checkUser
    Created on : 24/06/2021, 19:48:33
    Author     : Sashael
--%>

<%@page import="java.util.List"%>
<%@page import="ec.edu.espe.REST.UserResource"%>
<%@page import="ec.edu.espe.Model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check user</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        UserResource userResource= new UserResource();
        List<User> list = userResource.getAgendaByName(request.getParameter("textUserName"));
        for (User aux:list){
            if (aux.getUserPassword().equals(request.getParameter("passwordUser"))){
        %><jsp:forward page = "pageStart.jsp" /><%
            }
        }response.sendRedirect("createLogin.jsp");
    %>
    </body>
</html>

