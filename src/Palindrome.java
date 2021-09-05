/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Palindrome.java
 * Specification: This program determines if user input is a Palindrome (the same backwards and forwards).
 * For: CSC110 - Programming Project Palindrome Checker
 * Time Spent: 30 minutes
 * 
 ---------------------------------------------------------------*/
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userPhrase;
		boolean flag = false;
		
		System.out.println("Palindrome Checker - Bryce Perez");
		System.out.println();
		
		do {
			System.out.print("Enter a phrase: ");
			userPhrase = scan.nextLine();
			
			if(userPhrase.toLowerCase().equals("done")) {
				flag = true;
			}else {
				System.out.println(isPalindrome(userPhrase));
			}
		}while(!flag);
		
		
		scan.close();
	}
	
	
	public static String isPalindrome(String input) {
		input = input.toLowerCase();
		String cleanInput= "";
		String reversedString= "";
		String yesPal = "That is a Palindrome.";
		String noPal = "That is NOT a Palindrome.";
		
		//loop to remove punctuation and spaces
		for(int i = 0; i < input.length(); i++) {
			if(Character.isLetter(input.charAt(i)) && !Character.isSpaceChar(input.charAt(i))) {
					cleanInput += input.charAt(i);
			}
		}
		
		//loop backwards and add each character to reversedString variable.
		for(int i = cleanInput.length() -1; i >= 0; i--) {
			reversedString += cleanInput.charAt(i);
		}
		
		if(reversedString.equals(cleanInput)) {
			return yesPal;
		}else {
			return noPal;
		}
		
}
}