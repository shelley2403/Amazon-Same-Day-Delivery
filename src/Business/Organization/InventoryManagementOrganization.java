/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.ProductCatalog.ProductCatalog;
import Business.Role.InventoryManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class InventoryManagementOrganization extends Organization{

    private ProductCatalog pc;
    public InventoryManagementOrganization(ProductCatalog pc) {
        super(Organization.OrganizationType.Inventory.getValue());
        this.pc = pc;
    }

    public ProductCatalog getPc() {
        return pc;
    }

    public void setPc(ProductCatalog pc) {
        this.pc = pc;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InventoryManagerRole());
        return roles;
    }
     
   
    
    
}
