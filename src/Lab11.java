/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Lab11.java
 * Specification: 
 * For: CSC110 - Lab 11 
 * Time Spent: 20 minutes
 * 
 ---------------------------------------------------------------*/
import java.util.Scanner;

public class Lab11 {

	public static void main(String[] args) {
		String userFirstName;
		String userLastName;
		String userMajor;
		String userCredits;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ENTER FIRST STUDENT'S INFORMATION");
		System.out.print("Enter first name: ");
		userFirstName = scan.nextLine();
		System.out.print("Enter last name: ");
		userLastName = scan.nextLine();
		System.out.print("Enter your major: ");
		userMajor = scan.nextLine();
		System.out.print("Enter your total credits: ");
		userCredits = scan.nextLine();
		System.out.println();
		
		Student student1 = new Student(userFirstName, userLastName, userMajor, userCredits);
		
		System.out.println("ENTER SECOND STUDENT'S INFORMATION");
		System.out.print("Enter first name: ");
		userFirstName = scan.nextLine();
		System.out.print("Enter last name: ");
		userLastName = scan.nextLine();
		System.out.println();

		Student student2 = new Student(userFirstName,userLastName);
		
		System.out.println("FIRST STUDENT'S INFORMATION");
		System.out.print("The name of the student is: ");
		System.out.println(student1.getFullName());
		System.out.print("Major is: ");
		System.out.println(student1.getMajor());
		System.out.print("Number of credits earned: ");
		System.out.println(student1.getCredits());
		System.out.println();
		
		System.out.println("SECOND STUDENT'S INFORMATION");
		System.out.print("The name of the student is: ");
		System.out.println(student2.getFullName());
		System.out.print("Major is: ");
		System.out.println(student2.getMajor());
		System.out.print("Number of credits earned: ");
		System.out.println(student2.getCredits());
		System.out.println();
		
		
		student1.changeMajor("Computer Engineering");
		
	}

}
