

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sinensia.modelo.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--<% List<Cliente> listaCliPorNombre = (ArrayList <Cliente>) request.getAttribute("listaPorNombre");%>--%>

<jsp:useBean id="listaPorNombre" type="java.util.ArrayList<Cliente>" scope="session" >
<jsp:getProperty property="*" name="listaPorNombre"></jsp:getProperty>
</jsp:useBean> 
    


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="cabecera.jsp" %>
        <h1>Listado en jstl </h1>
        
        
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
             <%--   <%
                    for (int i=0;i<listaCliPorNombre.size();i++)
                    {
                        %>--%>
            <c:forEach items="${listaPorNombre}" var="cli">
                   <%--         
                        <%= "<tr>"%>
                        <%= "<td>"+listaCliPorNombre.get(i).getNombre()+"</td>"%>
                        <%= "<td>"+listaCliPorNombre.get(i).getEmail()+"</td>"%>
                        <%= "<td>"+listaCliPorNombre.get(i).getEdad()+"</td>"%>
                        <%= "<td>"+listaCliPorNombre.get(i).getPassword()+"</td>"%>
                        <%= "<td>"+listaCliPorNombre.get(i).getActivo()+"</td>"%>
                        <%= "</tr>"%>
                      
                   <%  
                    }
               %>
                --%>
                <tr>
                    <td>${cli.nombre}</td>
                    <td>${cli.email}</td>
                    <td>${cli.edad}</td>
                    <td>${cli.password}</td>
                    <td>${cli.activo}</td>
                </tr>
                
                </c:forEach>
        </table>
            

    </body>
</html>
