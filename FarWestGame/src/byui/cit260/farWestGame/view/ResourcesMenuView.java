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
 * @author Araceli Camarillo
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
        System.out.println("F - Insert Amount of Food\n"
                + "A - Insert Amount of Axe\n"
                + "H - Insert Amount of Hammer\n"
                + "W - Insert Amount of Spare Wheels\n"
                + "B - Insert Amount of Bullets\n"
                + "W - Insert Amount of Wood\n"
                + "R - Insert Amount of Rest\n"
                + "D - Insert Amount of Drinking Water\n"
                + "Q - Quit");
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
    
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();
        switch (menuItem) {
            case "F":
                amountOfFood();
                break;
            case "A":
                toolAmountAxe();
                break;
            case "H":
                toolAmountHammer();
                break;
            case "W":
                resourceAmountWheels();
                break;
            case "B":
                resourceAmountBullets();
                break;
            case "R":
                restAmount();
                break;
            case "D":
                resourceAmountWater();
                break;    
            case "Q":
                return true;
            default:
                System.out.println("Invalid menu item.");
        }
        return false;
    }

    public void amountOfFood() {
        System.out.println("Insert Amount of Food"); //To change body of generated methods, choose Tools | Templates.
    }

    public void toolAmountAxe() {
        System.out.println("Insert Amount of Axe"); //To change body of generated methods, choose Tools | Templates.
    }

    public void toolAmountHammer() {
        System.out.println("Insert Amount of Hammer"); //To change body of generated methods, choose Tools | Templates.
    }

    public void resourceAmountWheels() {
        System.out.println("Insert Amount of Spare Wheels"); //To change body of generated methods, choose Tools | Templates.
    }

    public void resourceAmountBullets() {
        System.out.println("Insert Amount of Bullets"); //To change body of generated methods, choose Tools | Templates.
    }

    public void restAmount() {
        System.out.println("Insert Amount of Rest"); //To change body of generated methods, choose Tools | Templates.
    }

    public void resourceAmountWater() {
        System.out.println("Insert Amount of DrinkingWater"); //To change body of generated methods, choose Tools | Templates.
    }

  
}
