<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header><h1>Web ventas</h1></header>
<<<<<<< HEAD
<nav>
    <c:if test="${login != 'ok'}">
        <a href="login.jsp">Login</a>
        <a href="registro.jsp">Nuevo cliente</a>
    </c:if>
<%-- TODO: Poner sólo cuando esté LOGIN --%>
    <a href="editar.jsp">Editar AJAX+REST</a>
    
    <c:if test="${login == 'ok'}">
        <a href="listado.jsp">Listado clientes</a>
        <a href="listado_sql.jsp">Lista JSTL+SQL</a>
        <a href="clientes.do">Listado JSTL+Beans</a>

        <form method="GET" action="clientes.do">
            <input type="text" id="nombre_busq" name="nombre_busq"/>
            <input type="submit" value="BUSCAR"/>
        </form>
    </c:if>
</nav>

<%-- <span><%= request.getCookies().length <= 1 ? "" 
        : request.getCookies()[1].getValue() %></span>
<Cookies con EL (Expression Language) --%>
<span>${cookie.nombre_busqueda.value}</span>
<span id="span_cookie_nom"></span>
<script src="js/cookies.js"></script>
=======

<c:if test="${login != 'ok'}">
        <a href="registro.jsp">Nuevo cliente</a><br>
        <a href="login.jsp">Login</a><br>
</c:if>    
    
    <c:if test="${login == 'ok'}">   
        <a href="listado.jsp">Listado clientes</a><br>
        <a href="listado_sql.jsp">Listado con sql</a><br>
        <a href="clientes.do">Listado con jstl y Beans</a><br>
        <a href="cerrarSesion.jsp">Cerrar sesion</a><br>
        <a href="editar.jsp">Editar AJAX + REST</a><br>
  
    </div> 
    
    <div id="buscar">
        <form action="clientes.do" method="get">
            <input type="text" id="nombre" name="nombre"/><br>
            <input type="submit"  value="Buscar"/><br>
        </form>
    </div>    
    <div id="logo">
        <img src="http://www.feriaempleo.uma.es/wp-content/uploads/2019/04/viewnext.png" width="40%" height="100px"/>
        <span>
      <%--  <%=request.getCookies().length <= 1 ? "" : request.getCookies()[1].getValue()%> --%>
    </span>
  <%-- cookies con EL (expresion Language--%>
     <span> ${cookie.nombre_busqueda.value}</span>
    <span id="cookie_nom"></span> 
    <script src="js/cookies.js"></script>
    </div>  
</c:if>     
</nav>
       
    
    
>>>>>>> 7de5797aecf524a5a87eb82e92092ac37765a48a
