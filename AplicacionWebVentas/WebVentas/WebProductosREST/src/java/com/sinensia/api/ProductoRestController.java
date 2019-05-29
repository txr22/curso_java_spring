
package com.sinensia.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//decoradores en forma de anotacion
@WebServlet( asyncSupported = true, urlPatterns = "/api/productos" )

//PARA QUE PUEDA SER UN SERVLET
public class ProductoRestController extends HttpServlet

{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws  ServletException, IOException
    {
        
        PrintWriter escritorRespuesta = response.getWriter();
        //VAMOS A DEVOLVER UN JSON
        response.setContentType("application/json;charset=UTF=8");
        
        
        
        //PREPARADO PARA COGER LA PETICION
        BufferedReader bufRead = request.getReader();
        
        //vriables para guardar lo que sacamos del buffer
        StringBuilder textoJson = new StringBuilder();
        

        for( String lineaJson = bufRead.readLine();lineaJson != null; lineaJson = bufRead.readLine()){
            
            //ADJUNTAMOS A CADA LINEA LO QUE HAY EN EL JSON
            textoJson.append(lineaJson);
        }
        
        
        //cerramos el flujo
        bufRead.close();
        
        //ESTO LO DEVUELVE AL POSTMAN
       // escritorRespuesta.println(textoJson);
       //COMPROBAR ENVIANDO EN MAYUSCULAS
        escritorRespuesta.println(textoJson.toString().toUpperCase());
        System.out.println("**********************" + textoJson.toString().toUpperCase());
    }
   
}
