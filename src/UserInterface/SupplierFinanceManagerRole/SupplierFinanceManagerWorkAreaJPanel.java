/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierFinanceManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InventoryManagementOrganization;
import Business.Organization.Organization;
import Business.ProductCatalog.ProductCatalog;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import UserInterface.AmazonFinanceManagerRole.ValidateCustomerPaymentJPanel;
import UserInterface.AmazonFinanceManagerRole.ViewBankAccountJPanel;
import UserInterface.InventoryManagerRole.ManageProductCatalogJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class SupplierFinanceManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public SupplierFinanceManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
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

        jLabel1 = new javax.swing.JLabel();
        managePaymentsButton = new javax.swing.JButton();
        lblSupplierName = new javax.swing.JLabel();
        viewBankAccountButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area (Supplier Finance Manager Role) :");

        managePaymentsButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managePaymentsButton.setText("Add Account >>");
        managePaymentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePaymentsButtonActionPerformed(evt);
            }
        });

        lblSupplierName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSupplierName.setText("<< Name >>");

        viewBankAccountButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewBankAccountButton.setText("View Bank Account >>");
        viewBankAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBankAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSupplierName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewBankAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(managePaymentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(59, 59, 59)
                .addComponent(managePaymentsButton)
                .addGap(29, 29, 29)
                .addComponent(viewBankAccountButton)
                .addContainerGap(205, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePaymentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePaymentsButtonActionPerformed

     //   ValidateCustomerPaymentJPanel vcpjp = new ValidateCustomerPaymentJPanel(userProcessContainer,userAccount,organization ,system, enterprise);
       // userProcessContainer.add("ValidateCustomerPaymentJPanel", vcpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_managePaymentsButtonActionPerformed

    private void viewBankAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBankAccountButtonActionPerformed
        // TODO add your handling code here:
       ViewSupplierBankAccountJPanel vsbajp = new ViewSupplierBankAccountJPanel(system,userProcessContainer);
       userProcessContainer.add("ViewBankAccountJPanel", vsbajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_viewBankAccountButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JButton managePaymentsButton;
    private javax.swing.JButton viewBankAccountButton;
    // End of variables declaration//GEN-END:variables
}