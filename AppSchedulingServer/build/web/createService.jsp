<%-- 
    Document   : createService
    Created on : 24/06/2021, 18:13:06
    Author     : Sashael
--%>

<%@page import="com.google.gson.Gson"%>
<%@page import="ec.edu.espe.REST.ServiceResource"%>
<%@page import="ec.edu.espe.Controller.ServiceController"%>
<%@page import="ec.edu.espe.Model.Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Create Service</title>
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
                <h1>Crear Servicio</h1>
            </div>
            <div class="container d-flex justify-content-center" >
                <div class="card">
                    <div class="card-body">
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="pageStart.jsp"><span class="fa fa-chevron-left"></span> Regresar</a>
                        </div>
                        <form action="saveService.jsp" method="POST" class="form-container" >
                            <div class="form-group">
                                <label for="numberServiceCode">Código Servicio</label>
                                <input class="form-control" placeholder="Código" type="number" name="numberServiceCode" onkeypress="return validekey(event)">
                            </div>
                            <div class="form-group">
                                <label for="textServiceName">Nombre Servicio</label>
                                <input class="form-control" placeholder="Servicio" type="text" name="textServiceName">
                            </div>
                            <div class="form-group">
                                <label for="description">Descripción</label>
                                <textarea class="form-control" placeholder="Description" type="text" name="description"></textarea>
                            </div>
                            <input class="btn btn-primary btn-block" type="submit" value="Guardar"/>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="float-right-bottom">
            <a href="createLogin.jsp" class="btn btn-primary btn-float" data-toggle="tooltip" data-placement="top" title="Log out"><span class="fa fa-power-off"></span></a>
        </div>
    </body>
</html>

