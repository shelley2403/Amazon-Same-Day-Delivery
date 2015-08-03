/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.FinancialAccount.AmazonFinancialAccount;
import Business.Network.Network;
import Business.Organization.AmazonFinanceOrganization;
import Business.Organization.AmazonOrderManagementOrganization;
import Business.Organization.CustomerManagementOrganization;
import Business.Organization.InventoryManagementOrganization;
import Business.Organization.Organization;
import Business.Organization.SystemAdminOrganization;
import Business.ProductCatalog.Product;
import Business.Role.AdminRole;
import Business.Role.AmazonFinanceManagerRole;
import Business.Role.AmazonOrderManagerRole;
import Business.Role.CustomerRole;
import Business.Role.InventoryManagerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * 
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
  
        
        // Create System Admin Organization Inside Amazon
        system.getOrganizationDirectory().createOrganization(Organization.OrganizationType.SysAdmin);
        
        SystemAdminOrganization org = null;
        for (Organization organization : system.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof SystemAdminOrganization){
                org = (SystemAdminOrganization)organization;
                break;
            }
        }
        if (org!=null){
            Employee employee = new Employee();
            employee.setName("System Admin");
            
            org.getEmployeeDirectory().getEmployeeList().add(employee);
            
            UserAccount userAccount = new UserAccount();
            userAccount.setUsername("sysadmin");
            userAccount.setPassword("sysadmin");
            userAccount.setEmployee(employee);
            userAccount.setRole(new SystemAdminRole());
            org.getUserAccountDirectory().getUserAccountList().add(userAccount);
        }
//        

        
        
        // Create a new network named Globe and create Countries, States and Cities in that
        
        Network network = new Network();
        network.setName("Globe");
        network.setNetworkType('g');
        system.setNetwork(network);
        Network country = network.createAndAddCountry("USA");
        Network state = country.createAndAddState("MA");
        Network city =state.createAndAddCity("Boston");
        //system.getNetwork().getNetworkList().add(network);
      
        
        
        Enterprise enterprise = city.getEnterpriseDirectory().createAndAddEnterprise("Amazon Boston", Enterprise.EnterpriseType.Amazon);
        Enterprise enterprise1 = city.getEnterpriseDirectory().createAndAddEnterprise("Boston Works", Enterprise.EnterpriseType.Supplier);
        enterprise.setEnterpriseCountry("USA");
        enterprise.setEnterpriseState("MA");
        enterprise.setEnterpriseCity("BOSTON");
        enterprise1.setEnterpriseCountry("USA");
        enterprise1.setEnterpriseState("MA");
        enterprise1.setEnterpriseCity("BOSTON");
        
        
        
        Employee emp =enterprise.getEmployeeDirectory().createEmployee("Shelley");
        enterprise.getUserAccountDirectory().createUserAccountForEmployee("admin", "admin" , emp, new AdminRole());
        
        Employee empl = enterprise1.getEmployeeDirectory().createEmployee("Boston Works Admin");
        enterprise1.getUserAccountDirectory().createUserAccountForEmployee("supplier", "supplier" , empl, new AdminRole());
        
       // if("Boston Works".equals(Enterprise.EnterpriseType.Supplier.getValue())){
            
//            for (Organization organization : enterprise1.getOrganizationDirectory().getOrganizationList()){
//                if(organization.getName().equals("Inventory Organization")){
//                InventoryManagementOrganization inv = (InventoryManagementOrganization)organization;
//                inv.getEmployeeDirectory().createEmployee("ram");
//                inv.getUserAccountDirectory().createUserAccountForEmployee("ram", "ram", employee, new InventoryManagerRole());
//                    Product p = inv.getPc().createNewProduct("dell inspiron", 50000, 300, 100);
//                }
//                }
//           // }
        
        // Create Customer Organization inside Amazon
        
        system.getOrganizationDirectory().createOrganization(Organization.OrganizationType.Customer);
        
        CustomerManagementOrganization cmo = null;
            for (Organization organization : system.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof CustomerManagementOrganization) {
                      cmo = (CustomerManagementOrganization) organization;
                      break;
                }
            }
            
            if(cmo != null){
                
                // Create a new customer inside this organization
                Customer customer = new Customer();
                customer.setFirstName("Justin");
                customer.setLastName("Bieber");
                customer.setAge(25); 
                customer.setSsn(12345);
                cmo.getCd().getCustomerList().add(customer);
            
                UserAccount uaCustomer = new UserAccount();
                uaCustomer.setUsername("customer");
                uaCustomer.setPassword("customer");
                uaCustomer.setRole(new CustomerRole());
                uaCustomer.setCustomer(customer);
                
                cmo.getUserAccountDirectory().getUserAccountList().add(uaCustomer);
            }
            
            // create Amazon Finance Organization
            
         system.getOrganizationDirectory().createOrganization(Organization.OrganizationType.AmazonFinance);
        
        AmazonFinanceOrganization afo = null;
            for (Organization organization : system.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof AmazonFinanceOrganization) {
                      afo = (AmazonFinanceOrganization) organization;
                      break;
                }
            }
            
            if(afo != null){
                Employee employee = new Employee();
                employee.setName("Finance Admin Amazon");
                afo.getEmployeeDirectory().getEmployeeList().add(employee);
                afo.getUserAccountDirectory().createUserAccountForEmployee("finance", "finance", employee, new AmazonFinanceManagerRole());
                
                AmazonFinancialAccount afa = new AmazonFinancialAccount();
                afa.setAccountValue(0);
                
                afo.setAmazonFinancialAccount(afa);
                // afo.getAmazonFinancialAccount().createANewAccount(0);
            }
            
            
       
            //Create Amazon Order Management Organization
        system.getOrganizationDirectory().createOrganization(Organization.OrganizationType.AmazonOrder);
        
        AmazonOrderManagementOrganization aomo = null;
            for (Organization organization : system.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof AmazonOrderManagementOrganization) {
                      aomo = (AmazonOrderManagementOrganization) organization;
                      break;
                }
            }
            
            if(aomo != null){
                Employee employee = new Employee();
                employee.setName("Order Admin Amazon");
                aomo.getEmployeeDirectory().getEmployeeList().add(employee);
                aomo.getUserAccountDirectory().createUserAccountForEmployee("order", "order", employee, new AmazonOrderManagerRole());
            }
        
        return system;
    }
    
}
