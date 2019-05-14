package com.sinensia.pruebas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;

public class Ficheros {

    public static void probarEscritura() throws IOException {

        String[] lineasTexto = {
            "Linea primera",
            "Linea segunda",
            "Linea tercera",
            "cuarta linea nueva"
        };

        FileWriter fichero = null;
        //  String nombreFichero= "C:\\Users\\Admin\\Desktop\\CURSO_JAVA\\repositorio_github_local\\ficheroNuevo.txt";
        String nombreFichero = "ficheroNuevo.txt";

        try {

            fichero = new FileWriter(nombreFichero, true); //si ponemos true, no sobreescribe
            for (String linea : lineasTexto) {
                fichero.write(linea + "\n");
            }
            fichero.write("*****************************************************");
            //fichero.close(); ESTE LO QUITAMOS, YA QUE SE APLICA EN EL FINALLY
        } catch (Exception e) {

            System.err.println("ERROR!! " + e.getMessage());
        } finally {
            fichero.close();
            System.out.println("Mensaje creado");
        }
    }
//********************************************************************************************************************   
//********************************************************************************************************************   

    public static void escriturasStream() {

        String[] lineasTexto = {
            "Linea primera",
            "Linea segunda",
            "Linea tercera",
            "cuarta linea nueva"
        };

        Writer out = null;

        try {
            FileOutputStream streamFich;
            streamFich = new FileOutputStream("fich_2.txt");
            OutputStreamWriter streamWriter;
            streamWriter = new OutputStreamWriter(streamFich, "UTF-8");
            out = new BufferedWriter(streamWriter, 10);

            for (String linea : lineasTexto) {

                try {
                    out.write(linea + "\r\n");
                } catch (IOException ex ) {
                System.err.println("Error: " + ex.getMessage());

                    }
                }

            }catch (UnsupportedEncodingException
                | FileNotFoundException ex2) {

            System.err.println("Error!! " + ex2.getMessage());

        }finally {

            try {
                out.close();
                System.out.println("Fichero Cerrado!");
            } catch (IOException ex3) {
                System.err.println("Error 3:" + ex3.getMessage());
            }
        }

        }
//********************************************************************************************************************   
//********************************************************************************************************************   
    
       public static void anexarArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            String contenido = "añadir a lo que tenemos";
            salida.println(contenido);
            salida.println();
            salida.println("fin de añadir");
            salida.close();
            System.out.println("se ha anexado escritura correctamente");
            
            
                    
        }catch(IOException ex){
            ex.printStackTrace();
            
        }
    }
//********************************************************************************************************************   
//********************************************************************************************************************         
   
       public static  void lecturaFich(){
           
           
           File fichero = new File("C:\\Users\\Admin\\Desktop\\CURSO_JAVA\\repositorio_github_local.git\\02_Colecciones\\");
           File fichFormWin = new File("C:/Users/Admin/Desktop/CURSO_JAVA/repositorio_github_local.git/02_Colecciones/fich_2.txt");
           File FicheroRutaRelativa= new File("fichero_texto.txt");
           
           //Scanner sc = new Scanner(System.in);
           Scanner escaner = null;
           
           try{
            //   System.out.println("Leyendo Fichero");
               escaner = new Scanner(fichFormWin);
               
               while(escaner.hasNextLine()){ //hasta el siguiente \n
                   
                   String linea = escaner.nextLine();
                   System.out.println(">>> \"" +linea+ " \""); // lo mostramos entre comillas
                   
                   if(linea.compareTo("\n")==0){
                       
                       System.out.println(" SON IGUALES");
                   } 
                   
               }
           }catch(Exception ex){
               
               System.err.println("Mensaje: "+ex.getMessage());
           } finally {
               
               try{
                   if(escaner != null){
                       escaner.close();
                   }
               }catch(Exception ex2){
                   System.err.println("Mensaje al cerrar "+ ex2.getMessage());
               }
           }
           
           
           
       }
       
//********************************************************************************************************************   
//********************************************************************************************************************  
       
       
       
}

    

