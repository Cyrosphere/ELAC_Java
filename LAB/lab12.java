/*
	<<!----- INSERT YOUR NAME HERE ------>>
	Lab 12
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code or modify the code so that the following output is achieved:
	        *
	      * * * 
	    * * * * *
	  * * * * * * *
	* * * * * * * * *
	  * * * * * * *
	    * * * * *
	      * * *
	        *
    * * * * *
	  * * * * 
	    * * * 
	      * * 
	        *
	4. Fix the indentation of the code. 
	Note:
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/

public class lab12{ //

  public static void main(String[] args) //main method
    {int i = 1; //initialize three integer counters
		 int j = 1;
		 int k = 1;
		 
		 for (i = 1; i <= 5; i++){//iterate from 1 to 5, the upper 5 rows of the diamond
			 for (j = 1; j <= (5-i); j++){ //print out the spaces for each row, the number of spaces decreases by 1 for the next row
				 System.out.print("  ");
			 }
			 for (k = 1; k < (i*2); k++){// print out the stars for each row, the number of stars increases by 2 for next row
				 System.out.print(" *");
			 }
			 System.out.println(); //go to next row after all stars and spaces are printed
		 }
		 
		 i = 1;//reset the counters for the lower part of the diamond
		 j = 1;
		 k = 1;
		 for (i = 1; i <= 4; i++){//iterate through the lower 4 rows
			 for (j = 1; j <= i; j++){// print out the spaces, the number of spaces increases by 1 for next row
				 System.out.print("  ");
			 }
			 for (k = 1; k < (5-i)*2; k++){// print out the stars, the number of stars decreases by 2 for next row
				 System.out.print(" *");
			 }
			 System.out.println();// go to next row when all stars and spaces are printed.
		 }
		 
		 System.out.println();// print an empty line, seperate the diamond and the triangle
		 
		 printTriangle();// call the method that print the triangle

    }
	public static void printTriangle(){//declare the methond that print the triangle
		for (int i = 0; i < 5; i++){//iterate through 5 rows, print the triangle
			for (int j = 0; j < i; j++){//print out the spaces, the number of spaces increases by 1 
				System.out.print("  ");
			}
			for (int k = 0; k < (5-i); k++){//print out the stars, the number of stars decreases by 1
				System.out.print(" *");
			}
			System.out.println();// go the next line
		}	
	}
}