/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Lab7.java
 * Specification: 
 * For: CSC110 - Lab 7 Two-Dimensional Arrays
 * Time Spent: 30 minutes
 * 
 ---------------------------------------------------------------*/
import java.util.Scanner;


public class Lab7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int rows,columns,sum;
		
		System.out.print("Enter the number of rows in the array: ");
		rows = keyboard.nextInt();
		System.out.print("Enter the number of columns in the array: ");
		columns = keyboard.nextInt();
		
		int[][] intArray = new int[rows][columns];
		
		
		//Loop to populate the 2-d array
		for(int i = 0; i < rows; i++) {
			
			for(int j = 0; j < columns; j++) {
				System.out.print("Please enter a value: ");
				intArray[i][j] = keyboard.nextInt();
			}
		}
		
		//Loop to display intArray's values
		for(int i = 0; i < rows; i++) {
			
			for(int j = 0; j < columns; j++) {
				System.out.printf("%d\t", intArray[i][j]);
			}
			System.out.print("\n");
		}
		
		
		//Loop to sum each row 
		for(int i = 0; i < rows; i++) {
			sum = 0;
			for(int j = 0; j < columns; j++) {
				sum += intArray[i][j];
			}
			
			System.out.printf("The sum of the element of row %d is: %d\n", i, sum);
		}
		
		keyboard.close();
	}

}
