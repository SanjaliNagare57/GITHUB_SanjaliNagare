/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import java.util.*;

/**
 *
 * @author preet
 */
public class FDAadmin {
    int incidentID;
    String country;
     Map<String,Integer> approvedMedicine= new HashMap();
    List<String> manufacturer= new ArrayList();

    public int getIncidentID() {
        return incidentID;
    }

    public void setIncidentID(int incidentID) {
        this.incidentID = incidentID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Map getApprovedMedicine() {
        return approvedMedicine;
    }

    public void setApprovedMedicine(Map approvedMedicine) {
        this.approvedMedicine = approvedMedicine;
    }

    public List getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(List manufacturer) {
        this.manufacturer = manufacturer;
    }
   
    
}
