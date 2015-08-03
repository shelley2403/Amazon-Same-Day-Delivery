/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * 
 */
public class Customer {
    
    private String firstName;
    private String lastName;
    private String address1;
    private int zipcode;
    private int phoneNo;
    private int customerId;
    private static int count = 0;
    private int ssn;
    private int age;
    private String address;
    private String country;
    private String state;
    private String city;
    
    public Customer(){
        customerId = ++count;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public static int getCount() {
        return count;
    }

    public int getSsn() {
        return ssn;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public static void setCount(int count) {
        Customer.count = count;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress1() {
        return address1;
    }

    public int getZipcode() {
        return zipcode;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    @Override
    public String toString() {
        return firstName + "," + lastName;
    }
    
    
}
