/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Savings
 * Specification: asks the user for a deposit amount, the annual interest rate, and the number
 * of months they intend to leave the money alone- then outputs how much money will be in the account
 * after the specified number of months.
 * For: CSC110 - Compound Interest
 * Time Spent: 30 minutes
 * 
 *total = startingAmount * (1 + monthlyInterest)^months
 ---------------------------------------------------------------*/

import java.util.Scanner;

public class Savings {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double startingAmount, interestRate, total, monthlyInterest;
		int months;
		
		System.out.println("Compound Interest - Bryce Perez");
		System.out.println("");
		
		System.out.print("What is the initial savings amount? ");
		startingAmount = keyboard.nextDouble();
		System.out.print("What is the number of months to save? ");
		months = keyboard.nextInt();
		System.out.print("What is the annual interest rate? ");
		interestRate = keyboard.nextDouble();
		
		
		monthlyInterest = (interestRate / 100.00) / 12.00;
		total = startingAmount * Math.pow(1 + monthlyInterest, months);
		
		System.out.printf("$%.2f, saved for %d months at %.2f%% will be valued at $%.2f",startingAmount,months,interestRate,total);

		keyboard.close();
	}

}
