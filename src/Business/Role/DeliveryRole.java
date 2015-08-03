/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.EcoSystem;
import Business.Organization.DeliveryManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.DeliveryRole.DeliveryManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * 
 */
public class DeliveryRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new DeliveryManagerWorkAreaJPanel(userProcessContainer, useraccount, organization, enterprise, system);

}
}
