<%@page import="com.google.gson.Gson"%>
<%@page import="ec.edu.espe.REST.AgendaResource"%>
<%@page import="ec.edu.espe.Controller.AgendaController"%>
<%@page import="ec.edu.espe.Model.Agenda"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Create Agenda</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <link rel="stylesheet" href="style.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div class=" wrapper bg-gradient-primary">
            <div class="d-flex justify-content-center">
                <h1>Crear Agenda</h1>
            </div>
            <div class="container d-flex justify-content-center" >
                <div class="card">
                    <div class="card-body">
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="pageStart.jsp"><span class="fa fa-chevron-left"></span> Regresar</a>
                        </div>
                        <form action="saveAgenda.jsp" method="POST" class="form-container" >
                            <div class="form-group">
                                <label for="numberCodeAgenda">Codigo Agenda</label>
                                <input class="form-control" placeholder="Codigo" type="number" name="numberCodeAgenda" onkeypress="return validekey(event)" >
                            </div>
                            <div class="form-group">
                                <label for="numberUserCode">Codigo Usuario</label>
                                <input class="form-control" placeholder="Cedula" type="number" name="numberUserCode" onkeypress="return validekey(event)" >
                            </div>
                            <div class="form-group">
                                <label for="dateAgenda">Fecha Agenda</label>
                                <input class="form-control" type="datetime-local" name="dateAgenda" onkeypress="return validekey(event)" >
                            </div>
                            <div class="form-group">
                                <label for="description">Fecha Agenda</label>
                                <textarea class="form-control" placeholder="Codigo" type="number" name="description" onkeypress="return validekey(event)" ></textarea>
                            </div>
                            <input class="btn btn-primary btn-block" type="submit" value="Save"/>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <script src="validation.js"></script>
    </body>
</html>
