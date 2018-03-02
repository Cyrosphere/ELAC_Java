public class armored_unit{
  private hp = 100;
  private agi = -5;
  private atk = 50;
  
  public armored_unit(int hp, int agi, int atk){
    this.hp = hp;
    this.agi = agi;
    this.atk = atk;    
  }
  public void attr_modify(int hp_mod, int agi_mod, int atk_mod){
    hp = hp + hp_mod;
    agi = agi + agi_mod;
    atk = atk + atk_mod;
  }
}