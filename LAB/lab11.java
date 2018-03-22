import java.util.*;

/*
Lab 11

Xiangbang Sun
I impelemented the lab with arraylist, so the user does not need to enter an array size at the beginning
*/

public class lab11{
  //main method
  public static void main(String[] args){
    String user_input = "";
    
    Scanner input = new Scanner(System.in);//create the input object
    ArrayList<Integer> sort_array = new ArrayList<Integer>();//create the input arraylist
    
    System.out.println("\n Enter a list: \n");
    user_input = input.nextLine();
    
    //split the input
    String[] splited = user_input.split(" ");
    
    //parse input args
    for (int i = 0; i<splited.length; i++){
      int buffer = Integer.parseInt(splited[i]);
      sort_array.add(i, buffer);
    }
    
    //check point, check if the array input is correct
    //System.out.println(sort_array.toString());
    
    if (isSorted(sort_array) == true){
      System.out.println("The list is already sorted.\n");
    }
    else
      System.out.println("The list is not sorted.\n");
 
  }
  
  
  
  public static boolean isSorted(ArrayList<Integer> array){
    boolean flag = true;
    int range = array.size() - 1; 
    for (int i = 0; i<range; i++){
      if(array.get(i) != null && array.get(i) <= array.get(i+1)){
        
      }
      else
        flag = false;
    }
    //check point
    //System.out.println(range);
    return flag;
  }
}