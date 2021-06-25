<%-- 
    Document   : createAppointment
    Created on : 23-jun-2021, 15:00:45
    Author     : Steven
--%>

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
                <h1>Crear Cita</h1>
            </div>
            <div class="container d-flex justify-content-center" >
                <div class="card">
                    <div class="card-body">
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="pageStart.jsp"><span class="fa fa-chevron-left"></span> Regresar</a>
                        </div>
                        <form action="saveAppointment.jsp" method="POST" class="form-container" >
                            <div class="form-group">
                                <label for="numberCodeAppointment">Codigo Cita</label>
                                <input class="form-control" placeholder="Codigo" type="number" name="numberCodeAppointment" onkeypress="return validekey(event)" >
                            </div>
                            <div class="form-group">
                                <label for="numberAgendaCode">Codigo Agenda</label>
                                <input class="form-control" placeholder="Codigo Agenda" type="number" name="numberAgendaCode" onkeypress="return validekey(event)" >
                            </div>
                            <div class="form-group">
                                <label for="timeStartHour">Hora inicio</label>
                                <input class="form-control" type="time" name="timeStartHour">
                            </div>
                            <div class="form-group">
                                <label for="timeEndHour">Hora inicio</label>
                                <input class="form-control" type="time" name="timeEndHour" >
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
