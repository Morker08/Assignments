/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course_Details;
import javax.swing.JOptionPane;
import java.util.Random;
import java.text.SimpleDateFormat;  
import java.util.Date;
/**
 *
 * @author harik
 */
public class Course_Details {
    static Random random = new Random();
    static Course_Details courseDetail = new Course_Details();
    //setters and getters
    String courseName;
    int studentNumber;
    String lecturer;
    
    //courseName
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String newCourseName){
        this.courseName = newCourseName;
    }
    public int getStudentNumber(){
        return studentNumber;
    }
    public void setStudentNumber(int newStudentNumber){
        this.studentNumber = newStudentNumber;
    }
    public String getLecturer(){
        return lecturer;
    }
    public void setLecturer(String newLecturer){
        this.lecturer = newLecturer;
    }
    static int AssignVenue(){
       int X = 1+random.nextInt(3);
       return X;
        
    }
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String userInput =JOptionPane.showInputDialog("Select from the following to view the course details:"
                + " \n 1) DISD \n 2) DIWD \n 3) DIDM");
        Integer input = Integer.parseInt(userInput);
        if(input ==1){
            courseDetail.setCourseName("Diploma in Software Development");
            courseDetail.setStudentNumber(Integer.parseInt("35"));
            courseDetail.setLecturer("Mr Jones");
        }
        else if(input ==2){
            courseDetail.setCourseName("Diploma in Web Development");
            courseDetail.setStudentNumber(Integer.parseInt("28"));
            courseDetail.setLecturer("Mrs Smith");
        }
        else if(input ==3){
            courseDetail.setCourseName("Diploma in Data Metrics");
            courseDetail.setStudentNumber(Integer.parseInt("39"));
            courseDetail.setLecturer("Mr Ntsinga");
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  
        Date date = new Date();
        
        System.out.println("COURSE REPORT - " + formatter.format(date));
        System.out.println("************************************************");
        System.out.println("COURSE:         " + courseDetail.getCourseName());
        System.out.println("STUDENT NUMBER  " + courseDetail.getStudentNumber());
        System.out.println("LECTURER        " + courseDetail.getLecturer());
        System.out.println("VENUE           " + AssignVenue());
        System.out.println("************************************************");
        
                
         
        
            
    }
        
            
        
    
    
}
