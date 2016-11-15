/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marlon
 */
public class ReadFileITest {
    
    public ReadFileITest() {
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

    /**
     * Test of LeerArchivo method, of class ReadFile.
     */
    @Test
    public void testLeerArchivo() throws Exception {
        System.out.println("LeerArchivo");
        String direccion = "";
        ReadFile instance = new ReadFile();
        instance.LeerArchivo(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Arcos method, of class ReadFile.
     */
    @Test
    public void testArcos() throws Exception {
        System.out.println("Arcos");
        ReadFile instance = new ReadFile();
        GrafoInterfaz expResult = null;
        GrafoInterfaz result = instance.Arcos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Escribir method, of class ReadFile.
     */
    @Test
    public void testEscribir() throws Exception {
        System.out.println("Escribir");
        String cadena = "";
        ReadFile instance = new ReadFile();
        instance.Escribir(cadena);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
