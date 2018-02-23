//imports used in this class
import java.util.Scanner;

//Demo HW1 
public class GameDriver{

  //start of the application
  public static void main(String[] args){
    
    //variable declarations with default values
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    
    //setting up random variables
    int randomWeapon = 0;
   
    int weaponleft = 0;
    int weaponright = 0;
    int weaponground = 0;
    
    int damage = 0;
    
    int monsterhp = 50;
    int playerhp = 50;
    
    int playerchoice = 0;
    String playername = ""; //player's name
    String weaponName = ""; //random dropped weapon name
    String inventory = "";// current weapon
    //int inventory = 0; //player equipped weapon
    int nextphase = 0;//check if section is complete
    int nameget = 0; //check if the player has answered a question in section 1
    int whereabout = 0;
    //splash art
        System.out.println(" ______   _______  _______  _______  \n"
                         + "|      | |       ||       ||       | \n"
                         + "|  _    ||    ___||    ___||    _  | \n"
                         + "| | |   ||   |___ |   |___ |   |_| | \n"
                         + "| |_|   ||    ___||    ___||    ___| \n"
                         + "|       ||   |___ |   |___ |   |     \n"
                         + "|______| |_______||_______||___|     \n");

    //story begins
    //wake up in a doungeon
    System.out.println("You wake up on a hard and cold surface. Opening your eyes, you can see nothing but absolute darkness. \n");
    System.out.println("You try to get up, but your head suddenly hurts so much that you almost pass out. \n");
    System.out.println("Lying on the ground, you decide to do some thinking to figure out the current situation. \n");
    System.out.println("Can't seem to think straight, you start to ask yourself some questions.  \n");
    System.out.println("Press \"ENTER\" to ");
    promptEnterKey();
    
    //first section WAKE UP
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
        Gameover();
        return;
      }
     if (nameget == 1 && whereabout == 1){
       nextphase = 1;
     }
    }
    
    nextphase = 0;// reset the section check variable
    System.out.println("Your brain is clearer by now. Your name is \"" + playername + "\". \n");
    System.out.println("Judging by the temperature and humidity, this place might be an underground cave or something.  \n");
    System.out.println("If you can feel wind, there must be a way out! \n");
    /* Section 1 end */
    promptEnterKey();
    /* Interlude */
    System.out.println("Take a deep breath, you stand up. \n");
    System.out.println("The airflow is not very strong, but you can can feel that the wind comes from straight ahead. \n");
    System.out.println("With your hands in front of yourself, you slowly follow the wind. \n");
    System.out.println("As you walk, you can feel the wind is getting stronger. So you speed up your pace. Then suddenly... \n");
    System.out.println("\"DANG~!\" \n");
    
    promptEnterKey();
    
    System.out.println("\"Damn! What the...?\" \n");
    System.out.println("Your feet hit something hard and you fall to the ground. \n");
    System.out.println("You find that you actually stumbled into a stairway. The stairs are leading upwards.  \n ");
    
    //Second section, the stair.
    while (nextphase == 0){ 
    System.out.println("Do you want to climb the stairs?  \n ");
      System.out.println("1. Yes \n");
      System.out.println("2. No  \n");
    playerchoice = input.nextInt(); //get the answer from the player
      if (playerchoice == 1){
        System.out.println("You decide to go up, following the wind. \n");
        nextphase = 1;
      }
      else if (playerchoice == 2){
        System.out.println("You are afraid of the darkness ahead, so you choose to stay. But there is no other things you can do.  \n");
      }
      else {
        System.out.println("You are exhausted. You decide to rest for a while first. \n");
      }
    promptEnterKey();
    
    }
    
    
    nextphase = 0;// reset the section check variable
    // Interlude 2
    System.out.println("On your hands and feet, you slowly crawl up the stairs. \n");
    System.out.println("Your can feel the stairs are getting narrower and steeper. Just before you give up climbing, you eyes catch something. \n");
    System.out.println("It's light! Although dim and small, you can clearly see light up ahead!  \n ");
    
    promptEnterKey();
    
    System.out.println("It didn't take long before you reach the top of the stairway.  \n ");
    System.out.println("The stairs lead you to a stone corridor. Several lamps are hanging on the ceiling. That is the light source you just saw.  \n ");
    System.out.println("The lamps are dim and the corridor is long, you cannot see the where it leads to. \n ");
    
    System.out.println("Carefully advancing along the corridor, you find that there are something hanging on the wall as well. \n ");
    
    //Interlude 2 end
    
    //Section 3, the corridor
    randomWeapon = 1 + (int)(Math.random() * 6);//randomize weapon placement
      if (randomWeapon == 1){
        weaponleft = 1;
        weaponright = 2;
        weaponground = 3;
      }
      else if (randomWeapon == 2){
        weaponleft = 1;
        weaponright = 3;
        weaponground = 2;        
      }
      else if (randomWeapon == 3){
        weaponleft = 2;
        weaponright = 1;
        weaponground = 3;        
      }
      else if (randomWeapon == 4){
        weaponleft = 2;
        weaponright = 3;
        weaponground = 1;      }
      else if (randomWeapon == 5){
        weaponleft = 3;
        weaponright = 2;
        weaponground = 1;        
      }
      else  {
        weaponleft = 3;
        weaponright = 1;
        weaponground = 2;       
      }
    while (nextphase == 0){
      System.out.println("You decide to ... \n ");
      System.out.println("1. Check left wall \n ");
      System.out.println("2. Check right wall \n ");
      System.out.println("3. Check ground\n ");
      System.out.println("4. Go forward \n ");
      System.out.println("(Enter a number) \n");
      
      playerchoice = input.nextInt(); //get the answer from the player
      
      if (playerchoice == 1){
        weaponName = weaponloot(weaponleft);
        System.out.println("Checking the left wall, you find that there is a <" + weaponName +"> hanging on the wall.\n");
        System.out.println("Do you want to pick it up? \n");
        System.out.println("1. Yes \n");
        System.out.println("2. No  \n");
        System.out.println("(Enter a number) \n");
    
        playerchoice = input.nextInt(); //get the answer from the player
        if (playerchoice == 1){
           System.out.println("Fearing that you might run into danger ahead, you decide to pick it up. \n");
           //checkinventory(weaponName, inventory);
          System.out.println("You have obtained <" + weaponName +">! \n");
          inventory = weaponName;
          }
         else {
           System.out.println("It's just a crappy <" + weaponName +">, no point in picking it up. \n");
         }
      }
      
      
      
      else if (playerchoice == 2){
        weaponName = weaponloot(weaponright);
        System.out.println("Checking the right wall, you find that there is a <" + weaponName +"> hanging on the wall.\n");
        System.out.println("Do you want to pick it up? \n");
        System.out.println("1. Yes \n");
        System.out.println("2. No  \n");
        System.out.println("(Enter a number) \n");
    
        playerchoice = input.nextInt(); //get the answer from the player
        if (playerchoice == 1){
           System.out.println("Fearing that you might run into danger ahead, you decide to pick it up. \n");
           //checkinventory(weaponName, inventory);
          System.out.println("You have obtained <" + weaponName +">! \n");
          inventory = weaponName;
          }
         else {
           System.out.println("It's just a crappy <" + weaponName +">, no point in picking it up. \n");
         }
      }
      
      else if(playerchoice == 3){
        weaponName = weaponloot(weaponground);
        System.out.println("Checking the ground, you find a <" + weaponName +">.\n");
        System.out.println("Do you want to pick it up? \n");
        System.out.println("1. Yes \n");
        System.out.println("2. No  \n");
        System.out.println("(Enter a number) \n");
    
        playerchoice = input.nextInt(); //get the answer from the player
        if (playerchoice == 1){
           System.out.println("Fearing that you might run into danger ahead, you decide to pick it up. \n");
           //checkinventory(weaponName, inventory);
          System.out.println("You have obtained <" + weaponName +">! \n");
          inventory = weaponName;
          }
         else {
           System.out.println("It's just a crappy <" + weaponName +">, no point in picking it up. \n");
         }
      }
      
      else {
          System.out.println("No point staying here, you decide to go foward! \n");
          nextphase = 1;
      }
      
    }
    
    
    System.out.println("You reach the end of the corridor. There stands an iron gate. \n");
    System.out.println("Through the gate, you enter a hall with many torches on the wall. \n");
    System.out.println("A monster is sleeping in the middle of the hall, your footsteps wake it up! The monster roars and leaps at you! \n");
    
    promptEnterKey();
    
    
    while (monsterhp > 0 && playerhp > 0){ //BATTLE!
      System.out.println("You attack the monster with your " + inventory + ". \n");
      damage = 15 + (int)(Math.random() * 20);
      System.out.println("You dealt " + damage +" points of damage.\n");
      monsterhp = monsterhp - damage;
      damage = 5 + (int)(Math.random() * 20);
      System.out.println("The monster attacks you and dealt " + damage + "points of damage. \n");
      playerhp = playerhp - damage;
      promptEnterKey();
    }
    
    if (playerhp <= 0){
      System.out.println("You are dead. \n");
      promptEnterKey();
      Gameover();
    }
    else {
      System.out.println("You defeated the monster! \n");
      promptEnterKey();
      GJ();
    }
    
    
  }
  public static void promptEnterKey(){
   System.out.println("continue...");
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
      return "Rubbish";
  }
  
  public static void Gameover(){
        System.out.println(" _______  _______  __   __  _______    _______  __   __  _______  ______    __  \n"
                         + "|       ||   _   ||  |_|  ||       |  |       ||  | |  ||       ||    _ |  |  | \n"
                         + "|    ___||  |_|  ||       ||    ___|  |   _   ||  |_|  ||    ___||   | ||  |  | \n"
                         + "|   | __ |       ||       ||   |___   |  | |  ||       ||   |___ |   |_||_ |  | \n"
                         + "|   ||  ||       ||       ||    ___|  |  |_|  ||       ||    ___||    __  ||__| \n"
                         + "|   |_| ||   _   || ||_|| ||   |___   |       | |     | |   |___ |   |  | | __  \n"
                         + "|_______||__| |__||_|   |_||_______|  |_______|  |___|  |_______||___|  |_||__| \n");
  }
  
  public static void GJ(){
        System.out.println( " _______  _______  _______  ______         ___  _______  _______  \n"
                          + "|       ||       ||       ||      |       |   ||       ||  _    | \n"
                          + "|    ___||   _   ||   _   ||  _    |      |   ||   _   || |_|   | \n"
                          + "|   | __ |  | |  ||  | |  || | |   |      |   ||  | |  ||       | \n"
                          + "|   ||  ||  |_|  ||  |_|  || |_|   |   ___|   ||  |_|  ||  _   |  \n"
                          + "|   |_| ||       ||       ||       |  |       ||       || |_|   | \n"
                          + "|_______||_______||_______||______|   |_______||_______||_______| \n");
        
  }
  //Need more work
  /*
  public static void checkinventory(String weaponName, int inventory){
    if (inventory == 1){
      System.out.println("You have a <Metal Club> in your hands, do you want to drop it and pick up <" + weaponName +">? \n");
    }
    else if (inventory == 2){
      System.out.println("You have a <Silver Knife> in your hands, do you want to drop it and pick up <" + weaponName +">? \n");
    }
    else if (inventory == 3){
      System.out.println("You have a <Steel Sword> in your hands, do you want to drop it and pick up <" + weaponName +">? \n");
    }
    else {
      System.out.println("You have obtained <" + weaponName +">! \n");
    }
  }*/
  
}
