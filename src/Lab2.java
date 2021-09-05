/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Lab2
 * Specification: 
 * For: CSC110 - Lab 2
 * Time Spent: 30 minutes
 * 
 ---------------------------------------------------------------*/
import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String firstName, lastName, fullName;
		String title1 = new String("cse110");
		String title2 = "cse110";
		int nameLength = 0;
		
		
		System.out.print("Please enter first name: ");
		firstName = keyboard.nextLine();
		System.out.print("Please enter last name: ");
		lastName = keyboard.nextLine();
		
		fullName = firstName + " " + lastName;
		fullName = fullName.toUpperCase();
		nameLength = fullName.length();
		
		System.out.printf("Full name (in capitals): %s \n", fullName);
		System.out.printf("Length of full name: %d \n", nameLength);
		
		
		if(title1 == title2) {
			System.out.println("String comparison using \"==\" sign works");
		}else {
			System.out.println("String comparison using \"==\" does NOT work");
		}
		
		if(title1.equals(title2)) {
			System.out.println("String comparison using \"equals\" method works");
		}else {
			System.out.println("String comparison using \"equals\" method does NOT work");
		}
		
		
		
		
		
		
		keyboard.close();

	}

}
