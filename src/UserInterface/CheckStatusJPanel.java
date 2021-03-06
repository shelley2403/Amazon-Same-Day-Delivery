/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.SystemAdminOrganization;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.SupplierRegistrationRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sony
 */
public class CheckStatusJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form CheckStatusJPanel
     */
    public CheckStatusJPanel(EcoSystem system, JPanel userProcessContainer) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        reqIdJTextField = new javax.swing.JTextField();
        checkJButton = new javax.swing.JButton();

        jLabel1.setText("Enter Request ID :");

        checkJButton.setText("Check");
        checkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addComponent(reqIdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(checkJButton)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(reqIdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(checkJButton)
                .addContainerGap(229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkJButtonActionPerformed
        // TODO add your handling code here:
        int reqId = Integer.valueOf(reqIdJTextField.getText());
        SystemAdminOrganization org = null;
        for (Organization organization1 : system.getOrganizationDirectory().getOrganizationList()) {
            if (organization1 instanceof SystemAdminOrganization) {
                org = (SystemAdminOrganization) organization1;

                boolean foundRequest=false;//changes to true if i find request ID
                for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
        
                        SupplierRegistrationRequest supRequest = (SupplierRegistrationRequest)request;
                        System.err.println(supRequest.getRequestId());
                    if (supRequest.getRequestId() == reqId) {
                        foundRequest=true;
                        JOptionPane.showMessageDialog(null, (supRequest.getTestResult()));
                        break;
                        //JOptionPane.showMessageDialog(null, ((PersonWorkRequest) we).getResult());
                    } 
                }
                
                if(!foundRequest){
                    JOptionPane.showMessageDialog(null, "Invalid Request Id");
                }
            }
        }

      /*  for (UserAccount tempUserAccount : userAccountDirectory.getUserAccountList()) {
            for (WorkRequest we : tempUserAccount.getWorkQueue().getWorkRequestList()) {
                if (we.getRequestId() == reqId) {
                    JOptionPane.showMessageDialog(null, ((PersonWorkRequest) we).getResult());
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Id");
                }
            }

        } */


    }//GEN-LAST:event_checkJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField reqIdJTextField;
    // End of variables declaration//GEN-END:variables
}
