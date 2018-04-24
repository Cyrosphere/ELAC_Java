public class lab15{
  //main method
  public static void main(String[] args){
    int[][] matrix = new int[5][5];//declare the 2D array.
    
//calling the random int generater method, assign random int to the matrix.    
    for (int i = 0; i<5; i++){
      for(int j =0; j<5; j++){
        matrix[i][j] = Random();
      }
    }
    
//print out each int in the matrix.    
    for (int i = 0; i<5; i++){
      for(int j =0; j<5; j++){
        System.out.println(matrix[i][j]);
      }
    }
    
  }
// random int generater method
  public static int Random(){
    int randomNum = 0 + (int)(Math.random() * 100);
    return randomNum;
  }
}