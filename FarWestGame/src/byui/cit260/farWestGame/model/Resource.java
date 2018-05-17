/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author FGL
 */
public class Resource implements Serializable{
    
    private List<String> toolList;
    private List<String> supplyList;
    private List<String> nourishmentList;

    public Resource() {
    }
    
    

    public List<String> getToolList() {
        return toolList;
    }

    public void setToolList(List<String> toolList) {
        this.toolList = toolList;
    }

    public List<String> getSupplyList() {
        return supplyList;
    }

    public void setSupplyList(List<String> supplyList) {
        this.supplyList = supplyList;
    }

    public List<String> getNourishmentList() {
        return nourishmentList;
    }

    public void setNourishmentList(List<String> nourishmentList) {
        this.nourishmentList = nourishmentList;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.toolList);
        hash = 11 * hash + Objects.hashCode(this.supplyList);
        hash = 11 * hash + Objects.hashCode(this.nourishmentList);
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
        final Resource other = (Resource) obj;
        if (!Objects.equals(this.toolList, other.toolList)) {
            return false;
        }
        if (!Objects.equals(this.supplyList, other.supplyList)) {
            return false;
        }
        if (!Objects.equals(this.nourishmentList, other.nourishmentList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Resource{" + "toolList=" + toolList + ", supplyList=" + supplyList + ", nourishmentList=" + nourishmentList + '}';
    }
    
    
}
