/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Invoice;

import Business.Customer.Customer;
import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author sony
 */
public class InvoiceDirectory {
    
    private ArrayList<Invoice> invoiceList;
    
    public InvoiceDirectory() {
        invoiceList = new ArrayList<> ();
    }

    public ArrayList<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(ArrayList<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }
    
    public Invoice addInvoice(Invoice invoice){
        //invoice.setStatus(Invoice.AMOUNT_PAID
        
        invoiceList.add(invoice);
        
        return invoice;
    }
    
    public ArrayList<Invoice> getInvoiceOfCustomer(Customer customerPerson)
    {
        ArrayList<Invoice> tempInvoiceList = new ArrayList<Invoice>();
        for(Invoice i : invoiceList)
        {
           if(i.getOrder().getCustomerPerson()== customerPerson){
               tempInvoiceList.add(i);           
           }
        }
        return tempInvoiceList;
    }
}
