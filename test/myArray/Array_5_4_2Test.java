/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myArray;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Vse
 */
public class Array_5_4_2Test {
    
    public Array_5_4_2Test() {
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
     * Test of twoGoalsPlayers method, of class Array_5_4_2.
     */
    @Test
    public void testTwoGoalsPlayers() {
        System.out.println("twoGoalsPlayers");
        Array_5_4_2 instance = new Array_5_4_2();
        int expResult = 9;
        int result = instance.twoGoalsPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of everyGameGoal method, of class Array_5_4_2.
     */
    @Test
    public void testEveryGameGoal() {
        System.out.println("everyGameGoal");
        Array_5_4_2 instance = new Array_5_4_2();
        int expResult = 3;
        int result = instance.everyGameGoal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of bestPlayer method, of class Array_5_4_2.
     */
    @Test
    public void testBestPlayer() {
        System.out.println("bestPlayer");
        Array_5_4_2 instance = new Array_5_4_2();
        int[] expResult = {9, 10};
        int[] result = instance.bestPlayer();
        assertArrayEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
    }

    
    
}
