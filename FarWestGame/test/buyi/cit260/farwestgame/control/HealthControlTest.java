/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.farwestgame.control;

import byui.cit260.farWestGame.model.Actor;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FGL
 */
public class HealthControlTest {
    
    public HealthControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Author Agustin (FGL) (Individual assignment)
     * Test of gameWonLost method, of class HealthControl.
     */
    @Test
    public void testGameWonLost() {
        System.out.println("gameWonLost");
        List<Actor> family = null;
        HealthControl instance = new HealthControl();
        boolean expResult = false;
        boolean result = instance.gameWonLost(family);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
