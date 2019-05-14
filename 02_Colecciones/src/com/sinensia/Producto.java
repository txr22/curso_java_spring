

package com.sinensia;


public class Producto extends Entidad {
   
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(long id, String nombre, double precio, int stock) {
        super(id);
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    //******************************************************************


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
      
       return "Producto ["+id+ ", "+nombre+ ", "+precio+ ", "+stock+"]";
    }
    
    
    
    
    
    
    
    
    
}
