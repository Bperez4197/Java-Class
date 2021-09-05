/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Lab10.java
 * Specification: 
 * For: CSC110 - Lab 10
 * Time Spent: 15 minutes
 * 
 ---------------------------------------------------------------*/
import java.util.Scanner;

public class Lab10 {

	public static void main(String[] args) {
		String userName = "";
		int testRow;
		int testPyramid;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Name of builder: ");
		userName = scan.nextLine();
		
		Builder myBuilder = new Builder(userName);
		
		System.out.printf("Name of builder is: %s", myBuilder.getName());
		System.out.println();
		System.out.print("Enter a positive integer: ");
		testRow = scan.nextInt();
		System.out.println();
		System.out.printf("%s%s%s\n", printDashes(testRow),myBuilder.makeRow(testRow, "*"), printDashes(testRow));
		System.out.println();
		System.out.print("Enter a positive odd integer, \n representing number of stars in the base of a pyramid: ");
		testPyramid = scan.nextInt();
		myBuilder.makePyramid(testPyramid, userName);
		
		
		scan.close();

	}
	
	public static String printDashes(int n) {
		String finalString = "";
		for(int i = 0; i < n; i++) {
			finalString = finalString.concat("=");
		}
		return finalString;
	}

}
