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
        <form action="" target="" method="post" name="formAgenda">

            <h2>Information of the Agenda</h2>
            <label for="numberCodeAgenda">Codigo Agenda</label>
            <input type="number" id="numberCodeAgenda" onkeypress="return valideKey(event)" required><br>
            <label for=" numberUserCode ">Codigo Usuario</label>
            <input type="number" id="numberUserCode" onkeypress="return valideKey(event)" required><br>
            <label for="dateAgenda"> Fecha Agenda</label>
            <input type="datetime-local" id="dateAgenda" required>
            <label for="description">Descripcion</label>
            <textarea name="description" for="description" id="txtDirection" maxlength="100 "></textarea>
            <p></p>
            <input type="submit" id="btnAdd " onclick="add()" value="Save">
        </form>
    </body>
    <%
        Agenda agenda =new Agenda();
        Gson json = new Gson();
        AgendaResource agendaResource = new AgendaResource();
        agenda.setAgendaCode(request.getParameter("numberAgenda"));
        agenda.setUserCode(request.getParameter("numberUserCode"));
        agenda.setAgendaDate(request.getParameter("datAgenda"));
        agenda.setAgendaDescription(request.getParameter("description"));
        json.toJson(agenda);
        agendaResource.postAgenda(agenda);
    
    %>
</html>
