/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.Enterprise.Enterprise;
import Business.ProductCatalog.Product;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * 
 */
public class Order {
    
    private ArrayList<OrderItem> orderItemList;
    private Customer customerPerson;
    private static int counter= 10001000;
    private int orderId;
    private float totalValueOfOrder;
    private String orderDate;
    private float taxValue;
    private float finalAmount;
    public static final float TAX = (float) 0.10;
    
    public Order() {
 
        orderId= counter;
        ++counter;
        orderItemList = new ArrayList<OrderItem>();
    }

    public float getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(float taxValue) {
        this.taxValue = taxValue;
    }
    
    public int getOrderId() {
        return orderId;
    }    

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public Customer getCustomerPerson() {
        return customerPerson;
    }

    public void setCustomerPerson(Customer customerPerson) {
        this.customerPerson = customerPerson;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public float getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(float finalAmount) {
        this.finalAmount = finalAmount;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    
    
   
//    public Person getSalesPerson() {
//        return salesPerson;
//    }
//
//    public void setSalesPerson(Person salesPerson) {
//        this.salesPerson = salesPerson;
//    }    

    public float getTotalValueOfOrder() {
        return totalValueOfOrder;
    }

    public void setTotalValueOfOrder(ArrayList<OrderItem> list)
    {
        totalValueOfOrder = 0;
        list = orderItemList;
        for(OrderItem item :orderItemList)
        {
           totalValueOfOrder = totalValueOfOrder + (item.getQuantity()* item.getProduct().getSellingPrice());
        }    
    }
    
    @Override
    public String toString()
    {
     return String.valueOf(orderId) ;
     }
    
    public OrderItem newOrderItem(Product p, int quantity,float actualPrice, Enterprise e)
    {
         OrderItem item = new OrderItem();
         item.setProduct(p);
         item.setQuantity(quantity);
         item.getProduct().setSellingPrice(actualPrice);
         item.setEnterprise(e);
         orderItemList.add(item);
         return item;
    }
    
    public void removeOrder(OrderItem item)
    {
        orderItemList.remove(item);
    }
}
