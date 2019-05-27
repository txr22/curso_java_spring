<%-- 
    Document   : editar
    Created on : May 27, 2019, 3:35:31 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar con REST</title>
    </head>
    <body>
          <%@include file="cabecera.jsp" %>
        <h1>Editar con rest</h1>

        <div>
            <form  name="form1" id="form1" >
                <label for="nombre">Nombre:</label><input id="nombre" name="nombre" type="text" required="required" size="50" maxlength="50"/><br>
                <label for="email">Email:</label><input id="email" name="email" type="email" required="required" size="50" maxlength="250"/><br>
                <label for="edad">Edad:</label><input id="edad" name="edad" type="number" required="required" size="3" max="200" min="1"/><br>
                <label for="activo">Activo:</label><input id="activo" name="activo" type="checkbox" required="required" checked="checked"/><br>
                <label for="password">Password:</label><input id="password" name="password" type="password" required="required" size="50" maxlength="50"/><br>
                <input type="hidden" name="password_encrip" id="password_encrip" />
                <br>
                <input id="btn_modificar" type="button" value="Modificar" /><br>
                <input type="reset" value="Limpiar"/><br>
            </form>
            <!--LLAMAMOS A LA LIBRERIA JS PARA ENCRIPTAR-->
            <script src="js/md5.min.js"></script>
            <script src="js/encriptacion.js"></script>
            <script src="js/editar.js"></script>
        </div>
    </body>
</html>