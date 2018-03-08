public class armored_unit{
  //base attr for armored_units 
  //hp, agi affects chance to dodge, atk
  //modifiers affects resistance to different attacks
  private int base_hp = 100;
  private int base_agi = -5;
  private int base_atk = 50;
  private double blunt_mod = 2.5;//take more damage from blunt weapons
  private double silver_mod = 0.5;//take half damage from silver 
  private double steel_mod = 1;//take normal damage from steel
  private double fire_mod = 0.5; 
  private double holy_mod = 1.5; 
  private double thunder_mod = 2;
  
  //final base attrs
  private int hp;
  private int agi;
  private int atk;
  
  public armored_unit(int hp, int agi, int atk){
    this.hp = hp + base_hp;
    this.agi = agi + base_agi;
    this.atk = atk + base_atk;    
  }
  public int hp_get(){
    return hp;
  }  
  public int agi_get(){
    return agi;
  }  
  public int atk_get(){
    return atk;
  }  
  public void attr_modify(int hp_mod, int agi_mod, int atk_mod){
    hp = hp + hp_mod;
    agi = agi + agi_mod;
    atk = atk + atk_mod;
  }
}