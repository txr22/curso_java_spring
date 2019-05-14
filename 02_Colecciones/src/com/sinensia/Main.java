package com.sinensia;

import com.sinensia.dao.ProbandoDao;
import com.sinensia.genericos.ProbandoGenericos;
import com.sinensia.poo_avanzando.ProbandoAnimales;
import com.sinensia.pruebas.Fechas;
import com.sinensia.pruebas.Colecciones;
import static com.sinensia.pruebas.Colecciones.comparaciones;
import static com.sinensia.pruebas.Ficheros.anexarArchivo;
import static com.sinensia.pruebas.Ficheros.escriturasStream;
import static com.sinensia.pruebas.Ficheros.lecturaFich;
import static com.sinensia.pruebas.Ficheros.probarEscritura;
import static com.sinensia.pruebas.Herencia.probandoHerencia;
import com.sinensia.pruebas.Polimorfismo;
import static com.sinensia.pruebas.TratamientoDeCadenas.pruebasString;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws IOException  {
        /*Polimorfismo.polimorfeandoConListas();
        //Polimorfismo.clientes.add(new Cliente(7, "Yo", null));
        Polimorfismo.poliformHashMap();*/
        //Colecciones.ejemploListas();
        //Colecciones.ejemploSet();
        // Colecciones.ejemploHashMap();
        /**Colecciones.ejemploListas();
         * Fechas.probar();
         * probandoHerencia();*/
        //  ProbandoAnimales.probarClasesAbstractas();
        // ProbandoGenericos.probarMetodo();
        // ProbandoDao.probarCliente();
       // probarEscritura();
       // escriturasStream();
      // anexarArchivo("fich_2.txt");
      //lecturaFich();
      //comparaciones();
      pruebasString();

    }
}
