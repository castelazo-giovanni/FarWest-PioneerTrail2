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
public class Health implements Serializable {
    //attribute variables
    private Boolean alive;
    private String illnessType;
    private Integer mortalityRate;
    
    //constructor

    public Health(Boolean alive, String illnessType, Integer mortalityRate) {
        this.alive = alive;
        this.illnessType = illnessType;
        this.mortalityRate = mortalityRate;
    }
    

    //getter setter

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public String getIllnessType() {
        return illnessType;
    }

    public void setIllnessType(String illnessType) {
        this.illnessType = illnessType;
    }

    public Integer getMortalityRate() {
        return mortalityRate;
    }

    public void setMortalityRate(Integer mortalityRate) {
        this.mortalityRate = mortalityRate;
    }
    
    //equals haschcode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.alive);
        hash = 29 * hash + Objects.hashCode(this.illnessType);
        hash = 29 * hash + Objects.hashCode(this.mortalityRate);
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
        final Health other = (Health) obj;
        if (!Objects.equals(this.illnessType, other.illnessType)) {
            return false;
        }
        if (!Objects.equals(this.alive, other.alive)) {
            return false;
        }
        if (!Objects.equals(this.mortalityRate, other.mortalityRate)) {
            return false;
        }
        return true;
    }
    
    //to string

    @Override
    public String toString() {
        return "Health{" + "alive=" + alive + ", illnessType=" + illnessType + ", mortalityRate=" + mortalityRate + '}';
    }
    
    
}
