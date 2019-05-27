<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="css/estilos.css">
<nav> 
    <div id="navegador">
<header><h1>Web ventas</h1></header>

<c:if test="${login != 'ok'}">
        <a href="registro.jsp">Nuevo cliente</a><br>
        <a href="login.jsp">Login</a><br>
</c:if>    
    
    <c:if test="${login == 'ok'}">   
        <a href="listado.jsp">Listado clientes</a><br>
        <a href="listado_sql.jsp">Listado con sql</a><br>
        <a href="clientes.do">Listado con jstl y Beans</a><br>
        
    </div> 
    
    <span>
      <%--  <%=request.getCookies().length <= 1 ? "" : request.getCookies()[1].getValue()%> --%>
    </span>
  <%-- cookies con EL (expresion Language--%>
    <span> ${cookie.nombre_busqueda.value}</span>
    <span id="cookie_nom"></span>  

    <div id="buscar">
        <form action="clientes.do" method="get">
            <input type="text" id="nombre" name="nombre"/><br>
            <input type="submit"  value="Buscar"/><br>
        </form>
    </div>    
    <div id="logo">
        <img src="http://www.feriaempleo.uma.es/wp-content/uploads/2019/04/viewnext.png" width="40%" height="100px"/>
        
    </div>  
</c:if>     
</nav>
    
    
    <script src="js/cookies.js"></script>
    
    
