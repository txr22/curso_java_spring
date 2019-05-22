/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.test;

import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class ClienteJUnitTest {
    
    public ClienteJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


     @Test
     public void probarJUnit() {
     
         //assertEquals(10, 10);
         //assertEquals("TexTo", "Texto");
        // assertNotEquals("TexTo", "Texto");
         
     }
     
     @Test
     public void probarClienteDAO(){
         ClienteDAO daoCli = new ClienteDAO();
         daoCli.insertar(new Cliente(1, "prueba", "pruebas@sdj.com", (short)20,(short) 1, "pass"));
         
         daoCli.insertar(new Cliente(2, "prueba", "pruebas@sdj.com", (short)23,(short) 0, "pass"));
         
         //VER SI EL TAMAÑO DEL ARRAY ES DEL TAMAÑO ESPECIFICADO....
        // assertEquals(daoCli.obtenerTodos().size(), 2);
      
         Cliente cli = daoCli.obtenerUno(2);
         assertTrue(cli.getEmail().equals("pruebas@sdj.com"));
         
         
     }
     
}
