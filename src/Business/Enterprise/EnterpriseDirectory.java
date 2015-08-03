/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author sony
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
    this.enterpriseList=new ArrayList<>();
    
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Supplier){
            enterprise = new SupplierEnterprise(name);
//            enterprise.setEnterpriseCountry(country);
//            enterprise.setEnterpriseState(state);
//            enterprise.setEnterpriseCity(city);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Amazon){
            enterprise = new AmazonEnterprise(name);
            enterpriseList.add(enterprise);
        }
    return enterprise;
    }
    
    
}
