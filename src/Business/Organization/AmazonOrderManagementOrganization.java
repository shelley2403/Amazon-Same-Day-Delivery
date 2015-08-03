/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Order.MasterOrderList;
import Business.Organization.Organization;
import Business.Role.InventoryManagerRole;
import Business.Role.AmazonOrderManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sony
 */
public class AmazonOrderManagementOrganization extends Organization{

    private MasterOrderList masterOrderList;
    public AmazonOrderManagementOrganization(MasterOrderList masterOrderList) {        
        super(Organization.OrganizationType.AmazonOrder.getValue());
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
        roles.add(new AmazonOrderManagerRole());
        return roles;
}

}