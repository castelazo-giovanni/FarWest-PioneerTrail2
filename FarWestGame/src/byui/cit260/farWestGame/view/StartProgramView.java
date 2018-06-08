/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

import java.util.Scanner;

/**
 *
 * @author Giovanni Castelazo
 */
public class StartProgramView {

    public StartProgramView() {

    }

    private void displayStartProgramView() {
        boolean endOfView;
        endOfView = false;
        do {
            String[] inputs = this.getInputs();
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

//    private String[] geInputs() {
//        System.out.println("**** getInputs() called ****");
//
//        String[] inputs = new String[1];
//        inputs[0] = "testInput";
//
//        return inputs;
//    }
    
    
    //@author Agustin Gimenez
    public String[] getInputs() {

        String[] inputs = new String[1];
        System.out.println("      _      _______ _    _ ______   _____ _____ ____  _   _ ______ ______ _____    _______ _____            _____ _           _    \n"
                + "   /\\| |/\\  |__   __| |  | |  ____| |  __ \\_   _/ __ \\| \\ | |  ____|  ____|  __ \\  |__   __|  __ \\     /\\   |_   _| |       /\\| |/\\ \n"
                + "   \\ ` ' /     | |  | |__| | |__    | |__) || || |  | |  \\| | |__  | |__  | |__) |    | |  | |__) |   /  \\    | | | |       \\ ` ' / \n"
                + "  |_     _|    | |  |  __  |  __|   |  ___/ | || |  | | . ` |  __| |  __| |  _  /     | |  |  _  /   / /\\ \\   | | | |      |_     _|\n"
                + "   / , . \\     | |  | |  | | |____  | |    _| || |__| | |\\  | |____| |____| | \\ \\     | |  | | \\ \\  / ____ \\ _| |_| |____   / , . \\ \n"
                + "   \\/|_|\\/     |_|  |_|  |_|______| |_|   |_____\\____/|_| \\_|______|______|_|  \\_\\    |_|  |_|  \\_\\/_/    \\_\\_____|______|  \\/|_|\\/ \n"
                + "                                                                                                                                    \n"
                + "                                                                                                                                    "
                + "\n"
                + "***************************************************************"
                + "\nWelcome to the Pioneer Trail game!"
                + "\nIn this game, you will be a pioneer family"
                + "\nwho leads a wagon train preparing to go west."
                + "\nYou have suffered constant religious persecution"
                + "\nand wish to find freedom and a new life in a better place."
                + "\nYou have heard of a place called Zion in the mountains"
                + "\nthat offers such freedom and are eager to start your journey."
                + "\n"
                + "\nGood luck in your Journey!\n"
                + "***************************************************************\n");

        boolean valid = false;
        while (valid == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name");
            inputs[0] = scanner.nextLine();
            inputs[0] = inputs[0].trim();
            inputs[0] = inputs[0].toUpperCase();
            System.out.println(inputs[0].trim());
            if (inputs[0].length() < 1) {
                System.out.println("You must enter a non-blank value");
            }
            if (inputs[0].equals("Q")) {
                valid = true;
            }
        }

        return inputs;
    }

//@author Agustin Gimenez
    
//doAction(inputs): boolean {
    public boolean doAction(inputs){
//playersName = get the first value in the inputs array
playersName = inputs[0];
//player = savePlayer(playersName)
player = savePlayer(playersName);        
//IF player == null
// display “Could not create the player. “ +
// “Enter a different name.”
// RETURN false
//ENDIF
if (player == null) {
    System.out.println("Could not create the player.\n"
            + "Enter a different name.");    
                return false;
}
//DISPLAY "================================================= "
// + "Welcome to the game " + playersName
// + "We hope you have a lot of fun!”
// + "================================================= "
System.out.println("============================================\n"
        + "Welcome to the game " + playersName
        + "We hope you have a lot of fun!\n"
                + "============================================\n");
//mainMenuView = Create a new MainMenuView object
//mainMenuView.displayMainMenuView()
//RETURN true
//}
//    
   } 
    
    public void display() {
        System.out.println("**** display() called ****");
    }

}
