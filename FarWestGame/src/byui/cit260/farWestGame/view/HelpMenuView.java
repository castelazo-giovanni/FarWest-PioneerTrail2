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

    public void displayHelpMenuView() {
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
        menuItem = menuItem.toUpperCase(); //all have 2B uppercase and assign to menuItem as uppercases
        switch (menuItem) {
            case "G":
                goalOfGame();
                break;
            case "M":
                howToMove();
                break;
            case "E":
                estimateNumberOfResources();
                break;
            case "R":
                useTheResources();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid Menu Item");
        }
        return false;
    }

    public String[] getInputs() {
        String[] inputs = new String[1];//it's 1 cause you're only getting 1 input from user
        System.out.println("G - What is the goal of the game?\n"
                + "M - How to move\n"
                + "E - Estimate the number of resources\n"
                + "R - Use the resources\n"
                + "Q - Quit");
        // Display a description of the view
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

    public void goalOfGame() {
        System.out.println("goal of the game called");
    }

    public void howToMove() {
        System.out.println("how to move called");
    }

    public void useTheResources() {
        System.out.println("use the resource called");
    }

    public void estimateNumberOfResources() {
        System.out.println("estimate number of resources called");
    }

}
