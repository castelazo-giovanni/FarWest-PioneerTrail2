/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farwestgame;

import byui.cit260.farWestGame.model.Actor;
import byui.cit260.farWestGame.model.Game;
import byui.cit260.farWestGame.model.Health;
import byui.cit260.farWestGame.model.Map;
import byui.cit260.farWestGame.model.Nourishment;
import byui.cit260.farWestGame.model.Player;
import byui.cit260.farWestGame.model.Resource;
import byui.cit260.farWestGame.model.Scene;
import byui.cit260.farWestGame.model.Supply;
import byui.cit260.farWestGame.model.Tool;
import byui.cit260.farWestGame.model.Location;
import byui.cit260.farWestGame.view.StartProgramView;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Giovanni
 */
public class FarWestGame {
    
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
    }
    
 
    
    
    
    
/** This is old code, but I didn't want to just erase it
 * Keeping it in order to have for future reference.

    // @param args the command line arguments
   
    public static void main(String[] args) {
        //game class Giovanni Castelazo
        Game game1 = new Game();
        game1.setGameName("Far West");
        System.out.println(game1.toString());
        
        //Scene class Giovanni Castelazo
        System.out.println(Scene.Zion.getSceneName());
        System.out.println(Scene.Zion.getSceneDescription());
        System.out.println(Scene.Zion.getSceneIllness());
        
        //Location class Giovanni Castelazo
        Location location1 = new Location();
        location1.setLocationVisited(true);
        location1.setLocationRemaining(true);
        location1.setRow(5);
        location1.setColumn(10);
        System.out.println(location1.toString());
        
       
        
        //player class Agustin Gimenez
        Player player1 = new Player();
        player1.setName("Gio");
        System.out.println(player1.toString());
                
        //supply class Araceli Camarillo
        Supply supply1 = new Supply("tent", 1, 5);
        System.out.println(supply1.toString());
    
        //Actor class Agustin Gimenez
        Actor actor = new Actor();
        actor.setName("Agustin");
        System.out.println(actor.toString());
        
        //Resources class Agustin Gimenez
        Resource resource1 = new Resource();
        List<String> toolList = new ArrayList<>();
        toolList.add("newTool");
        resource1.setToolList(toolList);
        System.out.println(resource1.getToolList().get(0));

        //Map class Agustin Gimenez
        Map map1 = new Map();
        map1.setRowCount(5);
        map1.setColumnCount(8);
        System.out.println(map1.toString());
        
        //Nourishment Class Araceli Camarillo
        Nourishment nourishment1 = new Nourishment("food", 1, 5);
        System.out.println(nourishment1.toString());
        
        //Health class Araceli Camarillo
        Health health1 = new Health(true, "hypothermia", 5);
        System.out.println(health1.toString());
 
        //Tool class Araceli Camarillo
        Tool tool1 = new Tool("wrench", 5, 2);
        System.out.println(tool1.toString());
        

    }
   */ 
}
