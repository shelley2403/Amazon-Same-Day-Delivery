/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.FinancialAccount.AmazonFinancialAccount;
import Business.Invoice.InvoiceDirectory;
import Business.Payment.PaymentHistory;
import Business.Role.AmazonFinanceManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sony
 */
public class AmazonFinanceOrganization extends Organization{
    
    private InvoiceDirectory id;
    private PaymentHistory ph;
    private AmazonFinancialAccount amazonFinancialAccount;
    public AmazonFinanceOrganization(InvoiceDirectory id, PaymentHistory ph, AmazonFinancialAccount amazonFinancialAccount) {
        super(Organization.OrganizationType.AmazonFinance.getValue());
        this.id = id;
        this.ph= ph;
        this.amazonFinancialAccount = amazonFinancialAccount;
    }

    public InvoiceDirectory getId() {
        return id;
    }

    public void setId(InvoiceDirectory id) {
        this.id = id;
    }

    public PaymentHistory getPh() {
        return ph;
    }

    public void setPh(PaymentHistory ph) {
        this.ph = ph;
    }

    public AmazonFinancialAccount getAmazonFinancialAccount() {
        return amazonFinancialAccount;
    }

    public void setAmazonFinancialAccount(AmazonFinancialAccount amazonFinancialAccount) {
        this.amazonFinancialAccount = amazonFinancialAccount;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
     ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AmazonFinanceManagerRole());
        return roles;
    }
}
