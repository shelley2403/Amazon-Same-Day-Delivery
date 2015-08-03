/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DeliveryRole;


import UserInterface.SupplierOrderManagerRole.*;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.AmazonOrderManagementOrganization;
import Business.Organization.DeliveryManagementOrganization;
import Business.Organization.Organization;
import Business.Organization.SupplierOrderManagementOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AmazonOrderProcessRequest;
import Business.WorkQueue.DeliveryRequest;
import Business.WorkQueue.SupplierOrderRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ViewDeliveryDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DeliveryRequest request;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private UserAccount account;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ViewDeliveryDetailsJPanel(JPanel userProcessContainer, EcoSystem system ,UserAccount account,DeliveryRequest request, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.request = request;
        this.enterprise = enterprise;
        this.system = system;
        this.account = account;
        
        refresh();
    }

    public void refresh() {
        DefaultTableModel dff = (DefaultTableModel) orderjTable.getModel();
        dff.setRowCount(0);

                        Object[] orderRow = new Object[8];
                        
                        orderRow[0] = request.getCustomer();
                        orderRow[1] = request.getCustomer();
                        orderRow[2] = request.getCustomer().getAddress();
                        orderRow[3] = request.getCustomer().getAddress1();
                        orderRow[4] = request.getCustomer().getZipcode();
                        orderRow[5] = request.getCustomer().getPhoneNo();
                        orderRow[6] = request.getCustomer().getZipcode();
                        orderRow[7]= request.getResult();

                        dff.addRow(orderRow);
                    }
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderjTable = new javax.swing.JTable();
        resultJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        delDateJTextField = new javax.swing.JTextField();

        submitJButton.setText("Complete Delivery ");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        orderjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product Id", "Customer Name", "City", "Customer Address", "Address (Continued)", "ZipCode", "Phone Number", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderjTable);
        orderjTable.getColumnModel().getColumn(0).setResizable(false);
        orderjTable.getColumnModel().getColumn(1).setResizable(false);
        orderjTable.getColumnModel().getColumn(2).setResizable(false);
        orderjTable.getColumnModel().getColumn(3).setResizable(false);
        orderjTable.getColumnModel().getColumn(4).setResizable(false);
        orderjTable.getColumnModel().getColumn(5).setResizable(false);
        orderjTable.getColumnModel().getColumn(6).setResizable(false);
        orderjTable.getColumnModel().getColumn(7).setResizable(false);

        resultJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Delivered on Same Day", "Delivered" }));

        jLabel1.setText("Result :");

        jLabel2.setText("Delivery Date :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resultJComboBox, 0, 198, Short.MAX_VALUE)
                            .addComponent(delDateJTextField))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(348, 348, 348))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(resultJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(delDateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(backJButton))
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        
        int selectedRow = orderjTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a Row First");
            return;
        }


     /*  OrderItem item = (OrderItem) orderjTable.getValueAt(selectedRow, 0);
        Enterprise e = item.getEnterprise();
        DeliveryManagementOrganization dmo = null;
        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof DeliveryManagementOrganization) {
                dmo = (DeliveryManagementOrganization) org;



                DeliveryRequest delRequest = new DeliveryRequest();
                delRequest.setSender(account);
                delRequest.setRequestDate(request.getRequestDate());
                delRequest.setProductId(item.getProduct().getProductId());
                delRequest.setOrderId(request.getOrderId());
                delRequest.setQuantity(item.getQuantity());
                delRequest.setCustomer(request.getCustomer());
                delRequest.setStatus("Packing Done");
                delRequest.setResult("Incomplete");
                delRequest.setProductName(item.getProduct().getName());


                dmo.getWorkQueue().getWorkRequestList().add(delRequest);
                account.getWorkQueue().getWorkRequestList().add(delRequest);
                JOptionPane.showMessageDialog(null, "Your order is sent to Packaging Department !!!");
            }
        } */
        
        String value  = (String)resultJComboBox.getSelectedItem();
        String delDate = delDateJTextField.getText();
        if(value.equals("Delivered on Same Day")){
            
        request.setResult("Completed");
        request.setStatus("Order Delivered on Same Day");
        }else{
        request.setResult("Completed");
        request.setStatus("Order Delivered");
        
        }
        refresh();
        
                                
    }//GEN-LAST:event_submitJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField delDateJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderjTable;
    private javax.swing.JComboBox resultJComboBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
