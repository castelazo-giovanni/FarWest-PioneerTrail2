/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.model;

/**
 *
 * @author Agustin
 */
public class DiceControl {

    public static int roll() { //roll a dice function
        double random = Math.random() * 6;
        return (int) random + 1;
    }

    public static int rollDices(int numberOfDices) { // roll many dices
        int total = 0;
        for (int i = 0; i < numberOfDices; i++) {
            int subTotal = roll();
            System.out.println("dice N " + (i + 1) + ": " + subTotal);
            total += subTotal;
        }
        return total;
    }
}
