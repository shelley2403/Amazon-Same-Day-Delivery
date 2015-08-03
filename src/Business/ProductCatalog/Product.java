/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.ProductCatalog;

/**
 *
 * 
 */
public class Product {

    private int productId;
    private String name;
    private float sellingPrice;
    private int availability;
    private String productCategory;
    private String productSpecifications;
    private static int counter = 1000;
    
    public Product(){
       productId = counter;
       ++counter;
               
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductSpecifications() {
        return productSpecifications;
    }

    public void setProductSpecifications(String productSpecifications) {
        this.productSpecifications = productSpecifications;
    }
    
    
    @Override
    public String toString() {
        return productCategory;
    }
    
    
    

}
