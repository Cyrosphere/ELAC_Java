import java.util.*;

/*
Midterm

Xiangbang Sun
1)Sort an array of integers, take the user input from the terminal
2)randomly generate an arraylist of students, then print them as sorted by GPA
*/

public class midterm{
  //main method
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);//set up the scanner for user input
    int[] array_int = new int[args.length]; //the initial array
    int[] result_array = new int[args.length];//The result after the sorting
    
    String[] student_major = {"Electrical Engineering", "Psychology", "Math", "Kinesiology", "Art", "Business"};// a list of student majors
        
    ArrayList<Student> kids = new ArrayList<Student>();//instantiating an object arraylist
    
    //parse input args, put them in the array_int
    for (int i = 0; i<args.length; i++){
      array_int[i] = Integer.parseInt(args[i]);
    }
    
    result_array = sortArray(array_int);
  
    for (int i = 0; i<args.length; i++){//print out the sorted array
      System.out.println(result_array[i] + "\n");
    }
  
    promptEnterKey();//continue to randomGPA part
    
    //fill the arraylist with randomGPA numbers
    for (int i = 0; i < student_major.length; i++){
      //setup student object with these parameters
      Student kid1 = new Student();
      double randomscore = 0 + (double)(Math.random() * 4);
      
      kid1.setGpa(randomscore);
      kid1.setMajor(student_major[i]); 
      kids.add(kid1);//add student object the arraylist
      
   }
    System.out.println("Unsorted:");
    printStudents(kids); // print the unsorted list
    
    promptEnterKey();  
    
    System.out.println("Sorted:");
    sortGPA(kids);// print the sorted list
    
  }
  
  public static int[] sortArray(int[] list){
    for (int i = 0; i<list.length - 1; i++){
      int min_temp = list[i];
      int min_index = i;
      //compare the values, find the minimum in the rest of the array.
      for (int j = i+1; j<list.length; j++){
        if (min_temp > list[j]){
          min_temp = list[j];
          min_index = j;
        }
      }
      
      //swap the values if necessary
      if (min_index != i){
        list[min_index] = list[i];
        list[i] = min_temp;
      }
    }
    return list;
  }
  
  public static void sortGPA(ArrayList<Student> kids){//use linear sort to sort the GPA, then swap the arraylist accordingly.
    for (int i = 0; i<kids.size() - 1; i++){
      double gpa_temp = kids.get(i).getGpa();
      int gpa_index = i;
      //compare the values, find the minimum in the rest of the array.
      for (int j = i+1; j<kids.size(); j++){
        if (gpa_temp > kids.get(j).getGpa()){
          gpa_temp = kids.get(j).getGpa();
          gpa_index = j;
        }
      }
      
      //swap the values if necessary
      if (gpa_index != i){
        
        Student kid_temp = new Student();
        kid_temp = kids.get(gpa_index);
        kids.set(gpa_index, kids.get(i));
        kids.set(i, kid_temp);
      }
    }
    printStudents(kids);
  }
  
  public static void printStudents(ArrayList<Student> students){
    //Print all information
    
    for (int i = 0; i < students.size(); i++){
      int student_number = i + 1;
      
      System.out.println(students.get(i).toString() + ".\n");
     }
  }
    
  public static void promptEnterKey(){
    System.out.println("Continue ...");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
  }
}