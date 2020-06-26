/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author preet
 */
public class PatientInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientInfoPanel
     */
    
    private JPanel container;
    private EcoSystem system;
    
    public PatientInfoPanel(JPanel container, EcoSystem system) {
      initComponents(); //To change body of generated methods, choose Tools | Templates.
      this.container=container;
      this.system =system;
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lable_PatientInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Patient = new javax.swing.JTable();
        btnCreatePatient = new javax.swing.JButton();
        btnViewPatient = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnBookAppoint = new javax.swing.JButton();
        searchPatientCombobox = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        lbl_PatientName = new javax.swing.JLabel();
        txt_Patient_ID = new javax.swing.JTextField();
        lblPatientName = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txt_Patient_Name = new javax.swing.JTextField();
        txt_Dob = new javax.swing.JTextField();
        txt_Address = new javax.swing.JTextField();
        txt_Age = new javax.swing.JTextField();
        txt_Contact_Dets = new javax.swing.JTextField();
        txt_Weight = new javax.swing.JTextField();
        btn_delete = new javax.swing.JButton();

        lable_PatientInfo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lable_PatientInfo.setText("Patient Information");

        Tbl_Patient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Date of Birth", "Address", "Age", "Contact details", "Weight"
            }
        ));
        jScrollPane1.setViewportView(Tbl_Patient);

        btnCreatePatient.setText("Create Patient");

        btnViewPatient.setText("View Patient");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBookAppoint.setText("Book Appointment");
        btnBookAppoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointActionPerformed(evt);
            }
        });

        searchPatientCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        searchPatientCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientComboboxActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");

        lbl_PatientName.setText("Patient ID");

        lblPatientName.setText("Patient Name");

        lblDob.setText("Date of Birth");

        lblAddress.setText("Address");

        lblAge.setText("Age");

        lblContact.setText("Contact Details");

        lblWeight.setText("Weight");

        btn_delete.setText("Delete Patient");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(266, 266, 266)
                        .addComponent(lable_PatientInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCreatePatient)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_PatientName)
                                    .addComponent(lblPatientName)
                                    .addComponent(lblDob)
                                    .addComponent(lblAddress)
                                    .addComponent(lblAge)
                                    .addComponent(lblContact)
                                    .addComponent(lblWeight))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Contact_Dets)
                                    .addComponent(txt_Patient_ID)
                                    .addComponent(txt_Patient_Name)
                                    .addComponent(txt_Dob)
                                    .addComponent(txt_Address)
                                    .addComponent(txt_Age)
                                    .addComponent(txt_Weight, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBookAppoint))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(searchPatientCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnSearch)
                        .addGap(336, 336, 336)
                        .addComponent(btnViewPatient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_delete)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable_PatientInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewPatient)
                    .addComponent(searchPatientCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btn_delete))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_PatientName)
                    .addComponent(txt_Patient_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Patient_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDob, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Dob, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAddress)
                    .addComponent(txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 21, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txt_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContact)
                    .addComponent(txt_Contact_Dets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWeight)
                    .addComponent(txt_Weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreatePatient)
                    .addComponent(btnBookAppoint))
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchPatientComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchPatientComboboxActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed

        // TODO add your handling code here:
        
        ViewPatientJPanel panel = new ViewPatientJPanel(container, system);
    	container.add("SystemAdminWorkAreaJPanel", panel);
    	CardLayout layout = (CardLayout)container.getLayout();
    	layout.next(container);
    }//GEN-LAST:event_btnViewPatientActionPerformed


        



        // TODO add your handling code here:
    //GEN-LAST:event_btnViewPatientActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBookAppointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointActionPerformed
        BookAppointment panel = new BookAppointment(container, system);
    	container.add("BookAppointment", panel);
    	CardLayout layout = (CardLayout)container.getLayout();
    	layout.next(container);
// TODO add your handling code here:
    }//GEN-LAST:event_btnBookAppointActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tbl_Patient;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookAppoint;
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JButton btn_delete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lable_PatientInfo;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lbl_PatientName;
    private javax.swing.JComboBox<String> searchPatientCombobox;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_Age;
    private javax.swing.JTextField txt_Contact_Dets;
    private javax.swing.JTextField txt_Dob;
    private javax.swing.JTextField txt_Patient_ID;
    private javax.swing.JTextField txt_Patient_Name;
    private javax.swing.JTextField txt_Weight;
    // End of variables declaration//GEN-END:variables
}