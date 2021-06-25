<%-- 
    Document   : saveUser
    Created on : 24/06/2021, 18:18:27
    Author     : Sashael
--%>

<%@page import="ec.edu.espe.REST.UserResource"%>
<%@page import="ec.edu.espe.Model.User"%>
<%@page import="com.google.gson.Gson"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <link rel="stylesheet" href="style.css">
        <title>User Saved</title>
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
                            <a class='btn btn-primary btn-block' href="createlogin.jsp"><span class="fa fa-chevron-left"></span> Regresar</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        <div class="float-right-bottom">
            <a href="createLogin.jsp" class="btn btn-primary btn-float" data-toggle="tooltip" data-placement="top" title="Log out"><span class="fa fa-power-off"></span></a>
        </div>
        
        <%
        User user =new User();
        Gson json = new Gson();
        UserResource userResource= new UserResource();
        user.setUserCode(request.getParameter("numberCodeUser"));
        user.setUserName(request.getParameter("textUserName"));
        user.setUserPassword(request.getParameter("passwordUser"));
        json.toJson(user);
        userResource.postUser(user);
    %>
    </body>
</html>