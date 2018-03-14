/*
lab 6
Xiangbang Sun

Create an array of objects
instantiating an array, calling methods to setup paramaters
iterate through the list, instantiating an object for each element.
collect paramaters and print

*/
import java.util.Scanner;

public class lab8{
  //main method
  public static void main(String[] args){
    int class_size = 5;
    double[] student_gpa = {2.3, 3.5, 3.8, 4.0, 3.0};
    String[] student_major = {"Electrical Engineering", "Psychology", "Math", "Kinesiology", "Art"};
    String majorsearch = "";
    
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    
    Student[] kids = new Student[class_size];//instantiating an object array
    

    for (int i = 0; i < kids.length; i++){
      
      //setup student object with these parameters
      Student kid1 = new Student();
      kid1.setGpa(student_gpa[i]);
      kid1.setMajor(student_major[i]); 
      
      kids[i] = kid1;//assign the object to a certain position in the array
      
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
  
  
  public static void printStudents(Student[] students){
    //Print all information
    for (int i = 0; i < students.length; i++){
      int student_number = i + 1;
      System.out.println("Student " + student_number + " : " + students[i].toString() + ".\n");
     }
  }
  
  public static Student findMajor(Student[] students, String major){
    
    //search through the array
    for (int i = 0; i < students.length; i++){
      if (major.equals(students[i].getMajor())){
        return students[i];
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

