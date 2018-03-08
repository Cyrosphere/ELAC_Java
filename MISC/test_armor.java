public class test_armor{
  //main method
  public static void main(String[] args){
  int health;
  int agi;
  int atk;
    
  armored_unit armor1 = new armored_unit(2, 3, 5);
  
  health = armor1.hp_get();
  agi = armor1.agi_get();
  atk = armor1.atk_get();
  
  System.out.println("\n The health is " + health + "\n");
    System.out.println("\n The agi is " + agi + "\n");
    System.out.println("\n The atk is " + atk + "\n");
  
  armor1.attr_modify(2, 3, 4);
    
  health = armor1.hp_get();
  agi = armor1.agi_get();
  atk = armor1.atk_get();
  
    System.out.println("\n The health is " + health + "\n");
    System.out.println("\n The agi is " + agi + "\n");
    System.out.println("\n The atk is " + atk + "\n");
  }
}