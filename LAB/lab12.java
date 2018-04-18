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

public class lab12{

  public static void main(String[] args) 
    {int i = 1;
		 int j = 1;
		 int k = 1;
		 
		 for (i = 1; i <= 5; i++){
			 for (j = 1; j <= (5-i); j++){
				 System.out.print("  ");
			 }
			 for (k = 1; k < (i*2); k++){
				 System.out.print(" *");
			 }
			 System.out.println();
		 }
		 
		 i = 1;
		 j = 1;
		 k = 1;
		 for (i = 1; i <= 4; i++){
			 for (j = 1; j <= i; j++){
				 System.out.print("  ");
			 }
			 for (k = 1; k < (5-i)*2; k++){
				 System.out.print(" *");
			 }
			 System.out.println();
		 }
		 
		 System.out.println();
		 
		 printTriangle();

    }
	public static void printTriangle(){
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < i; j++){
				System.out.print("  ");
			}
			for (int k = 0; k < (5-i); k++){
				System.out.print(" *");
			}
			System.out.println();
		}	
	}
}