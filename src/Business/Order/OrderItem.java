/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Enterprise.Enterprise;
import Business.ProductCatalog.Product;
import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class OrderItem {
    
    private Product product;
    private int quantity;
    private Enterprise enterprise;
    private String DeliveryStatus;
    private String DeliveryDate;
    private float supplierTransferAmount;

    //private float actualPrice;
    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDeliveryStatus() {
        return DeliveryStatus;
    }

    public void setDeliveryStatus(String DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }

    public String getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(String DeliveryDate) {
        this.DeliveryDate = DeliveryDate;
    }

    public float getSupplierTransferAmount() {
        return supplierTransferAmount;
    }

    public void setSupplierTransferAmount(float supplierTransferAmount) {
        this.supplierTransferAmount = supplierTransferAmount;
    }
    
    

//    public float getActualPrice() {
//        return actualPrice;
//    }

//    public void setActualPrice(float actualPrice) {
//        this.actualPrice = actualPrice;
//    }
    
    public float getOrderItemTotal(){
            
     return (quantity*product.getSellingPrice());
    
    }
    public String toString()
    {
      return product.getName();
    }

}
