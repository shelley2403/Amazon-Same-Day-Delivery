/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.SystemAdminOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SupplierRegistrationRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SupplierSignUpJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public SupplierSignUpJPanel(JPanel userProcessContainer, EcoSystem system) {
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

        jPanel1 = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        enterpriseNameJTextField = new javax.swing.JTextField();
        registerJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        countryJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        stateJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cityJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        unJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        retypejPasswordField = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        employeeNameJTextField = new javax.swing.JTextField();
        reqIdJTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 18))); // NOI18N

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Enterprise Name :");

        registerJButton.setText("Register");
        registerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Country :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Enter Your Location");

        jLabel4.setText("State :");

        jLabel5.setText("City :");

        jLabel6.setText("Username :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Select Login Credentials :");

        jLabel8.setText("Password:");

        jLabel9.setText("Re- Type Password:");

        jLabel10.setText("Employee Name :");

        reqIdJTextField.setEditable(false);
        reqIdJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqIdJTextFieldActionPerformed(evt);
            }
        });

        jLabel11.setText("Request ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(121, 121, 121))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enterpriseNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(countryJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(cityJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(stateJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(reqIdJTextField))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(unJTextField)
                                    .addComponent(jPasswordField)
                                    .addComponent(retypejPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(employeeNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(registerJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(employeeNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(enterpriseNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(countryJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(unJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(stateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(retypejPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reqIdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(registerJButton))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerJButtonActionPerformed

        if ("".equals(unJTextField.getText()) || ("".equals(String.valueOf(jPasswordField.getPassword()))) || ("".equals(String.valueOf(retypejPasswordField.getPassword())))
                || "".equals(enterpriseNameJTextField.getText()) || "".equals(employeeNameJTextField.getText()) || "".equals(countryJTextField.getText()) || "".equals(stateJTextField.getText()) || "".equals(cityJTextField.getText())){

            JOptionPane.showMessageDialog(null, "Please enter proper details");
            return;
        }
        
        String message = enterpriseNameJTextField.getText();
        
        String countryName = countryJTextField.getText();
        String stateName = stateJTextField.getText();
        String cityName = cityJTextField.getText();
        
        
        String uname = unJTextField.getText();
        char[] passwordCharArray = jPasswordField.getPassword();
        String pass = String.valueOf(passwordCharArray);
        char[] passwordCharArray1 = retypejPasswordField.getPassword();
        String rePass = String.valueOf(passwordCharArray1);
        
        
       
        
        
      /*  if (rePass.equals(pass)) {
            boolean reply = system.getUserAccountDirectory().searchUser(uname);
            System.err.println(reply);
            if (reply == true) {

                Network network = system.getNetwork();

                for (Network country : network.getNetworkList()) {

                    for (Network state : country.getNetworkList()) {

                        for (Network city : state.getNetworkList()) {

                            for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {

                                boolean reply1 = enterprise.getUserAccountDirectory().searchUser(uname);
                                System.err.println("reply1"+reply1);
                                if (reply1 == true) {

                                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                        System.err.println("Hello");

                                        boolean reply2 = organization.getUserAccountDirectory().searchUser(uname);

                                        if (reply2 == true) {
                                            
                                            Employee tempEmployee = new Employee();
                                            String name = employeeNameJTextField.getText();
                                            tempEmployee.setName(name);

                                            UserAccount tempUserAccount = new UserAccount();
                                            tempUserAccount.setUsername(uname);
                                            tempUserAccount.setPassword(pass);
                                            tempUserAccount.setEmployee(tempEmployee);

                                            SupplierRegistrationRequest requestSup = new SupplierRegistrationRequest();
                                            requestSup.setMessage(message);
                                            requestSup.setCountryRequest(countryName);
                                            requestSup.setStateRequest(stateName);
                                            requestSup.setCityRequest(cityName);
                                            requestSup.setSender(tempUserAccount);
                                            requestSup.setStatus("Supplier registration");
                                            requestSup.setTestResult("Not Approved");



                                            Organization org = null;
                                            for (Organization organization1 : system.getOrganizationDirectory().getOrganizationList()) {
                                                if (organization1 instanceof SystemAdminOrganization) {
                                                    org = (SystemAdminOrganization) organization1;
                                                    break;
                                                }
                                            }
                                            if (org != null) {

                                                int confirm = JOptionPane.showConfirmDialog(null, "By creating an account, you agree to Amazon.com's Conditions of Use and Privacy Notice", "Warning", JOptionPane.YES_NO_OPTION);

                                                if (confirm == JOptionPane.YES_OPTION) {
                                                    org.getWorkQueue().addSupplierWorkRequest(requestSup);
                                                    //tempUserAccount.getWorkQueue().getWorkRequestList().add(requestSup);
                                                    registerJButton.setEnabled(false);
                                                    reqIdJTextField.setText(String.valueOf(requestSup.getRequestId()));
                                                }
                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(null, "Username already exists!! Select a new Username and try again");
                                            return;
                                        }

                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Username already exists!! Select a new Username and try again");
                                    return;

                                }

                            }

                        }
                    }
                }
            } else {

                JOptionPane.showMessageDialog(null, "Username already exists!! Select a new Username and try again");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Passwords doesnt match!!! Retry");
            return;
        }
        
        
        */
        
        
        UserAccount userAccount = null;
        
        Organization inOrganization = null;
         
        userAccount = system.getUserAccountDirectory().searchForUser(uname);
        
        if(userAccount== null){        
            for(Organization organization2 : system.getOrganizationDirectory().getOrganizationList()){
                userAccount = organization2.getUserAccountDirectory().searchForUser(uname);                
                if(userAccount!= null){                    
                    JOptionPane.showMessageDialog(null, "Username already exists!! Select a new Username and try again");
                    return;
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "2Username already exists!! Select a new Username and try again");
            return;
        }
        
        if (userAccount == null) {
            Network network = system.getNetwork();
            OUTERMOST: for(Network country : network.getNetworkList()) {
                for (Network state : country.getNetworkList()) {
                    for (Network city : state.getNetworkList()) {
                        for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
                            
                            userAccount = enterprise.getUserAccountDirectory().searchForUser(uname);
                            System.err.println(userAccount);

                            if (userAccount != null) {
                                JOptionPane.showMessageDialog(null, "Username already exists!! Select a new Username and try again");
                                break OUTERMOST;
                            } else {

                                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                    System.err.println("Hello");
                                    userAccount = organization.getUserAccountDirectory().searchForUser(uname);

                                    if (userAccount != null) {
                                        JOptionPane.showMessageDialog(null, "Username already exists!! Select a new Username and try again");
                                        break OUTERMOST;
                                    }
                                }
                            }
//                            if (userAccount != null) {
//                                break;
//                            }
                        }
//                        if (userAccount != null) {
//                            break;
//                        }
                    }
//                    if (userAccount != null) {
//                        break;
//                    }
                }
//                if (userAccount != null) {
//                    break;
//                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Username already exists!! Select a new Username and try again");
            return;
        }
        
        
                            if (rePass.equals(pass)) {
                                if (userAccount== null) {

                                    Employee tempEmployee = new Employee();
                                    String name = employeeNameJTextField.getText();
                                    tempEmployee.setName(name);

                                    UserAccount tempUserAccount = new UserAccount();
                                    tempUserAccount.setUsername(uname);
                                    tempUserAccount.setPassword(pass);
                                    tempUserAccount.setEmployee(tempEmployee);

                                    SupplierRegistrationRequest requestSup = new SupplierRegistrationRequest();
                                    requestSup.setMessage(message);
                                    requestSup.setCountryRequest(countryName);
                                    requestSup.setStateRequest(stateName);
                                    requestSup.setCityRequest(cityName);
                                    requestSup.setSender(tempUserAccount);
                                    requestSup.setStatus("Supplier registration");
                                    requestSup.setTestResult("Not Approved");



                                    Organization org = null;
                                    for (Organization organization1 : system.getOrganizationDirectory().getOrganizationList()) {
                                        if (organization1 instanceof SystemAdminOrganization) {
                                            org = (SystemAdminOrganization) organization1;
                                            break;
                                        }
                                    }
                                    if (org != null) {

                                        int confirm = JOptionPane.showConfirmDialog(null, "By creating an account, you agree to Amazon.com's Conditions of Use and Privacy Notice", "Warning", JOptionPane.YES_NO_OPTION);

                                        if (confirm == JOptionPane.YES_OPTION) {
                                            org.getWorkQueue().addSupplierWorkRequest(requestSup);
                                            //tempUserAccount.getWorkQueue().getWorkRequestList().add(requestSup);
                                            registerJButton.setEnabled(false);
                                            reqIdJTextField.setText(String.valueOf(requestSup.getRequestId()));
                                        }  
                                    }
                                }
//                                } 
                            } else {
                                JOptionPane.showMessageDialog(null, "Passwords doesnt match!!! Retry");
                                
                            }
        
        
        //boolean reply = system.getUserAccountDirectory().searchUser(uname);
        
       /* if (rePass.equals(pass)) {
            if (reply == true) {
                
                Employee tempEmployee = new Employee();
                String name = employeeNameJTextField.getText();
                tempEmployee.setName(name);
                
                UserAccount tempUserAccount = new UserAccount();
                tempUserAccount.setUsername(uname);
                tempUserAccount.setPassword(pass);
                tempUserAccount.setEmployee(tempEmployee);
                
                SupplierRegistrationRequest requestSup = new SupplierRegistrationRequest();
                requestSup.setMessage(message);
                requestSup.setCountryRequest(countryName);
                requestSup.setStateRequest(stateName);
                requestSup.setCityRequest(cityName);
                requestSup.setSender(tempUserAccount);
                requestSup.setStatus("Supplier registration");
                requestSup.setTestResult("Not Approved");
                
                
                
                Organization org = null;
                for (Organization organization : system.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof SystemAdminOrganization) {
                        org = (SystemAdminOrganization) organization;
                        break;
                    }
                }
                if (org != null) {
                    
                    int confirm = JOptionPane.showConfirmDialog(null, "By creating an account, you agree to Amazon.com's Conditions of Use and Privacy Notice", "Warning", JOptionPane.YES_NO_OPTION );
         
                    if (confirm == JOptionPane.YES_OPTION) 
                        {
                            org.getWorkQueue().getWorkRequestList().add(requestSup);
                            tempUserAccount.getWorkQueue().getWorkRequestList().add(requestSup);
                            RegisterJButton.setEnabled(false);
                        }
            }
            }else {
                JOptionPane.showMessageDialog(null, "Username already exists!! Select a new Username and try again");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Passwords doesnt match!!! Retry");
            return;
        }
        
        */
        
    }//GEN-LAST:event_registerJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void reqIdJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqIdJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reqIdJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JTextField countryJTextField;
    private javax.swing.JTextField employeeNameJTextField;
    private javax.swing.JTextField enterpriseNameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JButton registerJButton;
    private javax.swing.JTextField reqIdJTextField;
    private javax.swing.JPasswordField retypejPasswordField;
    private javax.swing.JTextField stateJTextField;
    private javax.swing.JTextField unJTextField;
    // End of variables declaration//GEN-END:variables
}
