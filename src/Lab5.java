/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Lab5.java
 * Specification: create a basic Array of numbers, fill in the elements of that array
 * by prompting the user for input, display the elements of the array back to the user, 
 * and then calculate and display the sum of those array elements.
 * For: CSC110 - Lab 5
 * Time Spent: 20 minutes
 * 
 ---------------------------------------------------------------*/

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arrayLength;
		double sum = 0.0;
		double currentElement;
		
		System.out.println("How many elements in the array?");
		arrayLength = scan.nextInt();
		
		double[] values = new double[arrayLength];
		for(int i = 0; i < arrayLength; i++) {
			System.out.print("Please enter the next value: ");
			currentElement = scan.nextDouble();
			values[i] = currentElement;
			System.out.println();
			
		}
		
		//System.out.println(Arrays.toString(values));
		
		for(int i = arrayLength - 1; i >= 0; i--) {
			System.out.printf("%.3f \t" , values[i]);
		}
		
		for(double value: values) {
			sum += value;
		}
		
		System.out.println();
		System.out.printf("The sum of the array's elements is: %.3f", sum);
		
		scan.close();
	}

}
