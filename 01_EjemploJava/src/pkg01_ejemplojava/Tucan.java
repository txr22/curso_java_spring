
package pkg01_ejemplojava;


public class Tucan {
    
     String [] colores;
     float longuitud;
     int edad;
    
    
 public Tucan(){
     
     this.edad = 0;
     longuitud =  5f;
     colores = new String[] {
         "rojo", "blanco"
     };
        
    }
    
//    Tucan(String colores[], float longuitud, int edad){
//        
//        this.colores = colores;
//        this.longuitud = longuitud;
//        this.edad = edad;
//        
//    }
    
     public void piar(){
         System.out.println("pio pio" + edad +" años");
     }
    
    
    
    
    
    
    
    
    
}
