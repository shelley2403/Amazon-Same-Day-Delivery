/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.ProductCatalog;

import java.util.ArrayList;

/**
 *
 * 
 */
public class ProductCatalog {
    
    private ArrayList<Product> productList;

    public ProductCatalog() {
        productList = new ArrayList<>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product newProduct(){
        Product prod = new Product();
        productList.add(prod);
        return prod;
    }
    public void removeProduct(Product p){
        productList.remove(p);
    }
    
    public Product findByID(int id){
        
        for(Product p: productList){
            if(p.getProductId()== id){
                return p;
            }
        }
        return null;
    }
   public Product createNewProduct(String proName, int proId, float sp, int available , String proCat, String specifications){
       Product pro = new Product();
       pro.setName(proName);
       pro.setProductId(proId);
       pro.setSellingPrice(sp);
       pro.setAvailability(available);
       pro.setProductCategory(proCat);
       pro.setProductSpecifications(specifications);
       productList.add(pro);
       return pro;
   }
}
