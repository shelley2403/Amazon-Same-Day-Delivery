/*
 * ManageProductCatalogJPanel.java
 *
 * Created on September 24, 2008, 2:40 PM
 */
package UserInterface.InventoryManagerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.InventoryManagementOrganization;
import Business.Organization.Organization;
import Business.ProductCatalog.Product;
import Business.ProductCatalog.ProductCatalog;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * 
 */
public class ManageProductCatalogJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    InventoryManagementOrganization organization;
    //ProductCatalog pc;

    /** Creates new form ManageProductCatalogJPanel */
    public ManageProductCatalogJPanel(JPanel userProcessContainer, Enterprise enterprise, InventoryManagementOrganization organization) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        refreshJButtonActionPerformed(null);
    }

 

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productcatalogTable = new javax.swing.JTable();
        viewPButton = new javax.swing.JButton();
        createPButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        backButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sNameTextField = new javax.swing.JTextField();
        delButton5 = new javax.swing.JButton();
        searchPButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Product Catalog");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        productcatalogTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        productcatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID", "Price", "Availability", "Product Catagory"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productcatalogTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 820, 150));

        viewPButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewPButton.setText("View Product Detail >>");
        viewPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPButtonActionPerformed(evt);
            }
        });
        add(viewPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 220, -1));

        createPButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createPButton.setText("Create New Product >>");
        createPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPButtonActionPerformed(evt);
            }
        });
        add(createPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        refreshJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, -1));

        backButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton4.setText("<< Back");
        backButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton4ActionPerformed(evt);
            }
        });
        add(backButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Enterprise:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 90, -1));

        sNameTextField.setEditable(false);
        sNameTextField.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        sNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sNameTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        add(sNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 150, 30));

        delButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delButton5.setText("Delete Product(s)");
        delButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButton5ActionPerformed(evt);
            }
        });
        add(delButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 190, -1));

        searchPButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchPButton1.setText("Search >>");
        searchPButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPButton1ActionPerformed(evt);
            }
        });
        add(searchPButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 130, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void viewPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPButtonActionPerformed
        
        int selectedRow = productcatalogTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a Row First");
            return;
        }
        
        Product product = (Product) productcatalogTable.getValueAt(selectedRow, 4);
        ManageProductJPanel manageProductJPanel= new ManageProductJPanel(userProcessContainer, product);
        userProcessContainer.add("ManageProduct",manageProductJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_viewPButtonActionPerformed

    private void createPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPButtonActionPerformed
        CreateNewProductJPanel cnpjp = new CreateNewProductJPanel(userProcessContainer, organization.getPc());
        userProcessContainer.add("CreateNewProductJPanel", cnpjp);
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createPButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
         sNameTextField.setText(enterprise.getName());
        
        int rowCount = productcatalogTable.getRowCount();
        for(int i=rowCount -1; i>=0; i--){
            ((DefaultTableModel)productcatalogTable.getModel()).removeRow(i);
        } 
        for(Product p: organization.getPc().getProductList())
        {
            Object row[] = new Object[5];
            row[0] = p.getName();
            row[1] = p.getProductId();
            row[2] = p.getSellingPrice();
            row[3] = p.getAvailability();
            row[4] = p;
            
            ((DefaultTableModel)productcatalogTable.getModel()).addRow(row);
        }
       
           
       
        
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void backButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton4ActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButton4ActionPerformed

    private void delButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButton5ActionPerformed
        
        int selectedRow = productcatalogTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a Row First");
            return;
        }
        
        Product p = (Product) productcatalogTable.getValueAt(selectedRow, 4);

        organization.getPc().removeProduct(p);
    }//GEN-LAST:event_delButton5ActionPerformed

    private void searchPButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPButton1ActionPerformed
        // TODO add your handling code here:
        SearchForProductJPanel sjp = new SearchForProductJPanel(userProcessContainer, organization.getPc());
        userProcessContainer.add("SearchForProductJPanel",sjp);
        
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_searchPButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton4;
    private javax.swing.JButton createPButton;
    private javax.swing.JButton delButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productcatalogTable;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextField sNameTextField;
    private javax.swing.JButton searchPButton1;
    private javax.swing.JButton viewPButton;
    // End of variables declaration//GEN-END:variables
}
