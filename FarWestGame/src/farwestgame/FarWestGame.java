/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farwestgame;

import byui.cit260.farWestGame.model.Game;
import byui.cit260.farWestGame.model.Player;
import byui.cit260.farWestGame.view.StartProgramView;

/**
 *
 * @author Giovanni
 */
public class FarWestGame {
    
    private static Player player;
    private static Game game;
    
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        FarWestGame.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        FarWestGame.game = game;
    }
    
    
    
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }   
    
}
