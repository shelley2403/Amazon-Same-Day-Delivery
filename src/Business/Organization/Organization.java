/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * 
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    //private CustomerDirectory customerDirectory;
    private int organizationID;
    private static int counter;
   // private OrganizationType organizationType;
    
    public enum OrganizationType{
        Admin("Admin Organization"), Inventory("Inventory Management Organization"), 
        AmazonOrder("Amazon Order Management Organization"), SysAdmin("SystemAdmin Organization"),
        Customer ("Customer Management Organization"), AmazonFinance ("Amazon Finance Organization"), SupplierOrder ("Supplier Order Management Organization"),
        Packaging("Packaging Department"),Delivery("Delivery Management Organization") ,SupplierFinance ("Supplier Finance Organization");
        
        private String value;
        private OrganizationType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        //this.organizationType = organizationType;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        //this.customerDirectory = new CustomerDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

//    public CustomerDirectory getCustomerDirectory() {
//        return customerDirectory;
//    }
    
    

    public UserAccount authenticateUser(String username, String password){
        return this.userAccountDirectory.authenticateUser(username, password);
        
    }
    @Override
    public String toString() {
        return name;
    }
    
    
}
