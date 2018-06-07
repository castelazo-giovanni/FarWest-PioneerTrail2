/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

import java.util.Scanner;

/**
 *
 * @author Giovanni
 */
public class StartProgramView {

    public StartProgramView() {

    }

    private void displayStartProgramView() {
        boolean endOfView;
        endOfView = false;
        do {
            String[] inputs = this.geInputs();
            if (inputs.length < 1 || inputs[0] == "Q") {
                continue;
            }
            endOfView = doAction(inputs);
        } while (endOfView != true);

    }

    private boolean doAction(String[] inputs) {
        System.out.println("**** doAction() called ***");
        System.out.println("\tinputs = " + inputs[0]);

        return true;
    }

    private String[] geInputs() {
        System.out.println("**** getInputs() called ****");

        String[] inputs = new String[1];
        inputs[0] = "testInput";

        return inputs;
    }

    public String[] getInputs() {
//
        String[] inputs = new String[1];
// Display a description of the view
//
        boolean valid = false;
        while (valid == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select option");
            String menuOption = scanner.nextLine();
            menuOption = menuOption.trim();
            menuOption = menuOption.toUpperCase();
            System.out.println(menuOption.trim());
            if (menuOption.length() < 1) {
                System.out.println("You must enter a non-blank value");
            }
            if (menuOption.equals("Q")) {
                valid = true;
                
            }
        }
//
//Display the prompt message
//Get the value entered from the keyboard
//Trim off leading and trailing blanks from the value

//IF length of the value < 1 then
//Display "You must enter a non-blank value”
//Continue (move to the top of the loop and repeat)
//ENDIF
//Assign the value to the fist position in the inputs array
//valid = true (ends the loop)
//ENDWHILE
        return inputs;
    }

    public void display() {
        System.out.println("**** display() called ****");
    }

}
