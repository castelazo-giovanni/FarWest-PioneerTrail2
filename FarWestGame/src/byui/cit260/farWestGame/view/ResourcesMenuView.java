/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.GameControl;
import farwestgame.FarWestGame;
import java.util.Scanner;

/**
 *
 * @author kitka_000
 */
public class ResourcesMenuView {
    
    public ResourcesMenuView() {
    }
    
    public void displayResourcesMenuView() {
        boolean endOfView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs.length < 1 || inputs[0].toUpperCase().equals("Q")) {
                endOfView = true;
                continue;
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);
    
    }
    
    public String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("F - Insert How Much Food\n"
                + "R - Restart existing game\n"
                + "H - Get help on how to play the game\n"
                + "E - Exit");
        // Display a description of the view
        boolean valid = false;
        while (valid == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select option");
            inputs[0] = scanner.nextLine();
            inputs[0] = inputs[0].trim();
            if (inputs[0].length() < 1) {
                System.out.println("You must enter a non-blank value");
            }
            valid = true;

        }
        return inputs;
    }
    
    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();
        switch (menuItem) {
            case "N":
                startNewGame();
                break;
            case "R":
                restartGame();
                break;
            case "H":
                getHelp();
                break;
            case "E":
                return true;
            default:
                System.out.println("Invalid menu item.");
        }
        return false;
    }

  
}
