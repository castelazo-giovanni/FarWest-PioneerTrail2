/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.farwestgame.control;

/**
 *
 * @author Giovanni
 */
public class ResourceControl {
    
    public static double calNourishmentUsed(int numberActors, int milesTraveled) {
        
        // checks to make sure you don't have too many or not enough actors
        if (numberActors < 1 || numberActors > 4){
            return -1;
        }
        
        /* checks to make sure the program did not return an 
           invalid number of miles traveled */
        if (milesTraveled < 0) {
            return -1;
        }
        
        /*  following blocks of code will check to see if the miles traveled 
            caused the family to use more nourishment than the max allows */
        if (numberActors == 1 && milesTraveled > 500) {
            return -1;
        }
        
        if (numberActors == 2 && milesTraveled > 333) {
            return -1;
        }
        
        if (numberActors == 3 && milesTraveled > 250) {
            return -1;
        }
        
        if (numberActors == 4 && milesTraveled > 200) {
            return -1;
        }
        
        // code calculates the nourishment used by the group
        double nourishmentUsed = .5 * milesTraveled * (numberActors + 1);
        
        return nourishmentUsed;
    }
    
    
    
}
