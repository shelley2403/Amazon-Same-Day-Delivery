/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.EcoSystem;
import Business.Organization.AmazonOrderManagementOrganization;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import UserInterface.AmazonOrderManagementRole.AmazonOrderManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AmazonOrderManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new AmazonOrderManagerWorkAreaJPanel(userProcessContainer, account, organization, enterprise, system);
    }
    
    
}
