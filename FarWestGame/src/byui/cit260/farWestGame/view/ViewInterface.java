/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

/**
 *
 * @author Giovanni
 */
public interface ViewInterface {
    public void display();
    public String[] getInputs();

    /**
     *
     * @param promptMessage
     * @return
     */
    public String[] getInput(String promptMessage);
    public boolean doAction(String[] inputs);    
}