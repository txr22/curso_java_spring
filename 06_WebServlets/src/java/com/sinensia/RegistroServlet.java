
package com.sinensia;

import com.sinensia.modelo.MySQLCliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * LOS SERVLETS HEREDAN DE LA CLASE HEEPSERVLET
 * @author Admin
 */
public class RegistroServlet extends HttpServlet {
   
  @Override
  protected void doGet (HttpServletRequest peticion,
          HttpServletResponse respuesta)throws  ServletException, IOException{
          
  
      respuesta.setContentType ("text/html;charset=UTF-8");
      
      try (PrintWriter salida = respuesta.getWriter()){
           salida.println("<html><head>");
           salida.println("<title>Web servlets desde java</title>");
           salida.println("</head><body>");
           salida.println("<h1> Respuesta al registro </h1>");
           salida.println("<h2>ruta del servlet: "+peticion.getContextPath()+" metodo: "+peticion.getMethod()+"</h2>");
           salida.println("<ul>");
           
           for(int i =0;i<3;i++){
               salida.println("<li> Numm: " +i+ " </li>");
           }
           salida.println("</ul>");
           salida.println("<p>"+respuesta.toString() +"</p>"); // org.netbeans.modules.web.monitor.server.MonitorResponseWrapper@7b34897e
           salida.println("<p>"+respuesta.getContentType() +"</p>"); //text/html;charset=UTF-8
           
    //************************* COGEMOS LOS VALORES DEL CLIENTE **********************************
           String nombre = peticion.getParameter("nombre");
           String strEdad = peticion.getParameter("edad");
           //PARSEAMOS EL STRING DE EDAD
           int edad = Integer.parseInt(strEdad);
           String email = peticion.getParameter("email");
           String strActivo = peticion.getParameter("activo");
           String password = peticion.getParameter("password");
           //PARSEAMOS EL BOOLEAN DE ACTIVO0.
           //si el valor es distinto de null, que ponga el valor
           boolean activo = strActivo != null;
           salida.println("<p>nombre: "+ nombre+ " </p>");
           salida.println("<p>edad: "+ edad+ " </p>");
           salida.println("<p>email: "+ email+ " </p>");
           salida.println("<p>activo: "+ activo+ " </p>");
           salida.println("<p>password: "+ password+ " </p>");
    //********************************************************************************************
    
    MySQLCliente bdCliente = new MySQLCliente();
    
    
   if ( bdCliente.crear(nombre, email, password, edad, activo)){
   
       salida.println("<p>guardado correctamente</p>");
   } else {
        salida.println("<p>no se guardo!!</p>");
   }

           salida.println("</body></html>");
           salida.println("");
           salida.close();
      } 
  }
                                                                                  
    
  @Override
   public String getServletInfo (){
       
       return "registro clientes";
   }
    

}//fin clase registroservlet
