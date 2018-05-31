/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.farwestgame.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni
 */
public class ResourceControlTest {
    
    public ResourceControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calNourishmentUsed method, of class ResourceControl.
     */
    @Test
    public void testCalNourishmentUsed() {
        System.out.println("calNourishmentUsed");
        
        // ---- calNourishmentUsed Test Case 1 ----
        System.out.println("\tTest case 1");
        
        // define the input variables
        int numberActors = 4;
        int milesTraveled = 150;
        
        // define the expected output value
        double expResult = 375;
        
        // call the method
        double result = ResourceControl.calNourishmentUsed(numberActors, milesTraveled);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calNourishmentUsed Test Case 2 ----
        System.out.println("\tTest case 2");
        
        // define the input variables
        numberActors = 3;
        milesTraveled = 150;
        
        // define the expected output value
        expResult = 300;
        
        // call the method
        result = ResourceControl.calNourishmentUsed(numberActors, milesTraveled);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calNourishmentUsed Test Case 3 ----
        System.out.println("\tTest case 3");
        
        // define the input variables
        numberActors = 2;
        milesTraveled = 300;
        
        // define the expected output value
        expResult = 450;
        
        // call the method
        result = ResourceControl.calNourishmentUsed(numberActors, milesTraveled);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calNourishmentUsed Test Case 4 ----
        System.out.println("\tTest case 4");
        
        // define the input variables
        numberActors = 1;
        milesTraveled = 250;
        
        // define the expected output value
        expResult = 250;
        
        // call the method
        result = ResourceControl.calNourishmentUsed(numberActors, milesTraveled);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calNourishmentUsed Test Case 5 ----
        System.out.println("\tTest case 5");
        
        // define the input variables
        numberActors = 4;
        milesTraveled = 199;
        
        // define the expected output value
        expResult = 497.5;
        
        // call the method
        result = ResourceControl.calNourishmentUsed(numberActors, milesTraveled);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calNourishmentUsed Test Case 6 ----
        System.out.println("\tTest case 6");
        
        // define the input variables
        numberActors = 3;
        milesTraveled = 180;
        
        // define the expected output value
        expResult = 360;
        
        // call the method
        result = ResourceControl.calNourishmentUsed(numberActors, milesTraveled);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calNourishmentUsed Test Case 7 ----
        System.out.println("\tTest case 7");
        
        // define the input variables
        numberActors = 2;
        milesTraveled = 260;
        
        // define the expected output value
        expResult = 390;
        
        // call the method
        result = ResourceControl.calNourishmentUsed(numberActors, milesTraveled);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
    }
    
}
