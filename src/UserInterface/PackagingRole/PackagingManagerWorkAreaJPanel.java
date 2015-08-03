/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PackagingRole;


import UserInterface.SupplierOrderManagerRole.*;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AmazonOrderManagementOrganization;

import Business.Organization.Organization;
import Business.Organization.SupplierOrderManagementOrganization;
import Business.UserAccount.UserAccount;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * 
 */
public class PackagingManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private EcoSystem system;
    
   
    
    public PackagingManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.system = system;
        lblSupplierName.setText(userAccount.getEmployee().getName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewAllOrdersjButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSupplierName = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewAllOrdersjButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewAllOrdersjButton1.setText("View All Orders >>");
        viewAllOrdersjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllOrdersjButton1ActionPerformed(evt);
            }
        });
        add(viewAllOrdersjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 196, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area (Packaging Role) :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lblSupplierName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSupplierName.setText("<< Name >>");
        add(lblSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewAllOrdersjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllOrdersjButton1ActionPerformed
        // TODO add your handling code here:
        ViewAllMyPackagingOrderJPanel vopojp = new ViewAllMyPackagingOrderJPanel(userProcessContainer, userAccount, organization, enterprise, system);
        userProcessContainer.add("ViewAllMyPackagingOrderJPanel",vopojp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAllOrdersjButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JButton viewAllOrdersjButton1;
    // End of variables declaration//GEN-END:variables
}
