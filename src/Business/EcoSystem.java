/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;



/**
 *
 * @author Administrator
 */
public class EcoSystem extends Enterprise{
    
    private static EcoSystem system;
    private Network network;
    
    public static EcoSystem getInstance(){
        if (system == null){
            System.out.println("Hello");
            system = new EcoSystem();
        }
  
        return system;
    }

    private EcoSystem() {
        super(null,null);
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        SystemAdminRole role = new SystemAdminRole();
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(role);
        return roleList;
    }
    
    }
