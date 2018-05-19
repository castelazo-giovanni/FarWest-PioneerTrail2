/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.model;

import java.io.Serializable;

/**
 *
 * @author Giovanni
 */
public class Location implements Serializable{
    private boolean locationVisited;
    private boolean locationRemaining;
    private int row;
    private int column;
    private Map map;

    public Location() {
    }    
    
    public boolean isLocationVisited() {
        return locationVisited;
    }

    public void setLocationVisited(boolean locationVisited) {
        this.locationVisited = locationVisited;
    }

    public boolean isLocationRemaining() {
        return locationRemaining;
    }

    public void setLocationRemaining(boolean locationRemaining) {
        this.locationRemaining = locationRemaining;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.locationVisited ? 1 : 0);
        hash = 53 * hash + (this.locationRemaining ? 1 : 0);
        hash = 53 * hash + this.row;
        hash = 53 * hash + this.column;
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "locationVisited=" + locationVisited + ", locationRemaining=" + locationRemaining + ", row=" + row + ", column=" + column + '}';
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
        final Location other = (Location) obj;
        if (this.locationVisited != other.locationVisited) {
            return false;
        }
        if (this.locationRemaining != other.locationRemaining) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        return true;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    
    
}
