/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.unicauca.tallerpolimorfismo.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jorge
 */
public class ViajeTodoIncluidoTest {
  
    
    public ViajeTodoIncluidoTest() throws ParseException {
       
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of descripcion method, of class ViajeTodoIncluido.
     */
    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        ViajeTodoIncluido instance = new ViajeTodoIncluido();
        String expResult = "Disfruta tu viaje todo incluido";
        String result = instance.descripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
         fail("The test case is a prototype.");   
        }
    }
    
    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        ViajeIndividual instance = new ViajeIndividual();
        String expResult = "Cualquier método2 implementado en la clase base";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
         fail("The test case is a prototype.");   
        }
        
    }
    
}
