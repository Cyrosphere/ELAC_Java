import java.util.*;

public class lab22{
  //main method
  //randomly generate 5 Undead, put in array and call each attack;
  public static void main(String[] args){
    int random = 0;
    Undead[] undeadarmy = new Undead[5];
    
    for (int i = 0; i < 5; i++){
      random = 1 + (int)(Math.random() * 2);
      if (random == 1){
        UndeadMage mage1 = new UndeadMage(100, 100, "Mage", "Fireball", "Frostbolt");
        undeadarmy[i] = mage1;
      }
      else{
        UndeadWarrior warrior1 = new UndeadWarrior(100, 100, "Warrior", "axe", "sword");
        undeadarmy[i] = warrior1;
      }
    }
    for (int i = 0; i < 5; i++){
      undeadarmy[i].attack();
    }
    

  }
}