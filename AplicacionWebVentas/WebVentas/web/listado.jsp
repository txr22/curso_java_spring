<%-- 
    Document   : listado
    Created on : May 24, 2019, 9:29:51 AM
    Author     : Admin
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sinensia.modelo.logica.* "%>
<%@page import="com.sinensia.modelo.Cliente" %>
<%!ServicioClientes srvCli; %>
<% srvCli = new ServicioClientes();
List<Cliente> clientes = srvCli.obtenerTodos();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado clientes</title>
        <style type='text/css'>

                tr:nth-child(even) { background: moccasin }
                tr:nth-child(odd) { background: mistyrose}

        </style>
    </head>
    <body>
        <%@include file="cabecera.jsp" %>
        <h1>Listado clientes</h1>
        <table border="2">
            <thead>
                <tr>
                    <th style="background: orange">Nombre:</th>
                    <th style="background: orange">Email</th>
                    <th style="background: orange">Edad</th>
                    <th style="background: orange">Password</th>
                    <th style="background: orange">Activo</th>
                </tr>
            </thead>
            
                <%
                    for (int i=0;i<clientes.size();i++)
                    {
                        %>
                           
                        <%= "<tr>"%>
                        <%= "<td>"+clientes.get(i).getNombre()+"</td>"%>
                        <%= "<td>"+clientes.get(i).getEmail()+"</td>"%>
                        <%= "<td>"+clientes.get(i).getEdad()+"</td>"%>
                        <%= "<td>"+clientes.get(i).getPassword()+"</td>"%>
                        <%= "<td>"+clientes.get(i).getActivo()+"</td>"%>
                        <%= "</tr>"%>
                   <%  
                    }
               %>
               
        <!-- otra manera de hacerlo con JSTL -->
        
               
        </table>
    </body>
</html>
