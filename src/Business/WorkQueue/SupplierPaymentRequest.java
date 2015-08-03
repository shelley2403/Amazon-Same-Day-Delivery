/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.FinancialAccount.SupplierFinancialAccount;

/**
 *
 * @author sony
 */
public class SupplierPaymentRequest extends WorkRequest{
    
    private int invoiceNo;
    private float receivingAmount;
    private SupplierFinancialAccount supplierFinancialAccount;

    public int getInvoiceNo() {
        return invoiceNo;
    }


    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public float getReceivingAmount() {
        return receivingAmount;
    }

    public void setReceivingAmount(float receivingAmount) {
        this.receivingAmount = receivingAmount;
    }

    public SupplierFinancialAccount getSupplierFinancialAccount() {
        return supplierFinancialAccount;
    }

    public void setSupplierFinancialAccount(SupplierFinancialAccount supplierFinancialAccount) {
        this.supplierFinancialAccount = supplierFinancialAccount;
    }

    
}
