/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.Order.Order;
import java.util.Date;

/**
 *
 * @author sony
 */
public class DeliveryRequest extends WorkRequest {
    
    private String result;
    private Customer customer;
    private int productId;
    private int quantity;
    private String productName;
    private String deliveryDate;
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public Customer getCustomer() {
        return customer;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    @Override
    public String toString(){
    return String.valueOf(order.getOrderId());
    }
    
}
