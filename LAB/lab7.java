/*
lab 7
Xiangbang Sun

Create an array of custom  objects
instantiating an array, calling methods to setup paramaters using random numbers
iterate through the list, instantiating an object for each element.
collect paramaters and print

*/

public class lab7{
  //main method
  public static void main(String[] args){
    int randomhp; 
    int randomagi; 
    int randomatk;
    int enemy_number;
    armored_unit[] ironcans = new armored_unit[5];//instantiating an object array
    
    
    
    for (int i = 0; i < ironcans.length; i++){
     randomhp = -50 + (int)(Math.random() * 100);
     randomagi = -10 + (int)(Math.random() * 5);
     randomatk = 0 + (int)(Math.random() * 30);      
      
      armored_unit can = new armored_unit(randomhp, randomagi, randomatk);

      
      ironcans[i] = can;//assign the object to a certain position in the array
      
   }
    

    
    //Print all information
    for (int i = 0; i < ironcans.length; i++){
      enemy_number = i + 1;
      
      System.out.println("enemy " + enemy_number + " hp : " + ironcans[i].hp_get() + "; agi : " + ironcans[i].agi_get() + "; atk : " + ironcans[i].atk_get() + ".\n");

     }

  }

}

