/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.FinancialAccount.SupplierFinancialAccount;
import Business.Invoice.InvoiceDirectory;
import Business.Payment.PaymentHistory;
import Business.Role.Role;
import Business.Role.SupplierFinanceManagerRole;
import java.util.ArrayList;

/**
 *
 * @author sony
 */
public class SupplierFinanceOrganization extends Organization{
    
    private InvoiceDirectory id;
    private PaymentHistory ph;
    private SupplierFinancialAccount supplierFinancialAccount;
    public SupplierFinanceOrganization(InvoiceDirectory id, PaymentHistory ph, SupplierFinancialAccount supplierFinancialAccount) {
        super(Organization.OrganizationType.SupplierFinance.getValue());
        this.id = id;
        this.ph= ph;
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

    public SupplierFinancialAccount getSupplierFinancialAccount() {
        return supplierFinancialAccount;
    }

    public void setSupplierFinancialAccount(SupplierFinancialAccount supplierFinancialAccount) {
        this.supplierFinancialAccount = supplierFinancialAccount;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
     ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierFinanceManagerRole());
        return roles;
    }
}
