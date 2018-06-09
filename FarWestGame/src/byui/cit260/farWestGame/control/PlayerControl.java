/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.model.Player;

/**
 *
 * @author Agustin Gimenez
 */
public class PlayerControl {
    
    public static Player savePlayer(String playerName){
        if(playerName==null){
            return null;
        }
        Player player= new Player();
        player.setName(playerName);
        return player;  
    }
}
