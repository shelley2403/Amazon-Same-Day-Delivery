/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Invoice;

import Business.Order.Order;
import java.util.Date;

/**
 *
 * @author sony
 */
public class Invoice {
    
    //private float totalAmount;
    private Order order;
    private String status;
    private String invoiceDate;
    private int invoiceNo;
    private static int counter;
    //private float taxAmount;
    private float totalInvoiceAmount; 
    public static final String AMOUNT_PAID = "PAID";
    public static final String AMOUNT_UNPAID = "UNPAID";
    //public static final float TAX = (float) 0.10;
    
    public Invoice() {
        invoiceNo = counter;
        ++counter;
        this.status = "UNPAID";
    }

   
//    public float getTotalAmount() {
//        return totalAmount;
//    }

    public Order getOrder() {
        return order;
    }


    public String getStatus() {
        return status;
    }

//    public void setTotalAmount(float totalAmount) {
//        this.totalAmount = totalAmount;
//    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

//    public float getTaxAmount() {
//        return taxAmount;
//    }

    public float getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

//    public void setTaxAmount(float taxAmount) {
//        this.taxAmount = taxAmount;
//    }

    public void setTotalInvoiceAmount(float totalInvoiceAmount) {
        this.totalInvoiceAmount = totalInvoiceAmount;
    }

    
   
    @Override
    public String toString()
    {
     return String.valueOf(invoiceNo) ;
     }
}
