public class Shape{
  /*
  lab 20 shape custom class
  */
  private int area = 0;
  private String area_string;
  
  public Shape(int area){//constructor
    this.area = area;
  }
  public void set_area(int area){//mutator
    this.area = area;
  }
  public int get_area(){//accessor
    return area;
  }
  public String area_toString(){//to String
    area_string = Integer.toString(area);
    return area_string;
  }
}