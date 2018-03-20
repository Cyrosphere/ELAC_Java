import java.util.*;

public class lab10{
  //main method
  public static void main(String[] args){
    int intaverage = 0;
    double doubleaverage = 0.0;
    double sum2 = 0.0;
    double sumall = 0.0;
    double min = 0.0;
    int randindex = 0;
    
    Scanner input = new Scanner(System.in);
    ArrayList<Double> average_array = new ArrayList<Double>();
    
    //parse input args
    for (int i = 0; i<10; i++){
      double buffer = Double.parseDouble(args[i]);
      average_array.add(i, buffer);
    }
    
    //change the arraylist datatype
    ArrayList<Integer> int_array = new ArrayList<Integer>();
      for(int j = 0; j<10; j++){
        
        double bufferdouble = average_array.get(j);
        int bufferint = (int) bufferdouble;
        int_array.add(j, bufferint);
      }
    
    //calculate the sum of the arraylist
      for(int j = 0; j<10; j++){
         sumall = sumall + average_array.get(j);
      }
    
    //find the minimum using collectins
    min = Collections.min(average_array);
    
    //integer average, double average, sum of first two elements, sum of all elements and random element
    intaverage = integeraverage(int_array);
    doubleaverage = average(average_array);
    sum2 = average_array.get(0) + average_array.get(1); 
    randindex = 0 + (int)(Math.random() * 9);
    
    System.out.println("\n Sum of the first two elements is : " + sum2);
    System.out.println("\n Sum of the all elements is : " + sumall);
    System.out.println("\n Minimum of the all elements is : " + min);
    System.out.println("\n Random Index : " + randindex + " Corresponding element : " + average_array.get(randindex));
    System.out.println("\n Int average value of the array elements is : " + intaverage);
    System.out.println("\n Double average value of the array elements is : " + doubleaverage);
  }
  
  public static int integeraverage(ArrayList<Integer> array){
    int sum = 0;
       for(int i=0; i < array.size() ; i++)
        
        sum = sum + array.get(i);
       //calculate average value
        int average = sum / array.size();
        
    return average;
  }
  
  public static double average(ArrayList<Double> array){
        double sum = 0;
       for(int i=0; i < array.size(); i++)
         
        sum = sum + array.get(i);
       //calculate average value
        double average = sum / array.size();
        
    return average;
  }
}