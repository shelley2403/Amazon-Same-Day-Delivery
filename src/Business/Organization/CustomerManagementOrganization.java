/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Role.CustomerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sony
 */
public class CustomerManagementOrganization extends Organization {
    
    private CustomerDirectory cd;
    public CustomerManagementOrganization(CustomerDirectory cd) {
        super(Organization.OrganizationType.Customer.getValue());
        this.cd = cd;
    }

    public CustomerDirectory getCd() {
        return cd;
    }

    public void setCd(CustomerDirectory cd) {
        this.cd = cd;
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerRole());
        return roles;
    }

    
    
    
}
