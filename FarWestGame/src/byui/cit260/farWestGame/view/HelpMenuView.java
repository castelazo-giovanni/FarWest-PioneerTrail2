/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

import java.util.Scanner;

/**
 *
 * @author Araceli Camarillo
 */
public class HelpMenuView {
    
    public HelpMenuView() {

    }
    

    public void displayHelpMenuView(){
        boolean endOfView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs.length < 1 || inputs[0].toUpperCase() == "Q") {
                continue;
            }
            endOfView = doAction(inputs);
        }while (endOfView != true);
    }
    
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase(); //all have 2B uppercase and assign to menuItem as uppercases
        switch (menuItem) {
            case "G":
                goalOfGame();
                break;
            case "M":
                howToMove();
                break;
            case "E":
                useTheResources();
                break;
            case "R":
                estimateNumberOfResources();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid Menu Item");
             }
        System.out.println("**** doAction() called ***");
        System.out.println("\tinputs = " + inputs[0]);
        return false;
       }
    
    public String[] getInputs(){
        String[] inputs = new String[1];//it's 1 cause you're only getting 1 input from user
        System.out.println("******description*********");
        // Display a description of the view
        boolean valid = false;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select option");
            inputs[0] = scanner.nextLine();
            inputs[0] = inputs[0].trim();
            inputs[0] = inputs[0].toUpperCase();
            System.out.println(inputs[0].trim());
            
            if(inputs[0].length()<1){
                System.out.println("You must enter a non-blank value");
            }
            if(inputs[0]=="Q"){
                valid = true;
            }
            
        }while (valid != true);
         return inputs;
    } 
    

    public void goalOfGame() {
        throw new UnsupportedOperationException("What is the Goal of the Game?"); //To change body of generated methods, choose Tools | Templates.
    }

    public void howToMove() {
        throw new UnsupportedOperationException("How to Move"); //To change body of generated methods, choose Tools | Templates.
    }

    public void useTheResources() {
        throw new UnsupportedOperationException("Using the Resources"); //To change body of generated methods, choose Tools | Templates.
    }

    public void estimateNumberOfResources() {
        throw new UnsupportedOperationException("Estimating the Resources"); //To change body of generated methods, choose Tools | Templates.
    }   
    
   }
