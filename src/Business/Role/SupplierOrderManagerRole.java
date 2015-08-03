/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SupplierOrderManagementOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.SupplierOrderManagerRole.SupplierOrderManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sony
 */
public class SupplierOrderManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, Organization organization, Enterprise enterprise, EcoSystem system) {
     return new SupplierOrderManagerWorkAreaJPanel(userProcessContainer, useraccount, organization, enterprise, system);
    
}
}

