/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Payment;

import Business.FinancialAccount.AmazonFinancialAccount;
import Business.Invoice.Invoice;
import java.util.Date;

/**
 *
 * @author sony
 */
public class Payment {
    
    private Invoice invoice;
    private float amountPaid;
    private String dateOfPayment;
    private String expirationDate;
    private int cardNo;
    public static final String Credit = "Credit";
    public static final String Debit = "Debit";
    private int cvv;
    private String paymentMode;
    

  
    
    public Invoice getInvoice() {
        return invoice;
    }

    public float getAmountPaid() {
        return amountPaid;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setAmountPaid(float amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(String dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}
