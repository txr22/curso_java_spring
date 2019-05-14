
package com.sinensia.dao;

import java.util.List;

/**
 * INTERFAZ DATA ACCESS OBJECT PARA TODA LA APP
 * @author Admin
 * @param <T> entidad para interfaz DAO
 */

//CREAMOS EL METODO GENERICO
public interface InterfazDao<T> {
    
    void poner(T valor);
    T leerUno(long id);
    void eliminar(T valor);
    void eliminar(long  id);
    
    List<T> leerTodos();
    
    //HACER EL MODIFICAR    
    void modificar(T valor);
    
    
        
    
}
