/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

import java.util.Scanner;

/**
 *
 * @author Agustin Gimenez 
 */
public class GameMenuView {

    public void GameMenuView() {
        
    }
    
    public void displayGameMenuView() {
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
            case "V":
                viewMap();
                break;
            case "I":
                viewInventoryItems();
                break;
            case "P":
                purchaseSupplies();
                break;
            case "L":
                exploreLocation();
                break;
            case "M":
                moveToLocation();
                break;
            case "E":
                estimateNumberOfResources();
                break;
            case "B":
                repairWagons();
                break;
            case "C":
                useTools();
                break;
            case "D":
                dealSickness();
                break;
            case "N":
                navigateTerrain();
                break;
            case "R":
                huntForResources();
                break;
            case "S":
                saveGame();
                break;
            case "H":
                getHelp();
                break;    
            case "Q":
                return true;
            default:
                System.out.println("Invalid option");
        }
        return false;
    }

    public String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("V - View Map\n"
                + "I - View list inventory items\n"
                + "P - Purchase new supplies\n"
                + "L - Explore a location\n"
                + "M - Move to new location\n"
                + "E - Estimate the resources needed\n"
                + "B - Repair Wagons\n"
                + "C - Utilize tools\n"
                + "D - Deal with Sickness\n"
                + "N - Navigate Terrain\n"
                + "R - Hunt for Resources\n"
                + "S - Save game\n"
                + "H - Help\n"
                + "Q - Quit");
        
        boolean valid = false;
        while (valid == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select menu option");
            inputs[0] = scanner.nextLine();
            inputs[0] = inputs[0].trim();
            if (inputs[0].length() < 1) {
                System.out.println("You must enter a non-blank value");
            }
            valid = true;

        }
        return inputs;
    }

    private void viewMap() {
        System.out.println("View map called");
    }

    private void viewInventoryItems() {
        System.out.println("View inventory items called");
    }

    private void purchaseSupplies() {
        System.out.println("Purchase supplies called");
    }

    private void exploreLocation() {
        System.out.println("Explore location called");
    }

    private void moveToLocation() {
        System.out.println("Move to location called");
    }

    private void estimateNumberOfResources() {
        System.out.println("Estimate number of resources called");
    }

    private void repairWagons() {
        System.out.println("Repair wagons called");
    }

    private void useTools() {
        System.out.println("Use tools called");
    }

    private void dealSickness() {
        System.out.println("Deal with sickness called");
    }

    private void navigateTerrain() {
        System.out.println("Navigate terrain called");
    }

    private void huntForResources() {
        System.out.println("Hunt for resources called");
    }

    private void saveGame() {
        System.out.println("Save game called");
    }

    private void getHelp() {
        System.out.println("Get help called");
    }
}
