/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeliveryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * 
 */
public class DeliveryManagementOrganization extends Organization{

    public DeliveryManagementOrganization() {
        super(Organization.OrganizationType.Delivery.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DeliveryRole());
        return roles;
    }
     
}