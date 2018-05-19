/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author kitka_000
 */
public class Tool implements Serializable {
    //class attributes
    private String toolType;
    private Integer toolAmount;
    private Integer requiredAmount;
    
    //constructor

    public Tool(String toolType, Integer toolAmount, Integer requiredAmount) {
        this.toolType = toolType;
        this.toolAmount = toolAmount;
        this.requiredAmount = requiredAmount;
    }
    
    
    //getter setter

    public String getToolType() {
        return toolType;
    }

    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    public Integer getToolAmount() {
        return toolAmount;
    }

    public void setToolAmount(Integer toolAmount) {
        this.toolAmount = toolAmount;
    }

    public Integer getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(Integer requiredAmount) {
        this.requiredAmount = requiredAmount;
    }
    
    //equals and hash

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.toolType);
        hash = 13 * hash + Objects.hashCode(this.toolAmount);
        hash = 13 * hash + Objects.hashCode(this.requiredAmount);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tool other = (Tool) obj;
        if (!Objects.equals(this.toolType, other.toolType)) {
            return false;
        }
        if (!Objects.equals(this.toolAmount, other.toolAmount)) {
            return false;
        }
        if (!Objects.equals(this.requiredAmount, other.requiredAmount)) {
            return false;
        }
        return true;
    }
    
    //to string

    @Override
    public String toString() {
        return "Tool{" + "toolType=" + toolType + ", toolAmount=" + toolAmount + ", requiredAmount=" + requiredAmount + '}';
    }
        
    
    
}
