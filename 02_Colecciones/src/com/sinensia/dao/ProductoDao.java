
package com.sinensia.dao;

import com.sinensia.Cliente;
import com.sinensia.Producto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductoDao implements InterfazDao<Cliente>{

    

   //CREAMOS EL HASHMAP, DE TIPO CLIENTE Y CLAVE STRING
        HashMap<Long, Producto> mapaProducto;
        
    public ProductoDao (){
        mapaProducto = new HashMap<>();       
    } 

    public void poner(Producto valor) {
        
         if(valor == null){
            System.err.println("no se pueden añadir nulos");
            return;
        }
        mapaProducto.put(valor.getId(), valor);
    }

    public Producto leerUno(Long id) {
        if(mapaProducto.containsKey(id))  {
          
          return mapaProducto.get(id);
        }
      System.err.println("Clave/Id no encontrada" + id);
              return null;   
    }
    

    public void eliminar(Producto valor) {

        mapaProducto.remove(valor.getId());
    }

    @Override
    public void eliminar(long id) {

        mapaProducto.remove(id);
    }



    
    public void modificar(Producto valor) {

        for (Map.Entry<Long, Producto> pro : mapaProducto.entrySet()) {
          
              if (pro.getKey() == valor.getId()){
                  pro.setValue(valor);
              }
 
          }

    }

    @Override
    public void poner(Cliente valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente leerUno(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Cliente valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> leerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Cliente valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    
    
    
}
