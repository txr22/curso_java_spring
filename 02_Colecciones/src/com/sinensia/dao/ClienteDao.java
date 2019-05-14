
package com.sinensia.dao;

import com.sinensia.Cliente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ClienteDao implements InterfazDao<Cliente>{
    
//CREAMOS EL HASHMAP, DE TIPO CLIENTE Y CLAVE STRING
        HashMap<Long, Cliente> mapa;
        
    public ClienteDao (){
        mapa = new HashMap<>();       
    }
    
        @Override
    public void poner(Cliente cli){
        if(cli == null){
            System.err.println("no se pueden añadir nulos");
            return;
        }
        mapa.put(cli.getId(), cli);
    }
    
    //METODO PARA LEER EL CLIENTE
        @Override
    public Cliente leerUno(long id){
        
      if(mapa.containsKey(id))  {
          
          return mapa.get(id);
        }
      System.err.println("Clave/Id no encontrada" + id);
              return null;
    }
    
    //**********************************************************************************
    //**********************************************************************************
    
    //METODO PARA LEERTODOS
  
    @Override
    public List<Cliente> leerTodos() {

        ArrayList<Cliente> listaNueva = new ArrayList<>();
        
          for (Map.Entry<Long, Cliente> cli : mapa.entrySet()) {
          
              listaNueva.addAll(mapa.values());
          }
        return listaNueva;
    }
    
    //**********************************************************************************
    //**********************************************************************************

    @Override
    public void eliminar(Cliente valor) {

           mapa.remove(valor.getId());
    }
    
    /* ESTE METODO ES EL MISMO, CAMBIANDO EL NOMBRE DE LAS VARIABLES
    public void eliminar(Cliente cliente) {

           mapa.remove(cliente.getId());
    }*/

    @Override
    public void eliminar(long id) {
        //AQUI ELIMINA EL CLIENTE TAMBIEN, PERO LE PASAMOS UN ID
        mapa.remove(id);
    }


    @Override
    public void modificar(Cliente valor) {

 /*       Cliente cli = mapa.get(valor.getId());
        cli.setActivo(valor.isActivo());
        cli.setEmail(valor.getEmail());
        cli.setNombre(valor.getNombre());
        
        OPCION FACIL
        */
        
          for (Map.Entry<Long, Cliente> cli : mapa.entrySet()) {
          
              if (cli.getKey() == valor.getId()){
                  cli.setValue(valor);
              }
 
          }
         

    }

}