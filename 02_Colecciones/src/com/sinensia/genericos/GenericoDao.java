
package com.sinensia.genericos;

import com.sinensia.Entidad;
import com.sinensia.dao.InterfazDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Admin
 * @param <T>  El tipo hereda de Entidad
 */
public class GenericoDao<T extends Entidad> implements InterfazDao<T> {
    
    
//CREAMOS EL HASHMAP, DE TIPO CLIENTE Y CLAVE STRING
        HashMap<Long, T> mapa;
        
    public GenericoDao (){
        mapa = new HashMap<>();       
    }
    

    public void poner(T cli){
        if(cli == null){
            System.err.println("no se pueden añadir nulos");
            return;
        }
        mapa.put(cli.getId(), cli);
    }
    
    //METODO PARA LEER EL CLIENTE

    public T leerUno(long id){
        
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
    public List<T> leerTodos() {

        ArrayList<T> listaNueva = new ArrayList<>();
        
          for (Map.Entry<Long, T> cli : mapa.entrySet()) {
          
              listaNueva.addAll(mapa.values());
          }
        return listaNueva;
    }
    
    //**********************************************************************************
    //**********************************************************************************

    @Override
    public void eliminar(T valor) {

           mapa.remove(valor.getId());
    }
    
    /* ESTE METODO ES EL MISMO, CAMBIANDO EL NOMBRE DE LAS VARIABLES
    public void eliminar(T cliente) {

           mapa.remove(cliente.getId());
    }*/

    @Override
    public void eliminar(long id) {
        //AQUI ELIMINA EL CLIENTE TAMBIEN, PERO LE PASAMOS UN ID
        mapa.remove(id);
    }


    @Override
    public void modificar(T valor) {

 /*       T cli = mapa.get(valor.getId());
        cli.setActivo(valor.isActivo());
        cli.setEmail(valor.getEmail());
        cli.setNombre(valor.getNombre());
        
        OPCION FACIL
        */
        
        mapa.replace(valor.getId(), valor);
         

    }
    
}
