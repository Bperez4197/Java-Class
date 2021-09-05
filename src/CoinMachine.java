/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: CoinMachine
 * Specification: The programs gathers two inputs from the user, amount owed and amount received,
 * and returns the amount of change the user will receive as well as the unit breakdown of their
 * change.
 * For: CSC110 - Change Return
 * Time Spent: 30 minutes
 * 
 ---------------------------------------------------------------*/

import java.util.Scanner;

public class CoinMachine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double owed, received, change;
		int dollars, quarters, dimes, nickels, cents;
		
		System.out.println("Coin Machine - Bryce Perez");
		System.out.println("\n");
		
		System.out.print("Enter the amount owed: ");
		owed = scan.nextDouble();
		
		System.out.print("Enter the amount received: ");
		received = scan.nextDouble();
		
		change = received - owed;
		
		if(owed > received) {
			System.out.printf("****You did not provide enough money. you are $%.2f short.****", Math.abs(change));
		} else {
			System.out.printf("Your change today is $%.2f \n", change);
			
			change *= 100;
			dollars = (int) (change / 100);
			change -= (dollars * 100);
			quarters = (int) (change / 25);
			change -= (quarters * 25);
			dimes = (int) (change / 10);
			change -= (dimes * 10);
			nickels = (int) (change / 5);
			change -= (nickels * 5);
			cents = (int) change;
			
			
			System.out.println("\n");
			System.out.printf("Dollars : %d \n", dollars);
			System.out.printf("Quarters : %d \n", quarters);
			System.out.printf("Dimes : %d \n", dimes);
			System.out.printf("Nickels : %d \n", nickels);
			System.out.printf("Cents : %d \n", cents);
		}
		
		
		
		
		
		scan.close();
	}

}
