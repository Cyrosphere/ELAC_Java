public class UndeadWarrior extends Undead{
  private String rightHandWeapon;
  private String leftHandWeapon;
    //constructors
  public UndeadWarrior(int health, int exp, String name, String rightHandWeapon, String leftHandWeapon){
    super(health, exp, name);  
    this.rightHandWeapon = rightHandWeapon;
    this.leftHandWeapon = leftHandWeapon;
  }
  
  //getters and setters
  public String getrightHandWeapon(){
    return this.rightHandWeapon;
  }
  public String getleftHandWeapon(){
    return this.leftHandWeapon;
  }
  
  public void setright(String rightHandWeapon){
    this.rightHandWeapon = rightHandWeapon;
  }
  public void setleft(String leftHandWeapon){
    this.leftHandWeapon = leftHandWeapon;
  }
  
  //object info
  public String toString(){
    return super.toString() + "Weapon list: " + rightHandWeapon + "&" + leftHandWeapon;
  }
  
  
  public void attack(){
    System.out.println("The " + name + " attacked with " + rightHandWeapon + ", followed by " + leftHandWeapon + "!\n");
  }
  
}
