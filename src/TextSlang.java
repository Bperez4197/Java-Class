/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: TextSlang
 * Specification: This program asks the user for an abbreviated slang term and returns what it stands for.
 * For: CSC110 - Programming: Text Slang
 * Time Spent: 20 minutes
 * 
 ---------------------------------------------------------------*/
import java.util.Scanner;

public class TextSlang {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userInput = "";
		
		System.out.println("TextSlang - Bryce Perez");
		System.out.println();
		
		while(!userInput.equals("TTFN")) {
		System.out.print("Enter a text slang term, TTFN to stop: ");
		userInput = scan.nextLine().toUpperCase();

		switch (userInput) {
		case "BRB":
			System.out.println("BRB means Be Right Back");
			break;
		case "IRL":
			System.out.println("IRL means In Real Life");
			break;
		case "BAE":
			System.out.println("BAE means Before Anyone Else");
			break;
		case "IDK":
			System.out.println("IDK means I Dont Know");
			break;
		case "JK":
		case "J/K":
			System.out.println("JK means Just Kidding");
			break;
		case "LOL":
			System.out.println("LOL means Laugh Out Loud");
			break;
		case "STFU":
			System.out.println("STFU means Shut The Front Door");
			break;
		case "TTYL":
			System.out.println("TTYL means Talk To You Later");
			break;
		case "WTF":
			System.out.println("WTF means Why The Face?");
			break;
		case "YOLO":
			System.out.println("YOLO means You Only Live Once");
			break;
		case "TTFN":
			System.out.println("TTFN means Ta-Ta For Now");
			break;
		default: 
			System.out.printf("I dont know what %s means \n", userInput);
			break;
			
		}
		}
		
		scan.close();
	}

}
