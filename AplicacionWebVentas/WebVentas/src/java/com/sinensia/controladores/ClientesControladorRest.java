/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.controladores;

import com.google.gson.Gson;
import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.logica.ServicioClientes;
import static java.awt.PageAttributes.MediaType.A;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.reflect.generics.tree.Tree;

/**
 *
 * @author Admin
 */
public class ClientesControladorRest extends HttpServlet {

    /**
     * API Rest captura la peticion HTTP <code>PUT</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("application/json;charset=UTF-8");
        
        try (PrintWriter salida = response.getWriter()) {  
            String nombre = request.getParameter("nombre");
            
            String email = request.getParameter("email");
            String password = request.getParameter("password_encrip");
            String edad = request.getParameter("edad");
            String activo = request.getParameter("activo");

            ServicioClientes servCli;
            servCli = new ServicioClientes();
            
            //OBTENEMOS EL CLIENTE POR EMAIL
            Cliente cli = servCli.obtenerUno(email);
            
         /*   String jsonCli ="{";
            if (cli != null) {
                cli = servCli.modificar(cli.getId(), nombre, email, password, edad, activo);
                if (cli != null) {
                    jsonCli += "   \"id\" : \"" + cli.getId() + "\"";
                    jsonCli += ",   \"nombre\" : \"" + cli.getNombre() + "\"";
                    jsonCli += ",   \"email\" : \"" + cli.getEmail()+ "\"";
                    jsonCli += ",   \"password\" : \"" + cli.getPassword() + "\"";
                    jsonCli += ",   \"edad\" : \"" + cli.getEdad()+ "\"";
                    jsonCli += ",   \"activo\" : \"" + cli.getActivo()+ "\"";
                    jsonCli += "}";
                    salida.print(jsonCli);
                }
            }*/
         
         cli = servCli.modificar(cli.getId(), nombre, email, password, edad, activo);
         String gsonCli = new Gson().toJson(cli);
         salida.print(gsonCli);
         
         
         
         
         
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }*/

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

 

}



 


