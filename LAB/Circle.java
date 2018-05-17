public class Circle extends shape21{
  private int radius;
  private double circlearea;
    //constructors
  public Circle(int area, int radius){
    super(area);  
    this.radius = radius;
  }
  
  //getters and setters
  public int getRadius(){
    return this.radius;
  }
  
  public void setRadius(int radius){
    this.radius = radius;
  }
  
  //object info
  public String toString(){
    return " Circle radius is " + this.radius;
  }
  
  
  public double computeArea(){
    circlearea = 3.14*radius;
    return circlearea;
  }
  
}
