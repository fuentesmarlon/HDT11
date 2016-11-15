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
public class FloydITest {
    
    public FloydITest() {
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
     * Test of Corto method, of class Floyd.
     */
    @Test
    public void testCorto() {
        System.out.println("Corto");
        Floyd instance = new Floyd();
        instance.Corto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Grafo method, of class Floyd.
     */
    @Test
    public void testGrafo() {
        System.out.println("Grafo");
        Floyd instance = new Floyd();
        instance.Grafo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Intermedias method, of class Floyd.
     */
    @Test
    public void testIntermedias() {
        System.out.println("Intermedias");
        int num = 0;
        int num2 = 0;
        Floyd instance = new Floyd();
        instance.Intermedias(num, num2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
