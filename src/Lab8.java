/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Lab8.java
 * Specification: Read from a .txt file, store the information, then print out the information.
 * For: CSC110 - Lab 8 exception handling/ reading text files
 * Time Spent: 30 minutes
 * 
 ---------------------------------------------------------------*/
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Lab8 {

	public static void main(String[] args) {
		String line;
		String[][] myArray = new String[4][3];
		
		//read from the file and populate myArray with each line from the president.txt file
		try {
			File inputFile = new File("presidents.txt");
			Scanner in = new Scanner(inputFile);
			
			for(int i = 0; i < 4; i++) {
				
				for(int j = 0; j < 3; j++) {
					line = in.next();
					myArray[i][j] = line;
				}
			}
			in.close();
		}catch (IOException ioe) {
			System.out.println("Something went wrong.");
		}
		
		//Print the content of myArray
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 3; j++) {
				System.out.printf("%-20s", myArray[i][j]);
			}
			System.out.println();
			
		}
		
		
		
		

	}

}
