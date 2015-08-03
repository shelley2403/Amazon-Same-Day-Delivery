/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.SupplierFinanceManagerRole.SupplierFinanceManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sony
 */
public class SupplierFinanceManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, Organization organization, Enterprise enterprise, EcoSystem system) {
      return new SupplierFinanceManagerWorkAreaJPanel(userProcessContainer, useraccount, organization, enterprise, system);
    
}
}
