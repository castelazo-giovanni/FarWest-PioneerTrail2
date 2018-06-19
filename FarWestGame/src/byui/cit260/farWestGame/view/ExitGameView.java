/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;
import byui.cit260.farWestGame.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Giovanni
 */
public class ExitGameView {
   
    public ExitGameView(){
        
    }
    
    public void displayExitGameView(){
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
    
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase(); 
        switch (menuItem) {
            case "E":
                exitGame();
                break;
            case "S":
                saveGame();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid option");
        }
        return false;
    }
    
    public String[] getInputs() {
        String[] inputs = new String[1]; //it's 1 cause you're only getting 1 input from user
        System.out.println("\nAre you Sure you want to Quit"
                + "\n If you end now, all progress will be lost"
                + "\nE - End Game without Saving"
                + "\nS - Save Game and exit"
                + "\nQ - Return to main menu"
                + "\n");
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
    
    public void exitGame() {
        System.out.println("exit of program called");
    }
    
    public void saveGame() {
        System.out.println("saving of game called");
        System.out.println("after game is saved, exit of program is called");        
    }

    
}
