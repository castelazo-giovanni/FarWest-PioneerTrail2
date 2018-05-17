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
 * @author Camarillo-Araceli
 */
public class Supply implements Serializable {
    //class instance variable
    private String supplyType;
    private double supplyAmount;
    private double amountRequired;

    public Supply() {
    }

    
    public Supply(String supplyType, double supplyAmount, double amountRequired) {
        this.supplyType = supplyType;
        this.supplyAmount = supplyAmount;
        this.amountRequired = amountRequired;
    }
    
    

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    public double getSupplyAmount() {
        return supplyAmount;
    }

    public void setSupplyAmount(double supplyAmount) {
        this.supplyAmount = supplyAmount;
    }

    public double getAmountRequired() {
        return amountRequired;
    }

    public void setAmountRequired(double amountRequired) {
        this.amountRequired = amountRequired;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.supplyType);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.supplyAmount) ^ (Double.doubleToLongBits(this.supplyAmount) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.amountRequired) ^ (Double.doubleToLongBits(this.amountRequired) >>> 32));
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
        final Supply other = (Supply) obj;
        if (Double.doubleToLongBits(this.supplyAmount) != Double.doubleToLongBits(other.supplyAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountRequired) != Double.doubleToLongBits(other.amountRequired)) {
            return false;
        }
        if (!Objects.equals(this.supplyType, other.supplyType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Supply{" + "supplyType=" + supplyType + ", supplyAmount=" + supplyAmount + ", amountRequired=" + amountRequired + '}';
    }
    
    
    
    
}
