public class square extends shape21{
  private int length;
  private double squarearea;
    //constructors
  public square(int area, int length){
    super(area);  
    this.length = length;
  }
  
  //getters and setters
  public int getLength(){
    return this.length;
  }
  
  public void setLength(int length){
    this.length = length;
  }
  
  //object info
  public String toString(){
    return " Square length is " + this.length;
  }
  
  
  public double computeArea(){
    squarearea = length*length;
    return squarearea;
  }
  
}
