<%@page import="com.sinensia.modelo.logica.ServicioClientes"%>
<!DOCTYPE html>


<%@page import="com.sinensia.modelo.*" %>
        
        
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        	
        
    </head>
    <body>
        <%@include file="cabecera.jsp" %>
        
        <%= (new ServicioClientes()).obtenerUno("prueba@email.com").getNombre()%>
        <% for (int i =0; i<1;i++){
            %>
            
            <div> registro ok</div>
           
            <% 
                  }
            %>
           
        <a href="listado.jsp">listados</a>
       
        <h1>Registrado correctamente!!!!</h1>
    </body>
</html>
