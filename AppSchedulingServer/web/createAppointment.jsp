<%-- 
    Document   : createAppointment
    Created on : 23-jun-2021, 15:00:45
    Author     : Steven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Crear cita</title>
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
                <h1>Crear cita</h1>
            </div>
            <div class="container d-flex justify-content-center" >
                <div class="card">
                    <div class="card-body">
                        <div class="m-2">
                            <a class='btn btn-primary btn-block' href="pageStart.jsp"><span class="fa fa-chevron-left"></span> Regresar</a>
                        </div>
                        <form action="saveAppointment.jsp" method="POST" class="form-container" >
                            <div class="form-group">
                                <label for="numberCodeAppointment">Código de cita</label>
                                <input class="form-control" placeholder="Código cita" type="number" name="numberCodeAppointment" onkeypress="return validekey(event)" >
                            </div>
                            <div class="form-group">
                                <label for="numberAgendaCode">Código de agenda</label>
                                <input class="form-control" placeholder="Codigo agenda" type="number" name="numberAgendaCode" onkeypress="return validekey(event)" >
                            </div>
                            <div class="form-group">
                                <label for="timeStartHour">Hora de inicio</label>
                                <input class="form-control" type="time" name="timeStartHour">
                            </div>
                            <div class="form-group">
                                <label for="timeEndHour">Hora de finalización</label>
                                <input class="form-control" type="time" name="timeEndHour" >
                            </div>
                            <div class="form-group">
                                <label for="appointmentDays">Dias Cita</label>
                                <input class="form-control" placeholder="Dias Cita" type="text" name="appointmentDays">
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
        <script src="validation.js"></script>
    </body>
</html>
