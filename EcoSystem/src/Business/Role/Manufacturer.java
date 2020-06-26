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
public class Manufacturer {
    
       int manufacturerID;
    String manufacturerName;
    int contactNo;
    Date manufactureDate;
    ArrayList<String> sideEffects=new ArrayList();
    Map<Integer,String> medicineList= new HashMap();

    public int getManufacturerID() {
        return manufacturerID;
    }

    public void setManufacturerID(int manufacturerID) {
        this.manufacturerID = manufacturerID;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public ArrayList<String> getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(ArrayList<String> sideEffects) {
        this.sideEffects = sideEffects;
    }

    public Map<Integer, String> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(Map<Integer, String> medicineList) {
        this.medicineList = medicineList;
    }
    
    
}
