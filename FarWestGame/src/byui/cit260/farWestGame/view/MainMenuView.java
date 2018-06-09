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
public class MainMenuView {

    public MainMenuView() {
    }

//    //author Agustin Gimenez Main Menu
//    public void displayMainMenuView() {
//
//        boolean valid = false;//new variable assigned value
//        while (valid==false) { //compared value if it's false
//            valid = this.doAction(this.getInputs());
//        }
//
//    }
//
//    public boolean doAction(String[] inputs) {
//        String menuItem = inputs[0];
//        menuItem = menuItem.toUpperCase(); //all have 2B uppercase and assign to menuItem as uppercases
//        switch (menuItem) {
//            case "N":
//                startNewGame();
//                break;
//            case "R":
//                restartGame();
//                break;
//            case "H":
//                getHelp();
//                break;
//            case "E":
//                return true;
//            default:
//                System.out.println("Invalid Menu Item");
//        }
//        System.out.println("**** doAction() called ***");
//        System.out.println("\tinputs = " + inputs[0]);
//
//        return false;  //false because doAction is asking for a boolean since most of values are not booleans it'll ret as false
//    }
//
//    public String[] getInputs() {
////
//        String[] inputs = new String[1];
//        System.out.println("******description*********");
//// Display a description of the view
////
//        boolean valid = false;
//        while (valid == false) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Select option");
//            inputs[0] = scanner.nextLine();
//            inputs[0] = inputs[0].trim();
//            inputs[0] = inputs[0].toUpperCase();
//            System.out.println(inputs[0].trim());
//            if (inputs[0].length() < 1) {
//                System.out.println("You must enter a non-blank value");
//            }
//            if (inputs[0].equals("N")) {
//                valid = true;
//
//            }
//        }
////
////Display the prompt message
////Get the value entered from the keyboard
////Trim off leading and trailing blanks from the value
//
////IF length of the value < 1 then
////Display "You must enter a non-blank value”
////Continue (move to the top of the loop and repeat)
////ENDIF
////Assign the value to the fist position in the inputs array
////valid = true (ends the loop)
////ENDWHILE
//        return inputs;
//    }
//
//    public void startNewGame() {
//        System.out.println("Start New Game"); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void restartGame() {
//        System.out.println("Restart Game"); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void getHelp() {
//        System.out.println("Get Help"); //To change body of generated methods, choose Tools | Templates.
//    }
    public void displayMainMenuView() {
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

    private String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("N - Start new game\n"
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

    private void startNewGame() {
        GameControl.createNewGame(FarWestGame.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView(); 
        helpMenuView.displayHelpMenuView();
    }

}
