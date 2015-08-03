/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FinancialAccount;

/**
 *
 * @author sony
 */
public class AmazonFinancialAccount {
    
    private float accountValue= 0;
    public static final String AccountNumber = "00123ABC7890";
    public static final float COMMISSION = (float) 0.05;
    public static final String AccountName = "Amazon's Account";
            
    public float getAccountValue() {
        return accountValue;
    }

    public void setAccountValue(float accountValue) {
        this.accountValue = accountValue;
    }
    
    public void createANewAccount(float accValue){
    AmazonFinancialAccount afa = new AmazonFinancialAccount();
    afa.setAccountValue(accValue);
    
    }
}
