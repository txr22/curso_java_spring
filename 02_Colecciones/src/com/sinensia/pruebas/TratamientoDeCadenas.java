
package com.sinensia.pruebas;

import java.util.ArrayList;
import java.util.Arrays;


public class TratamientoDeCadenas {
    
    public static void pruebasString(){
        
        String quijote = "En un lugar de la Mancha....";
        if(quijote.contains("Mancha"))
            System.out.println("Contiene Mancha");
        
        if(quijote.contains("manCha"))
            System.out.println("Contiene manCha");
        
        
        if(quijote.toLowerCase().contains("MANcha".toLowerCase())){
            
            System.out.println("Si contiene MANcha");
        } else {
            System.out.println("no contiene mancha");
        }
        
        String [] cadenas = quijote.split(" ");
        
        for(String ca : cadenas){
            
            System.out.println(ca);
        }
        
        if(quijote.startsWith("En un lugar")){
            System.out.println("Comienza con En un lugar");
        }
        
        if(quijote.endsWith("la Mancha...")){
            
            System.out.println("Termina con la Mancha....");
        }
        
        System.out.println("charAt(6)"+ quijote.charAt(6));
        
        System.out.println(String.format("El texto %s tiene %d caracteres" , quijote, quijote.length()));
        
        System.out.println(String.format("%f, %f, %f, %f",
                1.1f, 2.2f, 3.3f, 4.4f));
        
        System.out.println("Mancha esta en la posicion "+ quijote.indexOf("Mancha"));
        
        if(!quijote.isEmpty()){
            System.out.println("quijote no esta vacio");
        }
        
        System.out.println(!quijote.isEmpty());
        
        System.out.println("la ultima 'a' esta en la posicion "+ quijote.lastIndexOf('a'));
        
        System.out.println("trozo de cadena \""+ quijote.substring(6, 14)+ "\"");
        
        String strCsv = "Chema, 666, 555, C/vista al mar, 8";
        
       for(String csv : strCsv.split(",")){
            
            System.out.println("dato: " +csv.trim());
        }
        
       
       ArrayList<String> cadeneta = new ArrayList<>();
       
       for(String ca : cadenas){
            
            //System.out.println(ca);
            cadeneta.add(ca);
            
        }
       //**************PASAR EL ARRAY A UN ARRYLIS
       for(String cad : cadeneta){
            
            System.out.println("arrayList ->> "+cad);
            
        }
       
    
      
    }
    
    
}
