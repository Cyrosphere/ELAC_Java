/*
LAB 6
Test create, edit, overwrite an array
and print
*/


import java.util.Scanner;
public class TestArray{
  //main method
  public static void main(String[] args){
    int class_size = 10; //set the number of students
    int quit = 0;//check if the user want to quit the program
    int student_number = 0;
    int choice = 0; 
    String newname = ""; 
    String namedisplay = "";
    
    String[] roster = new String[class_size];
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    
    for (int i = 0; i < roster.length; i++){
      roster[i] = String.valueOf(i);;
    }
    
    while(quit == 0){
      System.out.println("class roster\n");
      System.out.println("Enter a student number(between 1 and "+ class_size +").\n");
      student_number = input.nextInt();  //get the number
      
      namedisplay = roster[student_number];
      
      System.out.println("\n The name at " + student_number + " is " + namedisplay + ".\n"); 
      
      System.out.println("1.Edit.\n");
      System.out.println("2.Return.\n");
      System.out.println("3.Quit.\n");
      System.out.println("4.Print.\n");
      choice = input.nextInt();  //get the choice
      
      if (choice == 1){
        System.out.println("\n Enter a new name.\n");
        newname = input.next();//get a new name for 
        roster[student_number] = newname;
        System.out.println("\n The name at " + student_number + " has been changed to " + newname + ".\n");        
      }
      else if (choice == 2){
        System.out.println("\n Return to main menu.\n");
      }
      else if (choice == 3){
        System.out.println("\n Quit system\n");
        quit = 1;
      }
      else if (choice == 4){
        for (int i = 0; i < roster.length; i++){
          System.out.println("\n" + roster[i]);
        }
      }
        
      else
        quit = 1;
    }
    
    
    
    
    
  }
}


  