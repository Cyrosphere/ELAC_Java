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