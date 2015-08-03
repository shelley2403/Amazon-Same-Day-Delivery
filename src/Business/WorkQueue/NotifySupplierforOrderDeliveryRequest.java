/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;

/**
 *
 * @author sony
 */
public class NotifySupplierforOrderDeliveryRequest extends WorkRequest{
    
    private String result;
    private int orderId;
    private Customer customer;
    private String productName;
    private String deliveryDate;

    public String getResult() {
        return result;
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getProductName() {
        return productName;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    
    
}
