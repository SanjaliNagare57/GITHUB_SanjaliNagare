/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author preet
 */
public class MedicineList {
    
    int medicineID;
    String medicineName;
    String manufacturer;
    String keyComponent;
    String expiryName;
     ArrayList<String> sideEffect=new ArrayList();

    public ArrayList<String> getSideEffect() {
        return sideEffect;
    }

    public void setSideEffect(ArrayList<String> sideEffect) {
        this.sideEffect = sideEffect;
    }
   

    public int getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(int medicineID) {
        this.medicineID = medicineID;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getKeyComponent() {
        return keyComponent;
    }

    public void setKeyComponent(String keyComponent) {
        this.keyComponent = keyComponent;
    }

    public String getExpiryName() {
        return expiryName;
    }

    public void setExpiryName(String expiryName) {
        this.expiryName = expiryName;
    }

   

   
  
    
    
}
