/*
Lab 3 Xiangbang Sun
A senario about the player recive a random weapon from a demon.

*/


import java.util.Scanner;


public class TestRandom{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    //setting up random generator
    int minimum = 1;
    int maximum = 100;
    int randomNum = minimum + (int)(Math.random() * maximum);
    String playername = "";
    
  System.out.println("You decide to enter the 'blood chamber', which is on your left. \n");
    System.out.println("Press \"ENTER\" to continue...");
    input.nextLine();  
    
  System.out.println("A dim light on the wall illuminates the room. You look around and find nothing but an ugly stone statue in the corner. \n");
    System.out.println("Press \"ENTER\" to continue...");
    input.nextLine(); 
    
  System.out.println("Can't see the things clearly, you approach the statue. Suddenly it talks!  \n");
    System.out.println("Press \"ENTER\" to continue...");
    input.nextLine(); 
  
  System.out.println("'WHAT IS YOUR NAME?'\n");
  System.out.println("Shocked, you utter your name even before you realize.");
  System.out.println("(Enter your name)");
  playername = input.next();  //get the player's name
    
  System.out.println("TAKE THIS, " + playername + ", AND USE IT TO PAY YOUR PRICE. \n");

    
  System.out.println("You look down and find a weapon on the ground. You pick it up. \n");
    
  if(randomNum >= 70){
      System.out.println("You obtained <" + playername + "'s body>, a strange-shaped knife. \n");
    }
    else if(randomNum <= 70 && randomNum >= 30){
      System.out.println("You obtained <" + playername + "'s soul>, a blood-soaked shiv. \n");
    }
    else{
      System.out.println("You obtained <" + playername + "'s sin>, an rusted axe. \n");
    }
  }
}