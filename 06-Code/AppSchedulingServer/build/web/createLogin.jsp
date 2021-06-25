<%-- 
    Document   : createLogin
    Created on : 24/06/2021, 18:11:25
    Author     : Sashael
--%>

<%@page import="com.google.gson.Gson"%>
<%@page import="ec.edu.espe.REST.UserResource"%>
<%@page import="ec.edu.espe.Controller.UserController"%>
<%@page import="ec.edu.espe.Model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <link rel="stylesheet" href="style.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="validation.js"></script>
    </head>
    <body>
        <div class=" wrapper bg-gradient-primary">
            <div class="d-flex justify-content-center">
                <h1>Login</h1>
            </div>
            <div class="container d-flex justify-content-center" >
                <div class="card">
                    <div class="card-body">
                        <form action="checkUser.jsp" method="POST" class="form-container" >
                            <div class="form-group">
                                <label for="textUserName">Nombre Usuario</label>
                                <input class="form-control" placeholder="Usuario" type="text" name="textUserName">
                            </div>
                            <div class="form-group">
                                <label for="passwordUser">Password</label>
                                <input class="form-control" placeholder="Password" type="password" name="passwordUser">
                            </div>
                            <input class="btn btn-primary btn-block" type="submit" value="Iniciar Sesión"/>
                        </form> 
                        <p>¿No tienes una cuenta? <a href="createUser.jsp">Crear usuario</a></p>
                        
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>