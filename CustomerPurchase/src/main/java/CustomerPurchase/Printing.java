/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerPurchase;
import java.util.Scanner;
/**
 *
 * @author harik
 */
public class Printing {
     static CustomerPurchase cpObj = new CustomerPurchase(); 

    static void PrintDetails(){
        System.out.println("");
        System.out.println("CUSTOMER INVOICE");
        System.out.println("*******************************************");
        System.out.println("CUSTOMER NUMBER     " + cpObj.getCustomerNumber());
        System.out.println("CUSTOMER FIRST NAME " + cpObj.getFirstName());
        System.out.println("CUSTOMER SURNAME:   " + cpObj.getSurname());
        System.out.println("PRODUCT PRICE       R " + cpObj.getPrice());
        System.out.println("PRODUCT QUANTITY:   " + cpObj.getQuatity());
        System.out.println("*******************************************");
        System.out.println("");
    }

    static void CustomerPurchaseReport(){
        Double tax = 0.15; 
        Double commissionAmount = 0.085;
        Double discountAmount = 0.10;
        Double afterTax = cpObj.getPrice() * tax;
        Double discount = cpObj.getPrice() * discountAmount;
        Double commission = cpObj.getPrice() * commissionAmount;
        Double total = (cpObj.getPrice() + afterTax) - (discount + commission);

        System.out.println("");
        System.out.println("CUSTOMER INVOICE");
        System.out.println("*******************************************");
        System.out.println("PRODUCTPRICE = R " + cpObj.getPrice());
        System.out.println("TAX          = R " + afterTax);
        System.out.println("COMMISSION   = R " + commission);
        System.out.println("DISCOUNT     = R " + discount);
        System.out.println("Total        = R " + total);
        System.out.println("*******************************************");
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Customer number:");
        String cNumber = scan.nextLine();
        cpObj.setCustomerNumber(Integer.parseInt(cNumber));

        System.out.println("Enter your first name");
        String name = scan.nextLine();
        cpObj.setFirstName(name);

        System.out.println("Enter your surname");
        String surname = scan.nextLine();
        cpObj.setSurname(surname);

        System.out.println("Enter Product");
        String product = scan.nextLine();
        cpObj.setProduct(product);

        System.out.println("Enter Product Price");
        String price = scan.nextLine();
        cpObj.setPrice(Integer.parseInt(price));

        System.out.println("Enter quantity"); 
        String quantity = scan.nextLine();
        cpObj.setQuantity(Integer.parseInt(quantity));

        PrintDetails();

        System.out.println("Would you like to view the product purchase report? Enter (1) to view the purchase report or any other key to exit.");
        String reportInteger = scan.nextLine();
        Integer viewReport = Integer.parseInt(reportInteger);

        if (viewReport == 1) {
            CustomerPurchaseReport();
        } else {
            System.exit(0);
        }
        
    }
        
}
    
    

