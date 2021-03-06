/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.InventoryManagementOrganization;
import Business.Organization.Organization;
import Business.ProductCatalog.Product;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sony
 */
public class HardToFindItemsJPanel extends javax.swing.JPanel {

    
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Customer customerPerson;
    private Order tempOrder;
    private EcoSystem system;
    /**
     * Creates new form HardToFindItemsJPanel
     */
    public HardToFindItemsJPanel(JPanel uPC,Customer customerPerson, UserAccount account, EcoSystem system, Organization organization) {
        initComponents();
        
        userProcessContainer = uPC;
        this.customerPerson = customerPerson;
        this.account= account;
        this.system = system;
        this.organization = organization;
        
        tempOrder = new Order();
        tempOrder.setCustomerPerson(customerPerson);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        pCatJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        productJTable = new javax.swing.JTable();
        searchJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        stateJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        countryJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        checkOutjButton7 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        jLabel9.setText("Select Your Catagory");

        pCatJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Books and Audible", "Movies, Music & Games", "Electronics and Computers", "Home, Garden & Tools", "Beauty, Health & Grocery", "Toy, Kids & Babies", "Clothing, Shoes & Jewelry", "Sports & Outdoors", "Automotive & Industrial" }));

        productJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Product Id", "Price", "Availabilty", "Product Catagory", "Fulfilled By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productJTable);

        searchJButton.setText("Search >>");
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Search Product In Near by Region");

        jButton2.setText("Add To Cart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("State :");

        jLabel3.setText("Enter Country :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Quantity:");

        checkOutjButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkOutjButton7.setText("Check Out");
        checkOutjButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutjButton7ActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pCatJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(searchJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(countryJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(stateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(checkOutjButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(countryJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(stateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pCatJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchJButton))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backJButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(checkOutjButton7)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        // TODO add your handling code here:
        
        int i=0;
        String productCat = (String) pCatJComboBox.getSelectedItem();
        
        String countryName = countryJTextField.getText();
        String stateName = stateJTextField.getText();
        //String cityName = cityJTextField.getText();
        customerPerson.setCountry(countryName);
        customerPerson.setState(stateName);
        //customerPerson.setCity(cityName);
        DefaultTableModel dff = (DefaultTableModel) productJTable.getModel();
        dff.setRowCount(0);
        
        Network network = system.getNetwork();
        for (Network country : network.getNetworkList()) {
            if (countryName.equalsIgnoreCase(country.getName())) {

                for (Network state : country.getNetworkList()) {
                    if (stateName.equalsIgnoreCase(state.getName())) {

                        for (Network city : state.getNetworkList()) {
                            System.err.println("State's city "+city.getName());
                            if(city != null){
                                for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseList()) {
                                    
                                    InventoryManagementOrganization org = null;
                                    for (Organization organization1 : e.getOrganizationDirectory().getOrganizationList()) {
                                        if (organization1 instanceof InventoryManagementOrganization) {
                                            org = (InventoryManagementOrganization) organization1;                                            
                                            break;
                                        }
                                        
                                    }
                                    if (org != null) {
                                    for (Product pro : org.getPc().getProductList()) {                                        
                                        if (pro.getProductCategory().equals(productCat)) 
                                        {                                            
                                        
                                        Object[] productRow = new Object[6];
                                        productRow[0] = pro.getName();
                                        productRow[1] = pro.getProductId();
                                        productRow[2] = pro.getSellingPrice();
                                        productRow[3] = pro.getAvailability();
                                        productRow[4] = pro;
                                        productRow[5] = e;

                                        ((DefaultTableModel) productJTable.getModel()).addRow(productRow);
                                        customerPerson.setCity(city.getName());
                                        i++;
                                        } 
                                       }
                                }
                            }
                            }
                        }
                        
                                try
                             {
                             productJTable.getValueAt(0, 0).equals("");
                            
                             }
                             catch(Exception ex)
                             {
                                JOptionPane.showMessageDialog(null, "No Products available!!");
                                return;
                            }
                              
                       
                }
            }
        }
        }if(i == 0)
        {
            JOptionPane.showMessageDialog(null, "Invalid City or State or Country!!! Please Re-enter Correct Location");
                                return;
                            
        }
            
        
    
        
    }//GEN-LAST:event_searchJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int quantity = (Integer)jSpinner1.getValue();
        int selectedRowCount = productJTable.getSelectedRowCount();
        if(selectedRowCount<=0)
        {
            JOptionPane.showMessageDialog(null, "Select a row first");
            return;
        }
        
        Product selectedProduct =(Product) productJTable.getValueAt(selectedRowCount, 4);
        
        
        
        if(quantity <=0 || quantity>=selectedProduct.getAvailability())
        {
            JOptionPane.showMessageDialog(null, "Please Enter Proper Quantity");
            return;
        }

        
//        int selectRow = prodjTable1.getSelectedRow();
//        Enterprise selectedEnterprise =(Enterprise) prodjTable1.getValueAt(selectRow, 5);
        
       
        //refreshOrder();
        //refreshProductTable();
        
        
        
        Network network = system.getNetwork();
        for (Network country : network.getNetworkList()) {
            if (customerPerson.getCountry().equalsIgnoreCase(country.getName())) {

                for (Network state : country.getNetworkList()) {
                    if (customerPerson.getState().equalsIgnoreCase(state.getName())) {

                        for (Network city : state.getNetworkList()) {
                            if (customerPerson.getCity().equalsIgnoreCase(city.getName())) {

                                for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseList()) {
                                   
                                    InventoryManagementOrganization org = null;
                                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                                        if (organization instanceof InventoryManagementOrganization) {
                                            org = (InventoryManagementOrganization) organization;
                                             
                                            break;
                                        }
                                        
                                    }if(org!=null){
                                        
                                        for (Product pro : org.getPc().getProductList()) {
                                        if (pro.getProductId()== (selectedProduct.getProductId())) {
                                            ArrayList<OrderItem> orderItemList =tempOrder.getOrderItemList();
                                         
                                        
                                        boolean flag = true;
                                        for(OrderItem oi :orderItemList)
                                        {
                                            if(oi.getProduct() == selectedProduct)
                                            {
                                                flag= false;
                                                oi.setQuantity( quantity + oi.getQuantity());
                                                oi.setEnterprise(e);
                                            }
                                        }
                                        if(flag)
                                        {
                                            OrderItem newOi = tempOrder.newOrderItem(selectedProduct, quantity, selectedProduct.getSellingPrice(), e);
                                        }
                                       // selectedProduct.setAvailability(selectedProduct.getAvailability()-quantity);  
                                            
                                        
                                        searchJButtonActionPerformed(evt);
                                             //break;
                                             
                                             
                                        
                                        
                                    
                                    
                                    }
                                }
                                     
                            }
                                    
        
                        }
                    }
                }
            }
        }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void checkOutjButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutjButton7ActionPerformed
        // TODO add your handling code here:
        if(tempOrder.getOrderItemList().size()<=0)
        {
            JOptionPane.showMessageDialog(null, "No Item selected to place order");
            return;
        }

        //        int selectedRow = orderjTable3.getSelectedRow();
        //
        //        OrderItem selectedItem =(OrderItem) orderjTable3.getValueAt(selectedRow, 0);

        ArrayList<OrderItem> orderItemList =tempOrder.getOrderItemList();

        tempOrder.setTotalValueOfOrder(orderItemList);
        tempOrder.setTaxValue((tempOrder.getTotalValueOfOrder()*Order.TAX));

        CheckoutJPanel cojp = new CheckoutJPanel(userProcessContainer,tempOrder,customerPerson,account,organization, system);
        userProcessContainer.add("ViewFinalOrderPlaced",cojp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_checkOutjButton7ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton checkOutjButton7;
    private javax.swing.JTextField countryJTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JComboBox pCatJComboBox;
    private javax.swing.JTable productJTable;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextField stateJTextField;
    // End of variables declaration//GEN-END:variables
}
