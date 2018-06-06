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
public class StartProgramView {

    public StartProgramView() {
        
    }
        
    private void displayStartProgramView() {
            boolean endOfView;
            endOfView = false;
            do {
              String[] inputs = this.geInputs();
              if (inputs.length < 1 || inputs[0] == "Q"){
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
        inputs[0]= "testInput";

        return inputs;
    }

    public void display() {
        System.out.println("**** display() called ****");
    }
    
   
}

