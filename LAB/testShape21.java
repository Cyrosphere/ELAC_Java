import java.util.*;

public class testShape21{
  //main method
  public static void main(String[] args){
    Circle circle1 = new Circle(0,0);
    square square1 = new square(0,0);
    circle1.setRadius(5);
    System.out.println(circle1.toString());
    System.out.println("The area of the circle is :" + circle1.computeArea());
    
    square1.setLength(circle1.getRadius());
    System.out.println(square1.toString());
    System.out.println("The area of the square is :" + square1.computeArea());
  }
}