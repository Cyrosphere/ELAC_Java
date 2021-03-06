import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utility{
  
  public static void ReadFile(String FILENAME){
    String sCurrentLine; //this variable will hold the line read in the file 
    
    //try opening the file
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

      //go through each line in the file, if it's not null and print
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

    //catch a file IO error and print stack trace
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

 public static void WriteFile(String FILENAME, String content){
   try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
			bw.write(content);

			//System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}
   
 }
  
  

}