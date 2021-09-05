/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Lab1
 * Specification: Receive 3 test scores as inputs and return an average to the user
 * For: CSC110 - Lab #1
 * Time Spent: 10 minutes
 * 
 *
 ---------------------------------------------------------------*/
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// variable initialization
		int score1, score2, score3;
		final int NUM_TESTS = 3;
		double average;
		
		System.out.print("Please enter the score for test 1: ");
		score1 = keyboard.nextInt();
		System.out.print("Please enter the score for test 2: ");
		score2 = keyboard.nextInt();
		System.out.print("Please enter the score for test 3: ");
		score3 = keyboard.nextInt();
		
		//one of these variables needs to be cast to a double to force java to do decimal division
		//rather than integer division. Otherwise average will be a non decimal number even when
		//it is inaccurate.
		average = (score1 + score2 + score3) / (double)NUM_TESTS;
		
		System.out.printf("Your average test score: %.2f\n", average);
		
		keyboard.close();

	}

}
