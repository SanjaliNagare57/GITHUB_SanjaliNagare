/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.PatientRole.AppointmentWorkRequest;

/**
 *
 * @author raunak
 */
public class DoctorRole extends Role{ 
    int doctorId;
    String doctorName;
    String patientAssigned;

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientAssigned() {
        return patientAssigned;
    }

    public void setPatientAssigned(String patientAssigned) {
        this.patientAssigned = patientAssigned;
    }

    


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new AppointmentWorkRequest(userProcessContainer, account, (DoctorOrganization)organization, enterprise); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
