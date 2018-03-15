/*
lab 9
Xiangbang Sun

replace array in lab8 with arraylist

Advantages of Arraylist over array: 
  Arraylist is resizeable, provides more flexibility.
  Arraylist also has an default method for searching elements within the Arraylist.

*/
import java.util.Scanner;
import java.util.*;

public class lab9{
  //main method
  public static void main(String[] args){
    
    double[] student_gpa = {2.3, 3.5, 3.8, 4.0, 3.0};
    String[] student_major = {"Electrical Engineering", "Psychology", "Math", "Kinesiology", "Art"};
    String majorsearch = "";
    
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    
    
    ArrayList<Student> kids = new ArrayList<Student>();//instantiating an object arraylist
    

    for (int i = 0; i < student_gpa.length; i++){
      //setup student object with these parameters
      Student kid1 = new Student();
      kid1.setGpa(student_gpa[i]);
      kid1.setMajor(student_major[i]); 
      kids.add(kid1);//add student object the arraylist
      
   }
    
    System.out.println("\n All information ready, Printing...\n");
    promptEnterKey();
    
    printStudents(kids);//print function
    
    //System.out.println(kids[0].getMajor());
    
    System.out.println("\n Search by major\n");
    
    Student search = new Student();
    majorsearch = input.next();  //get the major
    search = findMajor(kids, majorsearch);
    
    System.out.println(search.toString());

  }
  
  
  public static void printStudents(ArrayList<Student> students){
    //Print all information
    
    for (int i = 0; i < students.size(); i++){
      int student_number = i + 1;
      System.out.println("Student " + student_number + " : " + students.get(i).toString() + ".\n");
     }
  }
  
  public static Student findMajor(ArrayList<Student> students, String major){
    
    //search through the array
    for (int i = 0; i < students.size(); i++){
      if (major.equals(students.get(i).getMajor())){
        return students.get(i);
      }
      
    }
        Student noresult = new Student();//create an empty instance of student if the search failed
        noresult.setMajor("No result");//return zero GPA and no result
        return noresult;
  }
  
  public static void promptEnterKey(){
   System.out.println("continue...");
   Scanner scanner = new Scanner(System.in);
   scanner.nextLine();
    }
}

