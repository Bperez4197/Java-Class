/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: GuessWord.java
 * Specification: Hangman game
 * For: CSC110 - Guess-a-Word Programming Project
 * Time Spent: Hours
 * 
 ---------------------------------------------------------------*/
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class GuessWord {

	public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	      String wordInProgress = "";
	      String guesses = "";
	      System.out.println("Guess-a-Word - Bryce Perez");
	     
	      String word = getWord();
	      
	      

	      do{
	         wordInProgress = printWord(word, wordInProgress, guesses);
	         System.out.printf("%s   Used letters: {%s}\n", wordInProgress, guesses);
	 		 System.out.println();
	         guesses = guesses + getUniqueGuess(in, guesses);
	      }while (!wordGuessed(wordInProgress)); 

	      System.out.printf("%s   Used letters: {%s}\n", wordInProgress, guesses);
	 	  System.out.println();

	      System.out.printf("\nYou guessed it in %d tries\n", guesses.length());

	      in.close();

	}
	
	
	public static String getWord() {
		String word = "";
		String[] elPrez = new String[12];
		int randomIndex;
		
		try {
			File inputFile = new File("presidents.txt");
			Scanner fileScan = new Scanner(inputFile);
			
			//store my president's names in the elPrez array so I can choose a random one with a Math method.
			for(int i = 0; i < 12; i++) {
				elPrez[i] = fileScan.next();
			}
			
			//random number between 0 and 11 for the array to return a random word
			randomIndex = (int)(Math.random() * 6) + 6;
			word = elPrez[randomIndex];
			fileScan.close();
			
		}catch(IOException ioe) {
			System.out.println("Something went wrong.");
		}
		
		return word;
	}
	
	
	public static String printWord(String word, String wordInProgress, String guesses) {
		word = word.toUpperCase();
		if(!guesses.isEmpty())
		{
			char lastChar = guesses.charAt(guesses.length()-1);
			if(word.contains(Character.toString(lastChar)))
			{
				//find the index of the character in the word and replace the _ at that index with the character in wordInProgress
				int indexLastChar = word.indexOf(Character.toString(lastChar));
				//System.out.println(indexLastChar);
				
				String[] inProgressArray = wordInProgress.split("\\s");
				inProgressArray[indexLastChar] = Character.toString(lastChar);
				
				
				//wordInProgress indexLastChar + 1 = lastChar
				//wordInProgress.charAt(indexLastChar + 1) = lastChar;
				//wordInProgress.replace("_",lastChar) at the correct index...;
					
				
				//update the wordInProgress string to include the found letter
				for(int i = 0; i < inProgressArray.length; i ++)
				{
					if(i == 0)
					{
						wordInProgress = inProgressArray[i] + " ";
					}else 
					{
						wordInProgress += inProgressArray[i] + " ";
					}
						
					}
			}
			
			}else
			{	
				for(int i = 0; i < word.length(); i++)
				{
					wordInProgress += "_ ";
			    }
			}
			
			return wordInProgress;
			
		//System.out.printf("%s   Used letters: {%s}\n", wordInProgress, guesses);
		//System.out.println();
		
	}
	
	
	
	public static boolean wordGuessed(String wordInProgress) {
		if(wordInProgress.indexOf("_") < 0)
		{
			return true;
		}
		return false;
	}
	
	
	
	public static String getUniqueGuess(Scanner in, String guesses) {
		String guess;
		System.out.print("Enter a letter: ");
		guess = in.next().toUpperCase();
		if(guesses.contains(guess))
		{
			guess = "";
			
		}
		
		return guess;
	}
	
	
}
