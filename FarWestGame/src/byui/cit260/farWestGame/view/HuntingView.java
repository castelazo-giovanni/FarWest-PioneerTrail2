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
// public class HuntingView {
public class HuntingView extends View { 
    
   public HuntingView(){
       
   }
   /* 
   public void displayHuntingView(){
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
   */
   
   /*
   public String[] getInputs() {
        String[] inputs = new String[1]; //it's 1 cause you're only getting 1 input from user
        System.out.println("\nWhat would you like to hunt?"
                + "\nR - Hunt for rabbit"
                + "\nB - Hunt for birds"
                + "\nD - Hunt a deer"
                + "\nQ - Stop hunting"
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
   */
   
   public String[] getInputs() {
        System.out.println("\nWhat would you like to hunt?"
                + "\nR - Hunt for rabbit"
                + "\nB - Hunt for birds"
                + "\nD - Hunt a deer"
                + "\nQ - Stop hunting"
                + "\n");
        
        String[] inputs;
        inputs = this.getInput("\nSelect animal to hunt.");
        return inputs;
        
    }
   
   public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase(); 
        switch (menuItem) {
            case "R":
                huntRabbit();
                break;
            case "B":
                huntBirds();
                break;
            case "D":
                huntDeer();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid option");
        }
        return false;
    }
   
   public void huntRabbit() {
        System.out.println("Rabbit is hunted.");
        System.out.println("10 bullets removed from inventory");
        System.out.println("Remaining bullet inventory is displayed");
    }
   
   public void huntBirds() {
        System.out.println("Birds are hunted.");
        System.out.println("20 bullets removed from inventory");
        System.out.println("Remaining bullet inventory is displayed");
    }
   
   public void huntDeer() {
        System.out.println("Deer is hunted.");
        System.out.println("60 bullets removed from inventory");
        System.out.println("Remaining bullet inventory is displayed");
    }
}
