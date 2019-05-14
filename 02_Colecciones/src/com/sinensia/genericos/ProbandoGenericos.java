
package com.sinensia.genericos;

import java.util.ArrayList;
import java.util.Date;


public class ProbandoGenericos {
    
    public static  void probarMetodo(){
        
        int num = 10;
        //CREAMOS UN OBJETO DE LA CLASE INTEGER
        Integer objNum = new Integer(10);
        
        //PARSEAR UN NUMERO
        String texto = "" +num;
        String texto2 = "" +String.valueOf(num);
        String texto3 = "" + objNum.toString();
        
        
        //CREAMOS UNA LISTA DE INTEROS
        ArrayList<Integer> listaInt = new ArrayList<>();
        //INSERTAR
        insertarDobleGenerico(listaInt, 10);
        insertarDobleGenerico(listaInt, 15);
        System.out.println("Enteros: "+listaInt.toString());
        
        //CREAMOS UNA LISTA DE STRING
        ArrayList<String> listaStr = new ArrayList<>();
        //INSERTAR
        insertarDobleGenerico(listaStr, "hola");
        insertarDobleGenerico(listaStr, "adios");
        System.out.println("Enteros: "+listaStr.toString());
        
        //CREAMOS UNA LISTA DE DATE
        ArrayList<Date> listaDate = new ArrayList<>();
        //INSERTAR
        insertarDobleGenerico(listaDate, new Date(82, 4, 10));
        insertarDobleGenerico(listaDate, new Date(83, 4, 22));
        
        System.out.println("Fechas: "+listaDate.toString());
        
//*****************************************************************************************************************************************
        
        
    }
    //CREAMOS NUESTRO METODO GENERICO PARA PASARLE LOS DATOS DEPENDIENDO LA LISTA QUE HEMOS CREADO
    
    public static<Tipo> void insertarDobleGenerico(ArrayList<Tipo> lista, Tipo valor){ 
        lista.add(valor);
        lista.add(valor);
        
        /*
        run:
            Enteros: [10, 10, 15, 15]
            Enteros: [hola, hola, adios, adios]
            Fechas: [Mon May 10 00:00:00 CEST 1982, Mon May 10 00:00:00 CEST 1982, Sun May 22 00:00:00 CEST 1983, Sun May 22 00:00:00 CEST 1983]
        */
    }
    public static void insertarDoble(ArrayList<Integer> lista, int valor){
        
        lista.add(valor);
        lista.add(valor);
  
    }
    
    public static void insertarDoble(ArrayList<String> lista, String valor){ 
        lista.add(valor);
        lista.add(valor);
    }
    
}
