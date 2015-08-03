/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
       
        for (UserAccount ua : userAccountList)
        {
            if (ua.getUsername().equalsIgnoreCase(username) && ua.getPassword().equalsIgnoreCase(password))
            {
                System.err.println("UserAccount "+ua);
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount createUserAccountForEmployee(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean searchUser(String username){
        
        for (UserAccount ua : userAccountList){
        if(ua.getUsername().equals(username)){
           return false;
        }
        }
        return true;
    }   
    
    public Customer getPersonbyUser(UserAccount userAccount){
        
        Customer c = null;           
        for (UserAccount ua : userAccountList){
            if(userAccount.getUsername().equals(ua.getUsername()) && userAccount.getPassword().equals(ua.getPassword())){
                
                c= userAccount.getCustomer();
            }
           
        }
        return c;
    
    }
    
    public UserAccount createUserAccountForCustomer(String username, String password, Customer customer, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setCustomer(customer);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    
    public UserAccount searchForUser(String username){
        for (UserAccount ua : userAccountList){
        if(ua.getUsername().equalsIgnoreCase(username)){
           return ua;
        }
        }
        return null ;
    
    }
}
