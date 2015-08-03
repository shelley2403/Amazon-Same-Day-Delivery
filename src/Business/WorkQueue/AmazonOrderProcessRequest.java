/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Order.Order;

/**
 *
 * @author sony
 */
public class AmazonOrderProcessRequest extends WorkRequest{
    
    private String result;
    private float orderValue;
    private Order order;
    private String deliveryResult;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public float getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(float orderValue) {
        this.orderValue = orderValue;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getDeliveryResult() {
        return deliveryResult;
    }

    public void setDeliveryResult(String deliveryResult) {
        this.deliveryResult = deliveryResult;
    }
    
    @Override
    
    public String toString(){
        return String.valueOf(order.getOrderId());
    }
}
