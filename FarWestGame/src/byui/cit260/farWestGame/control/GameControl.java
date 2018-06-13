/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.model.DiceControl;
import byui.cit260.farWestGame.model.Game;
import byui.cit260.farWestGame.model.Player;
import byui.cit260.farWestGame.view.GameMenuView;

/**
 *
 * @author Agustin Gimenez
 */
public class GameControl {
    
    public static void createNewGame(Player player){
        System.out.println("Start game called");        
    }
    
    public static void exploreLocation(int hours) {
        int total = DiceControl.rollDices(2);
        switch (hours) {
            case 1:
                if (total > 9) {
                    System.out.println("You have found something");
                } else {
                    System.out.println("You did not find anything and got wounded");
                }
                break;
            case 2:
                if (total > 13) {
                    System.out.println("You have found something");
                } else {
                    System.out.println("You did not find anything and got wounded");
                }
                break;
            case 3:
                if (total > 18) {
                    System.out.println("You have found something");
                } else {
                    System.out.println("You did not find anything and got wounded");
                }
                break;
            default:
                System.out.println("There was an error, please try again");
        }

    }
}
