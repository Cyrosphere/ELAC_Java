/*

Demo the string class
lab 5
Xiangbang Sun

*/
import java.util.Scanner;
public class TestStrings{

//main method
  public static void main(String[] args){
    
    //initiate the Scanner object
    Scanner input = new Scanner(System.in);
    
    Boolean special = false;
    
   // System.out.println("Are you crazy? Yes or No?");
    System.out.println("What is your name?");
    
    //get answer from the console
    String answer = input.next();
    
    //check if there is special characters
      for (int index = 0; index < answer.length(); index++){
      
      // check if the character is a letter
      if(!Character.isLetter(answer.charAt(index))){
        special = true;
        break;
      }
        else 
          special = false;
      }
    
    
    /*
    impose some rules on user input
    name.length() gives an int of string length
    */
    
    //if there is special or length < 2
    while (answer.length() < 2 || special){

      
      //special = false;
      System.out.println("Please enter a name that is at least 2 letters long and no numbers.");
      System.out.println("What is your name?");      
      answer = input.next();    
      
      //check if there are special characters
      for (int index = 0; index < answer.length(); index++){
      
      // check if the character is a letter
      if(!Character.isLetter(answer.charAt(index))){
        special = true;
        break;
      }
        else 
          special = false;
      }
    }
  }
  
}