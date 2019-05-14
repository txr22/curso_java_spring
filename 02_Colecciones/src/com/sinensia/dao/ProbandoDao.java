
package com.sinensia.dao;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;
import com.sinensia.genericos.GenericoDao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class ProbandoDao {
    
    public static void probarCliente(){
        
        GenericoDao<Cliente> repoCli = new GenericoDao();
        
        repoCli.poner(new Cliente(1, "ana", "ana@ana.com"));
        repoCli.poner(new ClienteInvitado(2, "juan", "juan@juan.com"));
        repoCli.poner(new ClienteInvitado(3, "Bea", "bea@bea.com"));
        repoCli.poner(new ClienteInvitado(5, "teo", "teo@bea.com"));
        repoCli.poner(new ClienteInvitado(9, "pascual", "pascual@bea.com"));
        
        System.out.println("juan: "+repoCli.leerUno(2).toString());
        repoCli.eliminar(9);
        
        //********************************************************************************************************
        //System.out.println(repoCli.leerTodos().toString());
        //System.out.println(repoCli.mapa.toString());
        
        List<Cliente> listaDevuelta = repoCli.leerTodos();
        System.out.println(listaDevuelta);
        //System.out.println(listaDevuelta.size());
        //********************************************************************************************************
        
        repoCli.modificar(new ClienteInvitado(2, "jairo", "jairo@gmaol.com"));
        Cliente cli = repoCli.leerUno(2);
        System.out.println("Cliente modificado: "+cli.toString());
        //IMPRIMIR PARA VER SI SE HA MODIFICADO
      //  System.out.println(repoCli.mapa.toString());
            
                



        
        
              
        
        
      
    }
}
