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
public class ViajeIncentivoTest {
    
    ViajeIncentivo instance;
    
    public ViajeIncentivoTest() throws ParseException {
           this.instance = new ViajeIncentivo("Popayán", "Medellin", 2100000, new
        SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new
        SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
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
     * Test of descripcion method, of class ViajeIncentivo.
     */
    @Test
    public void testDescripcion()  {
        System.out.println("descripcion");
        String expResult = "Viaje incentivo que te envia la empresa " + instance.getEmpresa();
        String result = this.instance.descripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("The test case is a prototype.");  
        }

    }

    /**
     * Test of cualquierMetodo2 method, of class ViajeIncentivo.
     */
    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        String expResult = "Método implementado en la clase hija viaje de incentivo";
        String result = this.instance.cualquierMetodo2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
         fail("The test case is a prototype.");   
        }
        
    }
    /**
     * Test of getEmpresa method, of class ViajeIncentivo.
     */
//    @Test
//    public void testGetEmpresa() {
//        System.out.println("getEmpresa");
//        ViajeIncentivo instance = null;
//        String expResult = "";
//        String result = instance.getEmpresa();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEmpresa method, of class ViajeIncentivo.
//     */
//    @Test
//    public void testSetEmpresa() {
//        System.out.println("setEmpresa");
//        String empresa = "";
//        ViajeIncentivo instance = null;
//        instance.setEmpresa(empresa);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

   
    
}
