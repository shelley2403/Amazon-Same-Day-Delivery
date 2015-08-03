/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.FinancialAccount.AmazonFinancialAccount;
import Business.Invoice.Invoice;
import Business.Order.Order;
import Business.Payment.Payment;

/**
 *
 * @author sony
 */
public class AmazonPaymentValidationRequest extends WorkRequest{
    
    
    private Customer customer;
    private float invoiceAmt;
    private String result;
    private Order finalOrder;
    private Invoice finalInvoice;
    private Payment finalPayment;
    private String deliveryResult;
    private AmazonFinancialAccount amazonFinancialAccount;
    private float supplierAmount;

    public AmazonFinancialAccount getAmazonFinancialAccount() {
        return amazonFinancialAccount;
    }

    public void setAmazonFinancialAccount(AmazonFinancialAccount amazonFinancialAccount) {
        this.amazonFinancialAccount = amazonFinancialAccount;
    }
    

    public Order getFinalOrder() {
        return finalOrder;
    }

    public void setFinalOrder(Order finalOrder) {
        this.finalOrder = finalOrder;
    }

    public float getInvoiceAmt() {
        return invoiceAmt;
    }

    public void setInvoiceAmt(float invoiceAmt) {
        this.invoiceAmt = invoiceAmt;
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


    public Invoice getFinalInvoice() {
        return finalInvoice;
    }

    public void setFinalInvoice(Invoice finalInvoice) {
        this.finalInvoice = finalInvoice;
    }

    public Payment getFinalPayment() {
        return finalPayment;
    }

    public void setFinalPayment(Payment finalPayment) {
        this.finalPayment = finalPayment;
    }

    public String getDeliveryResult() {
        return deliveryResult;
    }

    public void setDeliveryResult(String deliveryResult) {
        this.deliveryResult = deliveryResult;
    }
    
    
    
    @Override
    public String toString(){
    return String.valueOf(finalInvoice.getInvoiceNo());
    }
}
