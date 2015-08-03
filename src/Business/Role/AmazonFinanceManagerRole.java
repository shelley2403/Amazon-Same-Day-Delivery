/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AmazonFinanceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AmazonFinanceManagerRole.AmazonFinanceManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sony
 */
public class AmazonFinanceManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new AmazonFinanceManagerWorkAreaJPanel(userProcessContainer, useraccount, (AmazonFinanceOrganization)organization, enterprise,system);
    
}
}
