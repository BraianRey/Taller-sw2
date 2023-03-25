/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author BRC_X
 */
public class ViajeFamiliarTest {
    
    public ViajeFamiliarTest() {
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
     * Test of descripcion method, of class ViajeFamiliar.
     */
    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        ViajeFamiliar instance = new ViajeFamiliar();
        String expResult = "Viaje para disfrutar con toda tu familia";
        String result = instance.descripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)){
            fail("Error en Descripcion.");
        }
    }

    /**
     * Test of cualquierMetodo2 method, of class ViajeFamiliar.
     */
    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        ViajeFamiliar instance = new ViajeFamiliar();
        String expResult = "Metodo implementado en la clase hija viaje familiar";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)){
            fail("Error en cualquierMetodo2.");
        }
    }

    /**
     * Test of getFamilia method, of class ViajeFamiliar.
     */
    /*@Test
    public void testGetFamilia() {
        System.out.println("getFamilia");
        ViajeFamiliar instance = new ViajeFamiliar();
        int expResult = 0;
        int result = instance.getFamilia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFamilia method, of class ViajeFamiliar.
     */
    /*@Test
    public void testSetFamilia() {
        System.out.println("setFamilia");
        int familia = 0;
        ViajeFamiliar instance = new ViajeFamiliar();
        instance.setFamilia(familia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
