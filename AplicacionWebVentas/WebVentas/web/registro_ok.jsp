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
        <%= (new ServicioClientes()).obtenerUno("prueba@email.com").getNombre()%>
        <% for (int i =0; i<10;i++){
            %>
            
            <div> registro ok</div>
            
            <% 
                  }
            %>
           
       
        <h1>Registrado correctamente!!!!</h1>
    </body>
</html>
