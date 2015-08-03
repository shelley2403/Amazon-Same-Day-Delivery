/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Order.MasterOrderList;
import Business.Role.Role;
import Business.Role.SupplierOrderManagerRole;
import java.util.ArrayList;

/**
 *
 * @author sony
 */
public class SupplierOrderManagementOrganization extends Organization{
    
    private MasterOrderList masterOrderList;
    public SupplierOrderManagementOrganization(MasterOrderList masterOrderList) {        
        super(Organization.OrganizationType.SupplierOrder.getValue());
        this.masterOrderList = masterOrderList;
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(MasterOrderList masterOrderList) {
        this.masterOrderList = masterOrderList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierOrderManagerRole());
        return roles;
}
    
}
