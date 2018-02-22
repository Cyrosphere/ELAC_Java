//imports used in this class
import java.util.Scanner;

//Demo HW1 
public class GameDriver{

  //start of the application
  public static void main(String[] args){
    
    //variable declarations with default values
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    
    //setting up random generator
    int minimum = 1;
    int maximum = 100;
    int randomNum = minimum + (int)(Math.random() * maximum);
    
    int playerchoice = 0;
    String playername = "";
    int nextphase = 0;//check if section 1 is complete
    int nameget = 0; //check if the player has answered a question in section 1
    int whereabout = 0;
    //splash art
    
    //story begins
    //wake up in a doungeon
    System.out.println("You wake up on a hard and cold surface. Opening your eyes, you can see nothing but absolute darkness. \n");
    System.out.println("You try to get up, but your head suddenly hurts so much that you almost pass out. \n");
    System.out.println("Lying on the ground, you decide to do some thinking to figure out the current situation. \n");
    System.out.println("Can't seem to think straight, you start to ask yourself some questions.  \n \n");
    
    promptEnterKey();
    
    while (nextphase == 0){
    
      if (nameget == 0 ){
          System.out.println("1. Who am I?  \n");
      }
      if (whereabout == 0){
          System.out.println("2. Where am I?  \n");
      }
          System.out.println("(Enter a number) \n");
    
    playerchoice = input.nextInt(); //get the question number from the player
    
      if (playerchoice == 1){
        System.out.println("\n 'WHO...AM...I...?'  \n");
        System.out.println("You cannot recall anything about your past, but you do remember that your name is...  \n");
        playername = input.next();  //get the player's name
        System.out.println("\n'" + playername + "...'  \n");
        System.out.println("It seems that your name is " + playername + ", at least that sounds familiar. \n");
        nameget = 1;
        promptEnterKey();
      }
      else if (playerchoice == 2){
        System.out.println("\n 'WHERE...THE HELL?'  \n");
        System.out.println("With your eyes wide open, you look around, trying to find something in the darkness.  \n");
        System.out.println("Can't rely on your eyes, you   \n");
        whereabout = 1;
        promptEnterKey();
      }
      else {
        System.out.println("\n Your brain is in complete chaos. After a moment of dizziness, you fall back to unconsciousness.\n");
        return;
      }
     if (nameget == 1 && whereabout == 1){
       nextphase = 1;
     }
    }
    
    //ask player's name
    
   
    
    
    while (monsterhp > 0 && playerhp > 0){ //BATTLE!
      
    }
    
    
    
    
    //find an exit. left
   // while (nextphase == 0){
      
  //  }
    
    //choose a path
    
    
    //path 1 - swords
    //path 2 - armor
    //path 3 - boss
    
    
    //face the boss
    //decide your destiny
    //
    
  }
  public static void promptEnterKey(){
   System.out.println("Press \"ENTER\" to continue...");
   Scanner scanner = new Scanner(System.in);
   scanner.nextLine();
}
}
