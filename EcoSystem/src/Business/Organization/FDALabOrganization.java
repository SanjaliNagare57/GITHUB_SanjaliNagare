/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author preet
 */
public class FDALabOrganization extends Organization {
   
public FDALabOrganization() {
        super(Organization.Type. FDALabAssistant.getValue());
    }

@Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
       // roles.add(new LabAssistantRole());
        return roles;
    }
    
}
