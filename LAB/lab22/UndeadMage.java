public class UndeadMage extends Undead{
  private String SpellOne;
  private String SpellTwo;
    //constructors
  public UndeadMage(int health, int exp, String name, String SpellOne, String SpellTwo){
    super(health, exp, name);  
    this.SpellOne = SpellOne;
    this.SpellTwo = SpellTwo;
  }
  
  //getters and setters
  public String getSpellOne(){
    return this.SpellOne;
  }
  public String getSpellTwo(){
    return this.SpellTwo;
  }
  
  public void setOne(String SpellOne){
    this.SpellOne = SpellOne;
  }
  public void setTwo(String SpellTwo){
    this.SpellTwo = SpellTwo;
  }
  
  //object info
  public String toString(){
    return super.toString() + "Spell list: " + SpellOne + "&" + SpellTwo;
  }
  
  
  public void attack(){
    System.out.println("The " + name + " attacked with " + SpellOne + ", followed by " + SpellTwo + "!\n");
  }
  
}
