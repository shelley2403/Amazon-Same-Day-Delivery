/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.Order.Order;

/**
 *
 * @author sony
 */
public class SupplierOrderRequest extends WorkRequest {
    
    private Customer customer;
    private int productId;
    private int quantity;
    private String productName;
    private String result;
    private Order finalOrder;
    private String deliveryResult;

    public Order getFinalOrder() {
        return finalOrder;
    }

    public void setFinalOrder(Order finalOrder) {
        this.finalOrder = finalOrder;
    }
    

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDeliveryResult() {
        return deliveryResult;
    }

    public void setDeliveryResult(String deliveryResult) {
        this.deliveryResult = deliveryResult;
    }
    
    
    
    @Override
    public String toString(){
    return String.valueOf(finalOrder.getOrderId());
    }
    
}
