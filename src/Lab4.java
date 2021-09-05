/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Lab4
 * Specification: 
 * For: CSC110 - Lab 4
 * Time Spent: 30 minutes
 * 
 ---------------------------------------------------------------*/
import java.util.Scanner;

public class Lab4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		
		do{
			
			
			System.out.println("Please choose your choice from the following menu: ");
			System.out.println("1) Print through all integer numbers between two given integers.");
			System.out.println("2) Display a right triangular pattern of stars.");
			System.out.println("3) Quit.");
			choice = scan.nextInt();
			
				switch(choice) {
				case 1: printIntegerSequence();
				break;
				case 2: triangularPattern();
				break;
				case 3: System.out.println("3");
				break;
				default: System.out.println("You did not choose 1-3.");
				break;
				}
			
			
			
		}while(choice != 3);
		
		
		scan.close();
		
	}
	
	public static void printIntegerSequence() {
		Scanner scan = new Scanner(System.in);
		int start, end;
		
		System.out.println("Enter the start number: ");
		start = scan.nextInt();
		System.out.println("Enter the end number: ");
		end = scan.nextInt();
		
		for(int i = start; i <= end; i++) {
			if(i < end) {
				System.out.printf("%d ",i);
			}else {
				System.out.print(i);
			}
		}
		
		System.out.println("\n");
		
	}
	
	
	public static void triangularPattern() {
		Scanner scan = new Scanner(System.in);
		int height;
		
		System.out.println("Enter the height: ");
		height = scan.nextInt();
		
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		
		
		
	}

	
}
