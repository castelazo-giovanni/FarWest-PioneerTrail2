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
public class Nourishment implements Serializable {
    
    //attribute variables
    private String nourishmentType;
    private double nourishmentAmount;
    private double requiredNourishmentAmount;
    
    //def constructor
    public Nourishment() {
    }

    //constructors

    public Nourishment(String nourishmentType, double nourishmentAmount, double requiredNourishmentAmount) {
        this.nourishmentType = nourishmentType;
        this.nourishmentAmount = nourishmentAmount;
        this.requiredNourishmentAmount = requiredNourishmentAmount;
    }
    
    
    //getter and setters
    public String getNourishmentType() {
        return nourishmentType;
    }

    public void setNourishmentType(String nourishmentType) {
        this.nourishmentType = nourishmentType;
    }

    public double getNourishmentAmount() {
        return nourishmentAmount;
    }

    public void setNourishmentAmount(double nourishmentAmount) {
        this.nourishmentAmount = nourishmentAmount;
    }

    public double getRequiredNourishmentAmount() {
        return requiredNourishmentAmount;
    }

    public void setRequiredNourishmentAmount(double requiredNourishmentAmount) {
        this.requiredNourishmentAmount = requiredNourishmentAmount;
    }
    
    //equals and haschode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nourishmentType);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.nourishmentAmount) ^ (Double.doubleToLongBits(this.nourishmentAmount) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.requiredNourishmentAmount) ^ (Double.doubleToLongBits(this.requiredNourishmentAmount) >>> 32));
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
        final Nourishment other = (Nourishment) obj;
        if (Double.doubleToLongBits(this.nourishmentAmount) != Double.doubleToLongBits(other.nourishmentAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredNourishmentAmount) != Double.doubleToLongBits(other.requiredNourishmentAmount)) {
            return false;
        }
        if (!Objects.equals(this.nourishmentType, other.nourishmentType)) {
            return false;
        }
        return true;
    }
    
    //to string

    @Override
    public String toString() {
        return "Nourishment{" + "nourishmentType=" + nourishmentType + ", nourishmentAmount=" + nourishmentAmount + ", requiredNourishmentAmount=" + requiredNourishmentAmount + '}';
    }
    
    
}
