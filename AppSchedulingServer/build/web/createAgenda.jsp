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
        <link rel="stylesheet" href="styleOfPage.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="validation.js"></script>
    </head>
    <body>
        <h1>App Schedulling</h1>

        <form action="saveAgenda.jsp" method="POST" >
            <table style="with: 100%">
                <tr>
                    <td>Codigo Agenda</td>
                    <td><input type="number" name="numberCodeAgenda" onkeypress="return validekey(event)"></td>
                </tr>
                <tr>
                    <td>Codigo Usuario</td>
                    <td><input type="number" name="numberUserCode" onkeypress="return validekey(event)"></td>
                </tr>
                <tr>
                    <td>Fecha Agenda</td>
                    <td><input type="datetime-local" name="dateAgenda"></td>
                </tr>
                <tr>
                    <td>descripcion</td>
                    <td><textarea name="description" maxlength="100 "></textarea></td>
                </tr>
            </table>
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>
