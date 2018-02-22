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
    int randomWeapon = 0;
    
    int playerchoice = 0;
    String playername = "";
    String weaponName = "";
    int nextphase = 0;//check if section 1 is complete
    int nameget = 0; //check if the player has answered a question in section 1
    int whereabout = 0;
    //splash art
    
    //story begins
    //wake up in a doungeon
    System.out.println("You wake up on a hard and cold surface. Opening your eyes, you can see nothing but absolute darkness. \n");
    System.out.println("You try to get up, but your head suddenly hurts so much that you almost pass out. \n");
    System.out.println("Lying on the ground, you decide to do some thinking to figure out the current situation. \n");
    System.out.println("Can't seem to think straight, you start to ask yourself some questions.  \n");
    
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
        System.out.println("\n \"WHO...AM...I...?\"  \n");
        System.out.println("You cannot recall anything about your past, but you do remember that your name is...  \n");
        System.out.println("(Enter name)  \n");
        playername = input.next();  //get the player's name
        System.out.println("\n\"" + playername + "...\"  \n");
        System.out.println("It seems that your name is \"" + playername + "\", at least that sounds familiar. \n");
        nameget = 1;
        promptEnterKey();
      }
      else if (playerchoice == 2){
        System.out.println("\n \"WHERE...THE HELL?\"  \n");
        System.out.println("With your eyes wide open, you look around, trying to find something in the darkness.  \n");
        System.out.println("Can't rely on your eyes, you carefully search your surrounding with your hands.  \n");
        System.out.println("You can feel that you are lying on a rough, stone floor. The stone floor is cold and wet.  \n");
        System.out.println("Raise your hands up, you try to find if there is a wall or ceiling. But suddenly you feel a flow of air!  \n");
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
    
    System.out.println("Your brain is clearer by now. Your name is \"" + playername + "\". \n");
    System.out.println("Judging by the temperature and humidity, this place might be an underground cave or something.  \n");
    System.out.println("If you can feel wind, there must be a way out! \n");
    
    promptEnterKey();
    
    System.out.println("Take a deep breath, you stand up. \n");
    System.out.println("The airflow is not very strong, but you can can feel that the wind comes from straight ahead. \n");
    System.out.println("With your hands in front of yourself, you slowly follow the wind. \n");
    System.out.println("As you walk, you can feel the wind is getting stronger. So you speed up your pace. Then suddenly... \n");
    System.out.println("\"DANG~!\" \n");
    
    promptEnterKey();
    
    System.out.println("\"Damn! What the...?\" \n");
    System.out.println("Your feet hit something hard and you fall to the ground. \n");
    System.out.println("Luckily you did not get hurt. It appears you are wearing some sort of shoes. You did not realize that when you woke up. \n ");
    
    randomWeapon = 1 + (int)(Math.random() * 3);
    
      weaponName = weaponloot(randomWeapon);
    System.out.println("Searching the ground, you find that what you just ran into is actually a " + weaponName +"\n");
    
    System.out.println("Do you want to pick it up? \n");
     //                 
    
    
    
    
   
   
    
    
    //while (monsterhp > 0 && playerhp > 0){ //BATTLE!
      
    //}
    
    
    
    
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
  public static String weaponloot(int Weaponindex){
    if (Weaponindex == 1)
      return "Metal club";
    else if (Weaponindex == 2)
      return "Silver knife";
    else if (Weaponindex == 3)
      return "Steel Sword";
    else 
      return "Rock";
  }
}
