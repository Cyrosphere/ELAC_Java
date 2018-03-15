public class weapon{
  //base attr for armored_units 
  //hp, agi affects chance to dodge, atk
  //modifiers affects resistance to different attacks
  private int blunt_damage = 0;
  private int silver_damage = 0;
  private int steel_damage = 0;

  private int fire_damage = 0; 
  private int holy_damage = 0; 
  private int thunder_damage = 0;
  
  private String name = "";
  

  
  public weapon(String name){
    this.name = name;
  }
  public void bluntdmg(int bluntdmg){
    blunt_damage = blunt_damage + bluntdmg;
  }
  public void steeldmg(int steeldmg){
    steel_damage = steel_damage + steeldmg;
  }
  public void silverdmg(int silverdmg){
    silver_damage = silver_damage + silverdmg;
  }
  public void firedmg(int firedmg){
    fire_damage = fire_damage + firedmg;
  }
  public void holydmg(int holydmg){
    holy_damage = holy_damage + holydmg;
  }
  public void thunderdmg(int thunderdmg){
    thunder_damage = thunder_damage + thunderdmg;
  }


}