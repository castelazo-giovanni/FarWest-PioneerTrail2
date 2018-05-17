/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.model;

/**
 *
 * @author Giovanni
 */
public class FarWestGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //game class Giovanni Castelazo
        Game game1 = new Game();
        game1.setGameName("Far West");
        System.out.println(game1.toString());
        
        //player class Agustin Gimenez
        Player player1 = new Player();
        player1.setName("Gio");
        System.out.println(player1.toString());
                
        //supply class Araceli Camarillo
        Supply supply1 = new Supply("hammer", 1, 5);
        System.out.println(supply1.toString());
        
        
        
    }
    
}
