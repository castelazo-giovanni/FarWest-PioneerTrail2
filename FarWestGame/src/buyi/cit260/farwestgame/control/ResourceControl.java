/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.farwestgame.control;


public class ResourceControl {
    // Author Giovanni (team assignment)
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
    
    // Author Giovanni (individual assignment)
    public static double calResource(int beginningWheel, int beginningBullets, int beginningWood, int remainingNourishment) {
        
        // checks to make sure that beginning wheel does not exceed max
        if (beginningWheel < 0 || beginningWheel > 10) {
            return -1;
        }
        
        // checks to make sure that beginning bullets do not exceed max
        if (beginningBullets < 0 || beginningBullets > 5000) {
            return -1;
        }  
        
        // checks to make sure that beginning wood does not exceed max
        if (beginningWood < 0 || beginningWood > 50) {
            return -1;
        }
        
        // checks to make sure that beginning nourishment does not exceed max
        if (beginningNourishment < 0 || beginningNourishment > 500) {
            return -1;
        }
        
        // calculates the total resource weight
        double totalResourceWeight = (beginningWheel * 50) + (beginningBullets * .10) + (beginningWood * 50) + remainingNourishment;
        
        // calculates if total resource weight exceeds limits
        
        if (totalResourceWeight > 500) {
            return -1;
        } else {        
        return totalResourceWeight;
        }
    }
    
    public static double calSupplyFound(int userWheel, int userBullets, int userWood, int beginningWheel, int beginningBullets, int beginningWood, int wheelAvailable, int bulletsAvailable, int woodAvailable) {
    
        
        if (beginningWheel < 0 || beginningWheel > 10) {
            return -1;
        }
        
        if (beginningBullets < 0 || beginningBullets > 5000) {
            return -1;
        }
        
        if (beginningWood < 0 || beginningWood > 50) {
            return -1;
        }
        
        if (userWheel > wheelAvailable) {
            return -1;
        }
        
        if (userBullets > bulletsAvailable) {
            return -1;
        }
        
        if (userWood > woodAvailable) {
            return -1;
        }
        
        if (beginningWheel + userWheel > 10) {
            return -1;
        }
        
        if (beginningBullets + userBullets > 10) {
            return -1;
        }
        
        if (beginningWood + userWood > 10) {
            return -1;
        }
        
        int wheel = 50;
        double bullets = 0.1;
        int wood = 10;
        
        beginningWheel =+ userWheel;
        beginningBullets =+ userBullets;
        beginningWood =+ userWood;
        
        supplyWeight = (beginningWheel * wheel) + (beginningBullets * bullets) + (beginningWood * wood);
                
          if (supplyWeight > 500) {
            return -1;
          }      
                
        return beginningWheel; 
        return beginningBullets; 
        return beginningWood; 
        return supplyWeight;
        
        
}
