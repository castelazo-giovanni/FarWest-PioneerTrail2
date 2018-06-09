/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.model.Actor;
import java.util.List;

/**
 *
 * @author Agustin Gimenez FGL (Individual Assignment)
 */
public class HealthControl {
    public boolean gameWonLost(List<Actor> family){
       int count=0;
       for(Actor actor: family){
           if(actor.isAlive()){
               count++;
           }
       }
       if(count>2){
           return true;
       }else{
           return false;
       }
   }
}
