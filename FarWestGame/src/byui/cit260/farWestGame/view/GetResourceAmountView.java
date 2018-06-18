/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

/**
 *
 * @author Araceli Camarillo
 */
public class GetResourceAmountView {

    private String inventoryType;

    /**
     * Get the value of inventoryType
     *
     * @return the value of inventoryType
     */
    public String getInventoryType() {
        return inventoryType;
    }

    /**
     * Set the value of inventoryType
     *
     * @param inventoryType new value of inventoryType
     */
    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public GetResourceAmountView() {
    }
    
    public void display() {
    System.out.println("Getting Amount for "+inventoryType); //displaying what we set that property for
    }
}
