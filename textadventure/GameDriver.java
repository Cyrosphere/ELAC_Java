//imports used in this class
import java.util.*;

//Demo HW1 
public class GameDriver{

  //start of the application
  public static void main(String[] args){
    
    //variable declarations with default values
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    int current_layer = 8;
    int end = 0;
    int fragment = 0;
    int damage = 0;
    int weak = 0;
    int monsterhp;
    int monsteratk;
    int playerhp = 0;
    int id = 0;
    int playerchoice = 0;
    String playername = ""; //player's name
    
    int nextphase = 0;//check if section is complete
    int nameget = 0; //check if the player has answered a question in section 1
    int whereabout = 0;
    int weaponget = 0;
    int powerget = 0;
    
    //initialize monsters
    enemy vampire = new enemy(70, 40, 40, 1 ,2, "Vampire");
    enemy ghost = new enemy(30, 40, 20, 1 ,1, "Ghost");
    enemy zombie = new enemy(40, 70, 20, 3 ,2, "Zombie");
    enemy demon = new enemy(80, 60, 20, 2 ,1, "Demon");
    enemy werewolf = new enemy(50, 70, 40, 1 ,2, "Werewolf");
    enemy golem = new enemy(100, 80, 20, 3 ,3, "Golem");
    enemy dragon = new enemy(90, 80, 40, 2 ,3, "Dragon");
    enemy minion = new enemy(10, 10, 10, 1 ,1, "minion");
    
    String[] layername = new String[9];
    layername[1] = "blood";
    layername[2] = "soul";
    layername[3] = "flesh";
    layername[4] = "sin";
    layername[5] = "curse";
    layername[6] = "might";
    layername[7] = "flame";
    layername[8] = "surface";
    //place the enemys in different layers
    ArrayList<enemy> layerenemy = new ArrayList<enemy>();
    layerenemy.add(0, minion);
    layerenemy.add(1, vampire);
    layerenemy.add(2, ghost);
    layerenemy.add(3, zombie);
    layerenemy.add(4, demon);
    layerenemy.add(5, werewolf);
    layerenemy.add(6, golem);
    layerenemy.add(7, dragon);
    
    //the map array
    //
    int[][] roommap = new int[3][2];
    
    //splash art
    Utility.ReadFile("StartSplash.txt");


    //story begins
    //wake up in a doungeon
    
    Utility.ReadFile("Prologue.txt");
    //
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
        System.out.println("\n Your brain is in complete chaos. After taking a deep breath, you try to ask some questions again. \n");
        //Gameover();
        //return;
      }
     if (nameget == 1 && whereabout == 1){
       nextphase = 1;
     }
    }
    
    Utility.WriteFile("Name.txt", playername);
    player player1 = new player(0,0,0,playername);
    
    nextphase = 0;// reset the section check variable
    System.out.println("Your brain is clearer by now. Your name is \"" + playername + "\". \n");
    /* Section 1 end */
    promptEnterKey();
    /* Interlude 1*/
    Utility.ReadFile("interlude1.txt");
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
    Utility.ReadFile("interlude2.txt");
    promptEnterKey();
    
    //Interlude 2 end
    
    //Section 3, the corridor

    while (weaponget == 0 || powerget == 0){
      System.out.println("You decide to ... \n ");
      System.out.println("1. Check left room \n ");
      System.out.println("2. Check right room \n ");
      System.out.println("3. Go forward\n ");
      System.out.println("(Enter a number) \n");
      
      playerchoice = input.nextInt(); //get the answer from the player
      
      if (playerchoice == 1){
        
        System.out.println("Checking the left room, you find that there are three weapons, a hammer, a silver spear and a steel sword.\n");
        System.out.println("You have obtained weapons! \n");
        weaponget = 1;
    
      }
      
      
      
      else if (playerchoice == 2){
        
        System.out.println("Checking the right room, you find that there are three magic stones, a holy stone, a fire stone and a thunder stone.\n");
        System.out.println("You have obtained elemetal powers! \n");
        powerget = 1;
      }
      
      else {
        System.out.println("You feel that you need to find something to defend yourself, so you go back to check the rooms. \n");
          
      }
      
    }
      System.out.println("No point staying here, you decide to go foward! \n");
      promptEnterKey();      
    
    
    System.out.println("You reach the end of the corridor. There stands an iron gate. \n");
    System.out.println("Through the gate, you enter a hall with many torches on the wall. \n");
    System.out.println("A monster is sleeping in the middle of the hall, your footsteps wake it up! The monster roars and leaps at you! \n");
    
    int randomhp = 0 + (int)(Math.random() * 30);
    int randomdef = -10 + (int)(Math.random() * 5);
    int randomatk = 0 + (int)(Math.random() * 10);      
    minion.attr_modify(randomhp, randomdef, randomatk);
    monsterhp = minion.hp_get();
    playerhp = player1.hp_get();
    player1.atk_set(30);
    player1.get_weapon("silver spear", 1);
    player1.get_element("holy", 1);
    promptEnterKey();
    
    
    while (monsterhp > 0 && playerhp > 0){ //BATTLE!
      System.out.println("You attack the monster. \n");
      damage = 10 + (int)(Math.random() * player1.atk_get()) - minion.def_get(); 
      System.out.println("You dealt " + damage +" points of damage.\n");
      monsterhp = monsterhp - damage;
      damage = 10 + (int)(Math.random() * minion.atk_get()) - player1.def_get();
      System.out.println("The monster attacks you and dealt " + damage + "points of damage. \n");
      playerhp = player1.hp_get() - damage;
      promptEnterKey();
    }
    
    if (playerhp < 0){
      System.out.println("You are dead. \n");
      promptEnterKey();
      Gameover();
      end = 1;
    }
    else {
      System.out.println("You defeated the monster! \n");
      promptEnterKey();
      System.out.println("You acquired the <mysterious stone>! \n");
      Utility.ReadFile("help.txt");
    }
    
  while (end == 0){
    Utility.ReadFile("menu.txt");
    playerchoice = input.nextInt(); //get the answer from the player
    if (playerchoice == 1){
      Utility.ReadFile("layermenu.txt");
      playerchoice = input.nextInt();
      if (playerchoice > 0 && playerchoice <=8){
        current_layer = playerchoice;
        System.out.println("You teleport to " + layername[current_layer] + "! \n");
      }
      else {
        System.out.println("Teleport error \n");
      }
    }
    else if (playerchoice == 2){
      if (current_layer == 8){
        System.out.println("There is no other room in suface layer \n");
      }
      else{
        System.out.println("Which room do you want to go? \n");
        System.out.println("1. boss room \n");
        System.out.println("2. other rooms  \n");
        playerchoice = input.nextInt();
        if (playerchoice == 1){
           id = current_layer;
        }
        else {
          id = 0;
        }
           monsterhp =  layerenemy.get(id).hp_get();
           playerhp = player1.hp_get();
          if (layerenemy.get(id).wweak_get() == player1.weapon_type()){
           weak = weak + 50;
          }
          if (layerenemy.get(id).eweak_get() == player1.element_type()){
            weak = weak + 50;
          }
          while (monsterhp > 0 && playerhp > 0){ 
          System.out.println("You attack the " + layerenemy.get(id).name_get() + "! \n");
           damage = 10 + (int)(Math.random() * player1.atk_get()) - layerenemy.get(id).def_get() + weak; 
          System.out.println("You dealt " + damage +" points of damage.\n");
          monsterhp = monsterhp - damage;
          damage = 10 + (int)(Math.random() * layerenemy.get(id).atk_get()) - player1.def_get();
          System.out.println("The " + layerenemy.get(id).name_get() + " attacks you and dealt " + damage + " points of damage. \n");
          playerhp = player1.hp_get() - damage;
          promptEnterKey();
          }

        if (playerhp <= 0){
          System.out.println("You are dead. \n");
          promptEnterKey();
          Gameover();
        }
        else {
          System.out.println("You defeated the " + layerenemy.get(id).name_get() + "! \n");
          promptEnterKey();
          if (id == 0){
            System.out.println("You boosted your hp! \n");
            player1.hp_set(10);
          }
          else{
          System.out.println("You acquired a fragment! \n");
          fragment = fragment + 1;
          }
        }        
       
      }
    }
    else if (playerchoice == 3){
       System.out.println(player1.status());
       System.out.println("You have " + fragment + " fragments. \n");
    }
    else if (playerchoice == 4){
      Utility.ReadFile("map.txt");
    }
    else if (playerchoice == 5){
      System.out.println("Equip a weapon \n");
      System.out.println("1. silver spear \n");
      System.out.println("2. steel sword  \n");
      System.out.println("3. hammer \n");
      playerchoice = input.nextInt();
        if(playerchoice == 1){
          player1.get_weapon("silver spear", 1);
        }
        else if(playerchoice == 2){
          player1.get_weapon("steel sword", 2);
        }
        else {
          player1.get_weapon("hammer", 3);
        }      
    }
    else if (playerchoice == 6){
      System.out.println("Choose an element \n");
      System.out.println("1. holy \n");
      System.out.println("2. fire  \n");
      System.out.println("3. thunder \n");
      playerchoice = input.nextInt();
        if(playerchoice == 1){
          player1.get_element("holy", 1);
        }
        else if(playerchoice == 2){
          player1.get_element("fire", 2);
        }
        else {
          player1.get_element("thunder", 3);
        }        
    }    
    else if (playerchoice == 7){
      if (fragment >= 7){
        System.out.println("You combined all the fragments and put it near the stone. \n");
        System.out.println("The stone flashes and send you back home \n");
        GJ();
        end = 1;
      }
      else {
        System.out.println("You don't have enough fragment \n");
      }
    }      
    else if (playerchoice == 8){
      fragment = 7;
    }     
  }  
    
    
  }
  public static void promptEnterKey(){
   System.out.println("continue...");
   Scanner scanner = new Scanner(System.in);
   scanner.nextLine();
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
