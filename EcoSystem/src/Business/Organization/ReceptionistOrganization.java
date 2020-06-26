/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import static Business.Organization.Organization.Type.Receptionist;
import Business.Role.Receptionist;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author preet
 */
public class ReceptionistOrganization extends Organization{

    public ReceptionistOrganization() {
        super(Organization.Type.Receptionist.getValue());
    }

   

    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Receptionist());
        return roles;
    }
}
    
    

