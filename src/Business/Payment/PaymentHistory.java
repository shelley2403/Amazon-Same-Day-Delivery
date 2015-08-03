/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Payment;

import java.util.ArrayList;

/**
 *
 * @author sony
 */
public class PaymentHistory {
    
    
    private ArrayList<Payment> paymentList;

    public PaymentHistory() {
        this.paymentList = new ArrayList<>();
    }

    public ArrayList<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(ArrayList<Payment> paymentList) {
        this.paymentList = paymentList;
    }
    
    public Payment makeAPayment(int cardNo, String cardType, String exDate, int cvv, String payDate, float payAmount){
        Payment payment = new Payment();
        payment.setCardNo(cardNo);
        payment.setPaymentMode(cardType);
        payment.setExpirationDate(exDate);
        payment.setCvv(cvv);
        payment.setDateOfPayment(payDate);
        payment.setAmountPaid(payAmount);
        paymentList.add(payment);
        return payment;
    }
    
    public Payment addPayment(Payment payment){
        paymentList.add(payment);
        return payment;
    
    }
    
}
