
package com.sinensia;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MainEjercicio {

    public static void main(String[] args) {
        File fichRutaRelativa = new File("C:\\Users\\Admin\\Desktop\\CURSO_JAVA\\repositorio_github_local.git\\Ejercicio_ficheros.txt");
        Scanner escaner = null;
        HashMap<Long, Cliente> mapaDat = new HashMap<>();
        try {
            System.out.println("Leyendo fich");
            escaner = new Scanner(fichRutaRelativa);
            
            
            while (escaner.hasNextLine()) { // Hasta el siguiente \n
                String linea = escaner.nextLine();
                System.out.println(">>>> \"" + linea + "\"");
                try {
                    //CREAMOS UN ARRAY DE STRING CON LOS ELEMENTOS QUE NOS DEVUELVA SPLIT
                    String campos[] = linea.split(",");
                    //CREAMOS EL CLIENTE
                    Cliente cliente;
                    //SI LOS CAMPOS SON 4 O 5, ES UN CLIENTE
                    if (campos.length == 4 || campos.length == 5) {
                        //SACAMOS LOS ATRIBUTOS
                        long id = Integer.parseInt(campos[0]);
                        String nombre = campos[1];
                        String email = campos[2];
                        //SI EL ACTIVO ES TRUE, DEVUELVE TRUE, SINO FALSE
                        boolean activo = campos[3].equals("true") ? true : false;
                        int duracionMax = 0;
                        
                        //SI LOS CAMPOS SON  5, ES UN CLIENTE INVITADO
                        if (campos.length == 5)  {
                            duracionMax = Integer.parseInt(campos[4]);                            
                            cliente = new ClienteInvitado(id, nombre, email);
                            ((ClienteInvitado) cliente).setDuracionMax(duracionMax);
                            //SI LOS CAMPOS SON 4, ES UN CLIENTE NORMAL
                        } else {
                            cliente = new Cliente(id, nombre, email);
                        }      
                        //PONEMOS EL ACTIVO MANUALMENTE, YA QUE NO TIENE METODO
                        cliente.setActivo(activo);
                        //AÑADIMOS EL CLIENTE AL HASHMAP
                        mapaDat.put(id, cliente);
                    }
                } catch (Exception ex) {
                    System.err.println("Error en parseo: " + ex.getMessage());
                }
            }
            
            //RECORREMOS EL HASHMAP PARA MOSTRARLO
            for (Map.Entry<Long, Cliente> ent : mapaDat.entrySet()) {
                System.out.println("Cli: " + ent.getValue().toString());
            }
        } catch (Exception ex) {
            System.err.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                if (escaner != null) {
                    escaner.close();
                }
            } catch (Exception ex2) {
                System.err.println("Mensaje al cerrar: " + ex2.getMessage());
            }
        }
    }

}
