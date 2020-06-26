/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Businesslab2;

import java.util.ArrayList;

/**
 *
 * @author sanjalinagare
 */
public class VitalSignHistory {
    
    private ArrayList <VitalSign> vitalSignList;  //VitalSign is class name and vitalSignHistoy is our varible   
    
    public VitalSignHistory() //Constuctor
    {
        vitalSignList = new ArrayList<VitalSign>(); //Object made and assignment 
    }
    
    public ArrayList<VitalSign> getVitalSignList() 
    {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) 
    {
        this.vitalSignList = vitalSignList;//assigning local variable to class/object variable
    }
    
    public VitalSign addVitals()
    {
        VitalSign vitalSignObject= new VitalSign();
        vitalSignList.add(vitalSignObject) ;
        return vitalSignObject;    
    }

    public void deletVitals(VitalSign vs) 
    {
        vitalSignList.remove(vs);        
    }
    
    public ArrayList<VitalSign> getAbnormalList(double maxbp, double minbp)
    {
        ArrayList<VitalSign> abnList = new ArrayList<VitalSign>();        
    
        for(VitalSign vs:vitalSignList)
        {
            if (vs.getBloodPressure() > maxbp||vs.getBloodPressure()<minbp)
            {
                    abnList.add(vs);
            }
        }
    return abnList;
    }   
}
