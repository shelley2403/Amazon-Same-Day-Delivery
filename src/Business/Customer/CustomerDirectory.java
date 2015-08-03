/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * 
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
    customerList = new ArrayList<Customer>();    
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer newCustomer(String fname, String lname, int ssn, int age)
    {
       Customer c = new Customer();
       c.setFirstName(fname);
       c.setLastName(lname);
       c.setSsn(ssn);
       c.setAge((age));
       customerList.add(c);
       return c;
    }           
    
    public void removeCustomer(Customer c)
    {
        customerList.remove(c);
    }
        
    public Customer findCustomerByLastName(String lname)
    {
       for(Customer customer:customerList)
       {
          if(customer.getLastName().equals(lname))
          {
              return customer;
          }
       }
       return null;
    }
    
    public boolean checkForSsn(int ssn) {

        for (Customer p : customerList) {
            if (ssn == p.getSsn()) {
                return false;
            }
        }
        return true;
    }
    
    public Customer searchPerson(String fname, int ssn){
        
        for (Customer p : customerList){
        if(fname.equals(p.getFirstName()) &&  ssn == p.getSsn()){
           return p;
            }
        }
        return null;
    }
}
