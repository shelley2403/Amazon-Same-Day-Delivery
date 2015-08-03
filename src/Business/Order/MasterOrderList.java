/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.ProductCatalog.Product;
import java.util.ArrayList;

/**
 *
 * 
 */
public class MasterOrderList {
    
    private ArrayList<Order> orderList;
    
    public MasterOrderList() {
        orderList = new ArrayList<> ();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public Order addOrder(Order tempOrder){
        
        orderList.add(tempOrder);
        return tempOrder;
    }
    
    public ArrayList<Order> getOrdersByCustomer(Customer customerPerson)
    {
        ArrayList<Order> tempOrderList = new ArrayList<Order>();
        for(Order o : orderList)
        {
           if(o.getCustomerPerson() == customerPerson){
               tempOrderList.add(o);           
           }
        }
        return tempOrderList;
    }
    
//    public int calculateCommission(Person salesPerson){
//    
//        float commissionValue = 0;
//        for (Order order : orderList){
//            if (order.getSalesPerson() == salesPerson){
//                
//                ArrayList <OrderItem> listofallOrders = order.getOrderItemList();
//                    
//                for (OrderItem oi : listofallOrders){
//                
//                        //commissionValue = commissionValue + (oi.getQuantity()*(oi.getActualPrice())- (oi.getProduct().getTargetPrice()));
//                        commissionValue += (float)oi.getQuantity()*((float)oi.getActualPrice()-(float)oi.getProduct().getTargetPrice());
//                }
//            }
//        
//        }
//        
//        return (int)commissionValue;
//    }
    
    
    public Product topSellingProduct(){
    
        int maxQuantity = 0;
        Product maxP=new Product();
        for (Order order : orderList){
         
            ArrayList <OrderItem> tempList = order.getOrderItemList();
            
                for (OrderItem oi : tempList){
                    if(maxQuantity < oi.getQuantity())
                        maxQuantity = oi.getQuantity();
                        maxP=oi.getProduct();
                }
          }
        return maxP;
    
    }      
    
//    public ArrayList<Order> getOrdersBySalesPerson(Person salesPerson)
//    {
//        ArrayList<Order> temporaryOrderList = new ArrayList<Order>();
//        for(Order o : orderList)
//        {
//           if(o.getSalesPerson() == salesPerson){
//               temporaryOrderList.add(o);           
//           }
//        }
//        return temporaryOrderList;
//    }
}
