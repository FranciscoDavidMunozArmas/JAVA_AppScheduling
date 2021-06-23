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
        <link rel="stylesheet" href="styleOfPage.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="validation.js"></script>
    </head>
    <body>
        <h1>App Schedulling</h1>

        <form action="saveAppointment.jsp" method="POST" >
            <table style="with: 100%">
                <tr>
                    <td>Cita</td>
                    <td><input type="number" name="numberCodeAppointment" onkeypress="return validekey(event)"></td>
                </tr>
                <tr>
                    <td>Codigo Agenda</td>
                    <td><input type="number" name="numberAgednaCode" onkeypress="return validekey(event)"></td>
                </tr>
                <tr>
                    <td>Hora inicio</td>
                    <td><input type="time" name="timeStartHour"></td>
                </tr>
                <tr>
                    <td>Hora Final</td>
                    <td><input type="time" name="timeEndHour"></td>
                </tr>
                <tr>
                    <td>Dia cita</td>
                    <td><input type="text" name="txtDayAppointment"></td>
                </tr>
            </table>
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>
