/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Lab9.java
 * Specification: ask a user for their first and last names as well as their birth year,
 * create a person object with that information and output it to the console.
 * For: CSC110 - Lab 9
 * Time Spent: 15 minutes
 * 
 ---------------------------------------------------------------*/
import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {
		
		String firstName, lastName;
		int birthYear;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		firstName = scan.nextLine();
		System.out.print("Enter your last name: ");
		lastName = scan.nextLine();
		System.out.print("Enter your birthYear: ");
		birthYear = scan.nextInt();
		
		Person user = new Person(firstName, lastName, birthYear);
		
		System.out.printf("%s %s is %d years old in 2019 and will be %d years old in 2029.",
				user.getFirstName(), user.getLastName(), user.getAge(2019), user.getAge(2029));

	}

}
