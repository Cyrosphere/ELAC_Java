public class player{
  //player class, hold the player status
  //players attributes
  //hp, def, atk
  //modifiers affects resistance to different attacks
  private int base_hp = 100;
  private int base_def = 0;
  private int base_atk = 10;
  
  //final base attrs
  private int hp;
  private int def;
  private int atk;
  private String weapon_name;
  private String element_name;
  private int weapon_type;
  private int element_type;
  private String playername;
  
  public player(int hp, int def, int atk, String name){
    this.hp = hp + base_hp;
    this.def = def + base_def;
    this.atk = atk + base_atk;    
    playername = name;
  }
  public String status(){
    return "Name:" + playername + ";\n" + "HP:" + hp + ";\n" + "DEF:" + def + ";\n" + "ATK:" + atk + ";\n" + "Weapon:" + weapon_name + ";\n" + "Element:" + element_name + ";\n";
  }  
  public int atk_get(){
    return atk;
  }  
  public int def_get(){
    return def;
  }
   public int hp_get(){
    return hp;
  }
  public int weapon_type(){
    return weapon_type;
  }
   public int element_type(){
    return element_type;
  }
  
  public void hp_set(int hpmod){
    hp = hp + hpmod;
  }
  public void atk_set(int atkmod){
    atk = atk + atkmod;
  }
    public void def_set(int defmod){
    def = def + defmod;
  }
  
  public void get_weapon(String name, int type){
    weapon_name = name;
    weapon_type = type;
  }
  public void get_element(String name, int type){
    element_name = name;
    element_type = type;
  }
}