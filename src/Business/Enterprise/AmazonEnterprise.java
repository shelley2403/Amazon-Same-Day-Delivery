/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AmazonEnterprise extends Enterprise{

    public AmazonEnterprise(String name) {
        super(name, EnterpriseType.Amazon);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
