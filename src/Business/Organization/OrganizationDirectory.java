/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.FinancialAccount.AmazonFinancialAccount;
import Business.FinancialAccount.SupplierFinancialAccount;
import Business.Invoice.InvoiceDirectory;
import Business.Order.MasterOrderList;
import Business.Organization.Organization.OrganizationType;
import Business.Payment.PaymentHistory;
import Business.ProductCatalog.ProductCatalog;
import java.util.ArrayList;

/**
 *
 * 
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(OrganizationType type){
        Organization organization = null;
        
        if (type.getValue().equals(OrganizationType.Inventory.getValue())){
            ProductCatalog pc = new ProductCatalog();
            organization = new InventoryManagementOrganization(pc);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.AmazonOrder.getValue())){
            MasterOrderList masterOrderList = new MasterOrderList();
            organization = new AmazonOrderManagementOrganization(masterOrderList);
            organizationList.add(organization);
      
        }else if (type.getValue().equals(OrganizationType.SysAdmin.getValue())){
            organization = new SystemAdminOrganization();
            organizationList.add(organization);
            
        }else if (type.getValue().equals(OrganizationType.Customer.getValue())){
            CustomerDirectory cd = new CustomerDirectory();
            organization = new CustomerManagementOrganization(cd);
            organizationList.add(organization);
        }else if (type.getValue().equals(OrganizationType.AmazonFinance.getValue())){
            InvoiceDirectory id = new InvoiceDirectory();
            PaymentHistory ph = new PaymentHistory();
            AmazonFinancialAccount amazonFinancialAccount = new AmazonFinancialAccount();
            organization = new AmazonFinanceOrganization(id, ph, amazonFinancialAccount);
            organizationList.add(organization);
        }else if (type.getValue().equals(OrganizationType.SupplierOrder.getValue())){
            MasterOrderList masterOrderList = new MasterOrderList();
            organization = new SupplierOrderManagementOrganization(masterOrderList);
            organizationList.add(organization);
        } else if (type.getValue().equals(OrganizationType.Delivery.getValue())){
            organization = new DeliveryManagementOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.Packaging.getValue())){
            organization = new PackagingOrganization();
            organizationList.add(organization);
        }   else if (type.getValue().equals(OrganizationType.SupplierFinance.getValue())){
            InvoiceDirectory id = new InvoiceDirectory();
            PaymentHistory ph = new PaymentHistory();
            SupplierFinancialAccount supplierFinancialAccount = new SupplierFinancialAccount();
            organization = new SupplierFinanceOrganization(id, ph, supplierFinancialAccount);
            organizationList.add(organization);
        }
        
        
        return organization;
    }
}
    