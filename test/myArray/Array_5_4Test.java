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

/**
 *
 * @author pupil
 */
public class Array_5_4Test {
    
    public Array_5_4Test() {
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
     * Test of oddEvenQty method, of class Array_5_4_1.
     */
    @Test
    public void testOddEvenQty() {
        System.out.println("oddEvenQty");
        Array_5_4_1 instance = new Array_5_4_1();
        int[] expResult = {6, 4};
        int[] result = instance.oddEvenQty();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of maxMinElement method, of class Array_5_4_1.
     */
    @Test
    public void testMaxMinElement() {
        System.out.println("maxMinElement");
        Array_5_4_1 instance = new Array_5_4_1();
        int[] expResult = {66, -87};
        int[] result = instance.maxMinElement();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of maxMinQty method, of class Array_5_4_1.
     */
    @Test
    public void testMaxMinQty() {
        System.out.println("maxMinQty");
        Array_5_4_1 instance = new Array_5_4_1();
        int[] expResult = {2, 2};
        int[] result = instance.maxMinQty();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of elementPosition method, of class Array_5_4_1.
     */
    @Test
    public void testElementPosition() {
        System.out.println("elementPosition");
        Array_5_4_1 instance = new Array_5_4_1();
                                //  {15, 45 , -3, 0, 66, -87, -33, 66, -87, 16}
        int[] expResult = {5, 8, 6, 9};     //  {firstMaxPosition-5, lastMaxPosition-8,firstMinPosition-6, lastMinPosition-9}
        int[] result = instance.elementPosition();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of replaceMinMax method, of class Array_5_4_1.
     */
    @Test
    public void testReplaceMinMax() {
        System.out.println("replaceMinMax");
        Array_5_4_1 instance = new Array_5_4_1();
                                    //  {15, 45 , -3, 0, 66, -87, -33, 66, -87, 16}
                                    
        int[] expResult = {-87, 45, -3, 0, 16, 15, -33, 66, -87, 66};
        int[] result = instance.replaceMinMax();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of numberArrayayAverage method, of class Array_5_4_1.
     */
    @Test
    public void testNumberArrayayAverage() {
        System.out.println("numberArrayayAverage");
        Array_5_4_1 instance = new Array_5_4_1();
                                    //  {15, 45 , -3, 0, 66, -87, -33, 66, -87, 16}
        double expResult = -0.20;
        double result = instance.numberArrayayAverage();
        assertEquals(expResult, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sumPosAftNull method, of class Array_5_4_1.
     */
    @Test
    public void testSumPosAftNull() {
        System.out.println("sumPosAftNull");
        Array_5_4_1 instance = new Array_5_4_1();
                                    //  {15, 45 , -3, 0, 66, -87, -33, 66, -87, 16}
        int expResult = 148;
        int result = instance.sumPosAftNull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of secondLargestElement method, of class Array_5_4_1.
     */
    @Test
    public void testSecondLargestElement() {
        System.out.println("secondLargestElement");
        Array_5_4_1 instance = new Array_5_4_1();
                                    //  {15, 45 , -3, 0, 66, -87, -33, 66, -87, 16}
        int expResult = 45;
        int result = instance.secondLargestElement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of uniqueElemsQty method, of class Array_5_4_1.
     */
    @Test
    public void testUniqueElemsQty() {
        System.out.println("uniqueElemsQty");
        Array_5_4_1 instance = new Array_5_4_1();
        int expResult = 8;
        int result = instance.uniqueElemsQty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of nullsReordered method, of class Array_5_4_1.
     */
    @Test
    public void testNullsReordered() {
        System.out.println("nullsReordered");
        Array_5_4_1 instance = new Array_5_4_1();
                             //  {15, 45 , -3, 0, 66, -87, -33, 66, -87, 16}
        int[] expResult = {15, 45 , -3, 66, -87, -33, 66, -87, 16, 0};
        int[] result = instance.nullsReordered();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
