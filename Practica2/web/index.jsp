<%-- 
    Document   : index
    Created on : 13-jun-2018, 19:03:29
    Author     : SENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Pruebas LUIS RODRIGUEZ</title>
    </head>
    <body>
        <%@page import="controlador.MuestraRegistro" %>
        <h1>Hola soy Yo</h1>
        <form action="correcto" method="post">
        <p>Nombre del Estudiante</p>  
<fieldset>
<p>Estudiante:
<input type="text" name="estudiante">
</p>
Materia:
<input type="text" name="materia">

</p>
<p>
Nota:
<input type="text" name="nota">
</p>
<p>
<input type="submit" value="Enviar">
</p>
</fieldset>
            
        </form>
    </body>
</html>
