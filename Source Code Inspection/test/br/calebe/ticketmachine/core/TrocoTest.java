/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leona
 */
public class TrocoTest {
    
    public TrocoTest() {
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
     * Test of getIterator method, of class Troco.
     */
    @Test
    public void testGetIterator() {
        System.out.println("getIterator");
        //Troco instance = null;
        //Iterator<PapelMoeda> expResult = null;
        //Iterator<PapelMoeda> result = instance.getIterator();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        Troco instance = null;
        //Iterator<Integer> expResult = null;
        Iterator<PapelMoeda> result = instance.getIterator();
        assertNull(result);
    }
}
