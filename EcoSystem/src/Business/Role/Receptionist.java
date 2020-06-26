/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ReceptionistRole.ReceptionLoginJPanel;

/**
 *
 * @author preet
 */
public class Receptionist extends Role{
     int healthCareCenterId;
    String name;
    int contactNo;
    String city;
    int country;

    public int getHealthCareCenterId() {
        return healthCareCenterId;
    }

    public void setHealthCareCenterId(int healthCareCenterId) {
        this.healthCareCenterId = healthCareCenterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }
    
   
    
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        return new ReceptionLoginJPanel(userProcessContainer, account, (ReceptionistOrganization) organization, enterprise, network, business);
    }
}
    

