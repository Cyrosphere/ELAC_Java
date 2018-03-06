/*
lab 6
Xiangbang Sun

Create an array of objects
instantiating an array, calling methods to setup paramaters
iterate through the list, instantiating an object for each element.
collect paramaters and print

*/
import java.util.Scanner;

public class lab6{
  //main method
  public static void main(String[] args){
    int class_size = 5;
    int student_number = 0;
    double student_gpa = 0.0;
    String student_major = "";
    
    Student[] kids = new Student[class_size];//instantiating an object array
    
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    
    System.out.println("class information input\n");
    
    for (int i = 0; i < kids.length; i++){
      
      student_number = i + 1;
      System.out.println("\n enter GPA for student " + student_number + " \n");
      student_gpa = input.nextDouble();  //get the GPA
      //enter GPA
      
      System.out.println("\n enter major for student " + student_number + " \n");
      student_major = input.next();  //get the major
      //enter Major
      
      //setup student object with these parameters
      Student kid1 = new Student();
      kid1.setGpa(student_gpa);
      kid1.setMajor(student_major); 
      
      kids[i] = kid1;//assign the object to a certain position in the array
      
   }
    
    System.out.println("\n All information collected, Printing...\n");
    promptEnterKey();
    
    //Print all information
    for (int i = 0; i < kids.length; i++){
      student_number = i + 1;
      
      System.out.println("Student " + student_number + " : " + kids[i].toString() + ".\n");
     }

  }
    public static void promptEnterKey(){
   System.out.println("continue...");
   Scanner scanner = new Scanner(System.in);
   scanner.nextLine();
    }
}

