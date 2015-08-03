/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raunak
 */
public class SupplierRegistrationRequest extends WorkRequest{
    
    private String testResult;
    private String countryRequest;
    private String stateRequest;
    private String cityRequest;
    private int requestId;
   // private static int counter;
    
        
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getCountryRequest() {
        return countryRequest;
    }

    public String getStateRequest() {
        return stateRequest;
    }

    public String getCityRequest() {
        return cityRequest;
    }


    public void setCountryRequest(String countryRequest) {
        this.countryRequest = countryRequest;
    }

    public void setStateRequest(String stateRequest) {
        this.stateRequest = stateRequest;
    }

    public void setCityRequest(String cityRequest) {
        this.cityRequest = cityRequest;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        
        this.requestId = requestId;
    }

    
      
}
