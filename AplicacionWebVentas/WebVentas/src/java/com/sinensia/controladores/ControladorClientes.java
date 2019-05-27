
package com.sinensia.controladores;

import com.sinensia.modelo.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sinensia.modelo.logica.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.Cookie;

public class ControladorClientes extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    //******************************************************************************************************************
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
       String nombre = request.getParameter("nombre");
       nombre = nombre != null ? nombre : "";
       //cookies guardar el nombre en la cookie
       //CREAMOS LA COOKIE PARA GUARDAR EL NOMBRE
        Cookie galleta = new Cookie("nombre_busqueda", nombre);
        galleta.setMaxAge(10000);
        response.addCookie(galleta);
        
        
//        String email = request.getParameter("email");
//        email = email != null ? email : "";
        
        ServicioClientes srvCli = new ServicioClientes();
        List<Cliente> listado = srvCli.obtenerTodos();
        List<Cliente> listaPorNombre = new ArrayList<>();
        
        //ESTE BUCLE BUSCA EN EL NOMBRE ALGO QUE CONTENGA
        for( Cliente cliente : listado){
            if (cliente.getNombre().contains(nombre)){
                listaPorNombre.add(cliente);
            }
        }
        //ESTE BUSCA UN EMAIL IDENTICO
//        for(Cliente cliente : listado){
//                if(cliente.getEmail().equals(email)){
//                    listaPorNombre.add(cliente);
//                }
//            }
         
         

        //ENVIAR DESDE EL CONTROLADOR UN BEAN A LA VISTA --> el bean es listaPorNombre
        request.getSession().setAttribute("listaPorNombre", listaPorNombre);
        
        request.getRequestDispatcher("listado_jstl.jsp").forward(request, response);
        
        
        
    }
    //******************************************************************************************************************
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //recoger las variables del formulario
        
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        //String password = request.getParameter("password");
        //COGEMOS ESTA PARA ENCRIPTAR
        String password = request.getParameter("password_encrip");
        String edad = request.getParameter("edad");
        String activo = request.getParameter("activo");
        
        ServicioClientes servCli;
        servCli = new ServicioClientes();
        //llamamos al metodo para insertar y a la vez validar
        Cliente cli = servCli.insertar(nombre, email, password, edad, activo);
        
        if(cli==null){
            
            request.getRequestDispatcher("error_registro.jsp").forward(request, response);
 
        } else {
            request.getRequestDispatcher("registro_ok.jsp").forward(request, response);
        }
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
