/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author sony
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private ArrayList<Network> networkList;
    private char networkType;/*g-Globe
     *                          c-country
     *                          s-state
     *                          i-city
     */
    
    public Network(){
    enterpriseDirectory = new EnterpriseDirectory();
    networkList = new ArrayList<>();
    }

    public char getNetworkType() {
        return networkType;
    }

    public void setNetworkType(char networkType) {
        this.networkType = networkType;
    }
   

    
    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }


    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    
     public Network createAndAddCountry(String name){
        //Network country = new Network();
        //country.setName(name);
       // networkList.add(country);
        Network country = createLocation(name);
        country.setNetworkType('c');
        return country;
    }
     
     public Network createLocation(String name)
    {
        Network location = new Network();
        location.setName(name);
        networkList.add(location);
        return location;
        
    }
     
     public Network createAndAddState( String name){
     
        // Network subnetwork = new Network();
        // for(Network network : networkList){
           Network state = createLocation(name);
           state.setNetworkType('s');
           return state;
           //return null;
     }
     
     public Network createAndAddCity (String name){
         Network city = createLocation(name);
         city.setNetworkType('i');
         return city;
     }
         
     public String searchCountry(String countryName){
        
        
        for (Network n : networkList){
            if (networkType == 'c'){
            if(n.getName().equals(countryName.toLowerCase())){
            System.err.println(n.getName());
            return n.getName();
            
            }
            }
        }
        return null;
         
    }
        
    @Override
    public String toString(){
    return name;
    }
}
