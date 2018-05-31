public class enemy{
  //base attr for enemy
  //
  //modifiers affects resistance to different attacks
  private int base_hp = 100;
  private int base_def = 0;
  private int base_atk = 0;
  private int weaponweak = 0;
  private int elementweak = 0;
  private String name = "";
  
  //final base attrs
  private int hp;
  private int def;
  private int atk;
  
  public enemy(int hp, int def, int atk, int weaponweak, int elementweak, String name){
    this.hp = hp + base_hp;
    this.def = def + base_def;
    this.atk = atk + base_atk;   
    this.weaponweak = weaponweak;
    this.elementweak = elementweak;
    this.name = name;
  }
  public int hp_get(){
    return hp;
  }  
  public int def_get(){
    return def;
  }  
  public int atk_get(){
    return atk;
  }  
  public int wweak_get(){
    return weaponweak;
  }
  public int eweak_get(){
    return elementweak;
  }
  public String name_get(){
    return name;
  }
    
  public void attr_modify(int hp_mod, int def_mod, int atk_mod){
    hp = hp + hp_mod;
    def = def + def_mod;
    atk = atk + atk_mod;
  }
}