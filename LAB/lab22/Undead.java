public abstract class Undead{
  /*
  lab 22 Undead abstract class
  */
  private int health = 0;
  public String name = "";
  private int exp = 0;
  
  public Undead(int health, int exp, String name){//constructor
    this.health = health;
    this.exp = exp;
    this.name = name;
  }
  
  public void set_health(int health){//health mutator
    this.health = health;
  }
  public void set_exp(int exp){//exp mutator
    this.exp = exp;
  }
  public void set_name(String name){//name mutator
    this.name = name;
  }
  
  public int get_health(){//health accessor
    return health;
  }
  public int get_exp(){//exp accessor
    return exp;
  }
  public String get_name(){//name accessor
    return name;
  }
  
  public String toString(){//to String
    return "Enemy name: " + name + "health: " + health + "exp: " + exp;
  }
  public abstract void attack();
}