/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * 
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public void addSupplierWorkRequest(SupplierRegistrationRequest wr){
        
    int x = 10000;
    ((SupplierRegistrationRequest)wr).setRequestId(x);
        System.err.println(wr.getRequestId());
    this.workRequestList.add(wr);
    
    }
}