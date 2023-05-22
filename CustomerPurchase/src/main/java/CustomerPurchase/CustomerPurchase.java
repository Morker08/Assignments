/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerPurchase;

/**
 *
 * @author harik
 */
public class CustomerPurchase {
    int customerNumber;
    String FirstName;
    String Surname;
    String Product;
    int Price;
    int Quantity;

    // customerNumber
    public int getCustomerNumber(){
        return customerNumber;
    }


    public void setCustomerNumber(int newCustomerNumber){
        this.customerNumber = newCustomerNumber;
    }
    
    // FirstName
    public String getFirstName(){
        return FirstName;
    }

    public void setFirstName(String newFirstName){
        this.FirstName = newFirstName;
    }

    // Surname
    public String getSurname(){
        return Surname;
    }

    public void setSurname(String newSurname){
        this.Surname = newSurname;
    }
    
    // Product
    public String getProduct(){
        return Product;
    }

    public void setProduct(String newProduct){
        this.Product = newProduct;
    }

    // Price
    public int getPrice(){
        return Price;
    }

    public void setPrice(int newPrice){
        this.Price = newPrice;
    }

    // Quantity
    public int getQuatity(){
        return this.Quantity;
    }
    
    public void setQuantity(int newQuantity){
        this.Quantity = newQuantity;
    }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
