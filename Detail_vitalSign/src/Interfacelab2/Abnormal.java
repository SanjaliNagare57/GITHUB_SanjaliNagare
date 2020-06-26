/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacelab2;

import Businesslab2.VitalSign;
import Businesslab2.VitalSignHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanjalinagare
 */
public class Abnormal extends javax.swing.JPanel {
    /**
     * Creates new form Abnormal
     */
    private VitalSignHistory vtsh;
    private double maxbp, minbp;
    public Abnormal(VitalSignHistory vtsh, double maxbp, double minbp) 
    {
        initComponents();
        this.vtsh = vtsh;
        this.minbp = minbp;
        this.maxbp = maxbp;
        populateTable();
        setFieldEnabled(false);
        
    }
    
    public void populateTable()
    { 
        DefaultTableModel dtm = (DefaultTableModel)Table.getModel();
        dtm.setRowCount(0);

            for(VitalSign vs: vtsh.getAbnormalList(maxbp,minbp))
            {
                Object row[] =new Object[2];//Class
                row[0]=vs;
                row[1]=vs.getBloodPressure();
                dtm.addRow(row);
            }
    }
    
     private void setFieldEnabled(boolean b){
    TempTxt.setEnabled(b);
    BPTxt.setEnabled(b);
    PulseTxt.setEnabled(b);
    DateTxt.setEnabled(b);
      }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Heading = new javax.swing.JLabel();
        Table2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Date = new javax.swing.JLabel();
        TempTxt = new javax.swing.JTextField();
        BPTxt = new javax.swing.JTextField();
        PulseTxt = new javax.swing.JTextField();
        DateTxt = new javax.swing.JTextField();
        Temprature = new javax.swing.JLabel();
        BP = new javax.swing.JLabel();
        Pulse = new javax.swing.JLabel();
        DetailsBtn = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();

        Heading.setText("Abnormal Vital Sign");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "BloodPressure"
            }
        ));
        Table2.setViewportView(Table);

        Date.setText("Date");

        TempTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TempTxtActionPerformed(evt);
            }
        });

        DateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateTxtActionPerformed(evt);
            }
        });

        Temprature.setText("Temprature");

        BP.setText("BloodPressure");

        Pulse.setText("Pulse");

        DetailsBtn.setText("Details");
        DetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailsBtnActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        Confirm.setText("Confirm");
        Confirm.setEnabled(false);
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Table2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Temprature, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Pulse, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PulseTxt)
                                        .addComponent(DateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DetailsBtn)
                            .addComponent(Delete)
                            .addComponent(UpdateBtn)
                            .addComponent(Confirm))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Table2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Temprature, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PulseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pulse, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DetailsBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(Confirm)
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TempTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TempTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TempTxtActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
         int selectRow =Table.getSelectedRow();
        
        if(selectRow >=0){
            VitalSign vs =(VitalSign)Table.getValueAt(selectRow,0);
            vtsh.deletVitals(vs);
            JOptionPane.showMessageDialog(null, "Vital Sign deleted Successfully");
            populateTable();
            
        }
        else JOptionPane.showMessageDialog(null, "NO ROW TO DELETE","ERROR",JOptionPane.ERROR_MESSAGE);          

        TempTxt.setText("");
         BPTxt.setText("");
        PulseTxt.setText("");
         DateTxt.setText("");
    }//GEN-LAST:event_DeleteActionPerformed

    private void DetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailsBtnActionPerformed
        // TODO add your handling code here:
           int selectRow=Table.getSelectedRow();
        if(selectRow >=0)
        {
            VitalSign vs = (VitalSign)Table.getValueAt(selectRow, 0);
            
            BPTxt.setText(String.valueOf(vs.getBloodPressure()));
            TempTxt.setText(String.valueOf(vs.getTemprature()));
            PulseTxt.setText(String.valueOf(vs.getPulse()));
            DateTxt.setText(String.valueOf(vs.getDate()));
            
         
        }
        else
            JOptionPane.showMessageDialog(null,"No row to view ","Error",JOptionPane.ERROR_MESSAGE);
    
        
        

    }//GEN-LAST:event_DetailsBtnActionPerformed

    private void DateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateTxtActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
                 setFieldEnabled(true);
                 Confirm.setEnabled(true);
      
        
        int selectRow = Table.getSelectedRow();
        
        if(selectRow >=0){
            VitalSign vs =(VitalSign)Table.getValueAt(selectRow, 0);
            TempTxt.setText(vs.getTemprature()+"");
            BPTxt.setText(vs.getBloodPressure()+"");
            PulseTxt.setText(vs.getPulse()+"");
            DateTxt.setText(vs.getDate());
        
           
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Select a Row");
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:
        
        int selectRow = Table.getSelectedRow();
        
        if (selectRow>=0)
        {
           VitalSign vs =(VitalSign)Table.getValueAt(selectRow,0);
            vs.setTemprature(Double.parseDouble(TempTxt.getText()));
            vs.setDate(DateTxt.getText());
            vs.setBloodPressure(Double.parseDouble(BPTxt.getText()));
            vs.setPulse(Integer.parseInt(PulseTxt.getText()));
            
           JOptionPane.showMessageDialog(null, "Vital sign Update successfully");
           populateTable();
           setFieldEnabled(false);
           Confirm.setEnabled(false);
           
        }
        else
           JOptionPane.showMessageDialog(null, "Please select a Row");
       TempTxt.setText("");
       BPTxt.setText("");
       PulseTxt.setText("");
       DateTxt.setText("");
    }//GEN-LAST:event_ConfirmActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BP;
    private javax.swing.JTextField BPTxt;
    private javax.swing.JButton Confirm;
    private javax.swing.JLabel Date;
    private javax.swing.JTextField DateTxt;
    private javax.swing.JButton Delete;
    private javax.swing.JButton DetailsBtn;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel Pulse;
    private javax.swing.JTextField PulseTxt;
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane Table2;
    private javax.swing.JTextField TempTxt;
    private javax.swing.JLabel Temprature;
    private javax.swing.JButton UpdateBtn;
    // End of variables declaration//GEN-END:variables
}