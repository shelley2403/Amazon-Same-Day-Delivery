/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author sony
 */
public abstract class Enterprise extends Organization {
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private int enterpriseId;
    private static int counter;
    private String enterpriseCountry;
    private String enterpriseCity;
    private String enterpriseState;
    
    public Enterprise(String name, EnterpriseType type){
    super(name);
    this.enterpriseType = type;
    this.organizationDirectory = new OrganizationDirectory();
    this.enterpriseId= counter;
    ++counter;
    }
   
     public enum EnterpriseType{
        Supplier("Supplier Enterprise"), Amazon("Amazon Enterprise");
        private String value;
        private EnterpriseType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        
        @Override
            public String toString(){
            return value;
        }
   
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseCountry() {
        return enterpriseCountry;
    }

    public String getEnterpriseCity() {
        return enterpriseCity;
    }

    public String getEnterpriseState() {
        return enterpriseState;
    }

    public void setEnterpriseCountry(String enterpriseCountry) {
        this.enterpriseCountry = enterpriseCountry;
    }

    public void setEnterpriseCity(String enterpriseCity) {
        this.enterpriseCity = enterpriseCity;
    }

    public void setEnterpriseState(String enterpriseState) {
        this.enterpriseState = enterpriseState;
    }
    
    
    
    /* @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EnterpriseAdminRole());
        return roles;
    } */

    public int getEnterpriseId() {
        return enterpriseId;
    }
    
}
