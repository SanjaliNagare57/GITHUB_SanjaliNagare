/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;
import userinterface.PatientRole.PatientDiagnosePanel;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNurseStatus() {
        return nurseStatus;
    }

    public void setNurseStatus(String nurseStatus) {
        this.nurseStatus = nurseStatus;
    }

    public String getNurseMessage() {
        return nurseMessage;
    }

    public void setNurseMessage(String nurseMessage) {
        this.nurseMessage = nurseMessage;
    }

    public String getLabMessage() {
        return labMessage;
    }

    public void setLabMessage(String labMessage) {
        this.labMessage = labMessage;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    //    Lab, Doctor and Nurse Process
    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    private int appointmentID;
    private Date requestDate;
    private String patientID;
    private String time;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private String nurseStatus;
    private String nurseMessage;
    private String labMessage;
    private Date resolveDate;
    
}