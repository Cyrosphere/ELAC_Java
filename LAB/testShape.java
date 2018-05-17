import java.util.*;

public class testShape{
  //main method
  public static void main(String[] args){
    Shape shape1 = new Shape(20);
    System.out.println(shape1.area_toString());
    shape1.set_area(10);
    System.out.println(shape1.area_toString());
    
  }
}