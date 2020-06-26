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
public class Incident {
    
    int incidentNo;
    String medicalHistory;
    Date date;
    String medicineInvolved;
    String manufactureName;
    String medicineType;
    boolean isExpired;

    public int getIncidentNo() {
        return incidentNo;
    }

    public void setIncidentNo(int incidentNo) {
        this.incidentNo = incidentNo;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMedicineInvolved() {
        return medicineInvolved;
    }

    public void setMedicineInvolved(String medicineInvolved) {
        this.medicineInvolved = medicineInvolved;
    }

    public String getManufacturer() {
        return manufactureName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufactureName = manufacturer;
    }

    public String getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(String medicineType) {
        this.medicineType = medicineType;
    }

    public boolean isIsExpired() {
        return isExpired;
    }

    public void setIsExpired(boolean isExpired) {
        this.isExpired = isExpired;
    }
    
    
    
    
}
