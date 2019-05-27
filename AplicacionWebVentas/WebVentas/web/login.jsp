<%-- 
    Document   : login
    Created on : May 27, 2019, 12:32:36 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
           <%@include file="cabecera.jsp" %>
        <h1>Login</h1>

        <div>
            <form action="login.do" name="form1" method="post" id="form1" >
                <label for="email">Email:</label><input id="email" name="email" type="email" required="required" size="50" maxlength="250"/><br>
                <label for="password">Password:</label><input id="password" name="password" type="password" required="required" size="50" maxlength="50"/><br>
                <input type="hidden" name="password_encrip" id="password_encrip" />
                <br>
                <input type="submit" value="Login" /><br>
                <input type="reset" value="Limpiar"/><br>
            </form>
            <!--LLAMAMOS A LA LIBRERIA JS PARA ENCRIPTAR-->
            <script src="js/md5.min.js"></script>
            <script src="js/encriptacion.js"></script>
        </div>
    </body>
</html>
