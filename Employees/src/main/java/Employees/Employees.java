/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author harik
 */
public class Employees {
    static Employees employee = new Employees();
    static String prefixNumber1;
    static String prefixNumber2;
    static String prefixNumber3;
    
    static public String getprefixNumber1(){
        return prefixNumber1;
    }
    public void setprefixNumber1(String newPrefixNumber1){
        this.prefixNumber1 = newPrefixNumber1;
    }
    static public String getprefixNumber2(){
        return prefixNumber2;
    }
    public void setprefixNumber2(String newPrefixNumber2){
        this.prefixNumber2 = newPrefixNumber2;
    }
    static public String getprefixNumber3(){
        return prefixNumber3;
    }
    public void setprefixNumber3(String newPrefixNumber3){
        this.prefixNumber3 = newPrefixNumber3;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Constants
        Random random = new Random();
        String partOne = " will be on the ";
        String partTwo = " network with phone number ";
        
        // Input
        String EmployeeNameOne = JOptionPane.showInputDialog("Enter Employee name 1:");
        String EmployeeNameTwo = JOptionPane.showInputDialog("Enter Employee name 2:");
        String EmployeeNameThree = JOptionPane.showInputDialog("Enter Employee name 3:");

        // A randomiser to pick from the list
        List<String> givenList = new ArrayList<>( Arrays.asList("vodacom", "mtn", "cellc"));
    
        int randomIndex1 = random.nextInt(3);
        String randomElement1 = givenList.get(randomIndex1);
        givenList.remove(randomIndex1);

        int randomIndex2 = random.nextInt(2);
        String randomElement2 = givenList.get(randomIndex2);
        givenList.remove(randomIndex2);

        int randomIndex3 = random.nextInt(1);
        String randomElement3 = givenList.get(randomIndex3);
        givenList.remove(randomIndex3);
    
        // Adds remaining of the cell phone number
        int x = random.nextInt(9999999);
        int y = random.nextInt(9999999);
        int z = random.nextInt(9999999);
        // Header
        

        // Customer one
        if (randomElement1 == "vodacom") {
            String prefixNumber1 = "075";
            employee.setprefixNumber1(prefixNumber1);
            

        } else if (randomElement1 == "mtn") {
            String prefixNumber1 = "083";
            employee.setprefixNumber1(prefixNumber1);

        } else if (randomElement1 == "cellc"){
            String prefixNumber1 = "084";
            employee.setprefixNumber1(prefixNumber1);
        }


        // Customer two
        if (randomElement2 == "vodacom") {
            String prefixNumber2 = "072";
            employee.setprefixNumber2(prefixNumber2);

        } else if (randomElement2 == "mtn") {
            String prefixNumber2 = "083";
            employee.setprefixNumber2(prefixNumber2);

        } else if (randomElement2 == "cellc"){
            String prefixNumber2 = "084";
            employee.setprefixNumber2(prefixNumber2);
        }

        // Customer three
        if (randomElement3 == "vodacom") {
            String prefixNumber3 = "072";
            employee.setprefixNumber3(prefixNumber3);

        } else if (randomElement3 == "mtn") {
            String prefixNumber3 = "083";
            employee.setprefixNumber3(prefixNumber3);

        } else if (randomElement3 == "cellc"){
            String prefixNumber3 = "084";
            employee.setprefixNumber3(prefixNumber3);
        }
        
        JOptionPane.showMessageDialog(null,"""
                                           CELL PHONE NUMBER GENERATOR
                                           ******************************
                                           """+ 
                EmployeeNameOne + partOne + randomElement1 + partTwo + employee.getprefixNumber1() + x + "\n"
        + EmployeeNameTwo+ partOne + randomElement2 + partTwo + employee.getprefixNumber2() + y + "\n" +
        EmployeeNameThree + partOne + randomElement3 + partTwo + employee.getprefixNumber3() + z );
    }
}