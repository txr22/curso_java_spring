
package com.sinensia;

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
           salida.println("</body></html>");
           salida.println("");
           salida.close();
      } 
  }
 
    
  @Override
   public String getServletInfo (){
       
       return "registro clientes";
   }
    

}
