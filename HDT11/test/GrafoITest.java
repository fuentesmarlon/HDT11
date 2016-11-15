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
public class GrafoITest {
    
    public GrafoITest() {
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
     * Test of agregar method, of class Grafo.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Object ciudad = null;
        Grafo instance = new Grafo();
        instance.agregar(ciudad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarGrafo method, of class Grafo.
     */
    @Test
    public void testAgregarGrafo() {
        System.out.println("agregarGrafo");
        Object ciudad1 = null;
        Object ciudad2 = null;
        Object distancia = null;
        Grafo instance = new Grafo();
        instance.agregarGrafo(ciudad1, ciudad2, distancia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Grafo.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int ciudad = 0;
        Grafo instance = new Grafo();
        Object expResult = null;
        Object result = instance.get(ciudad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getD method, of class Grafo.
     */
    @Test
    public void testGetD() {
        System.out.println("getD");
        Object ciudad1 = null;
        Object ciudad2 = null;
        Grafo instance = new Grafo();
        int expResult = 0;
        int result = instance.getD(ciudad1, ciudad2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contenido method, of class Grafo.
     */
    @Test
    public void testContenido() {
        System.out.println("contenido");
        Object ciudad = null;
        Grafo instance = new Grafo();
        boolean expResult = false;
        boolean result = instance.contenido(ciudad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndice method, of class Grafo.
     */
    @Test
    public void testGetIndice() {
        System.out.println("getIndice");
        Object ciudad = null;
        Grafo instance = new Grafo();
        int expResult = 0;
        int result = instance.getIndice(ciudad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class Grafo.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        Grafo instance = new Grafo();
        instance.mostrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of largo method, of class Grafo.
     */
    @Test
    public void testLargo() {
        System.out.println("largo");
        Grafo instance = new Grafo();
        int expResult = 0;
        int result = instance.largo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
