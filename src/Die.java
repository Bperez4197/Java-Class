/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Die.java
 * Specification: 
 * For: CSC110 - Class for PokerDice - Programming Project PokerDice
 * Time Spent: 30 minutes
 * 
 ---------------------------------------------------------------*/

public class Die {

	private int numSides;
	private int currentValue;
	private boolean frozen;
	
	
	public Die() {
		numSides = 6;
		currentValue = 1;
		frozen = false;
	}
	
	
	public Die(int numSides) {
		if(numSides < 1) {
			System.out.println("Not enough sides...we'll set it to 6.");
			this.numSides = 6;
		}else {
			this.numSides = numSides;
		}
		currentValue = 1;
		frozen = false;
	}
	
	
	public void setValue(int value) {
		if(!frozen) {
			if(value > 0 && value <= numSides) {
				currentValue = value;
			}else {
				System.out.printf("*** Attempted to set value to %d, asssumed 1. \n", value);
				currentValue = 1;
			}
			
		}
		
	}
	
	
	public int getValue() {
		return currentValue;
	}
	
	public void roll() {
		if(!frozen) {
			int randDice = (int)(Math.random() * numSides) + 1;
			currentValue = randDice;
		}
		
	}
	
	public void print() {
		System.out.printf("[%d:%d] ", currentValue, numSides);
	}
	
	public void draw() {
		if(numSides <= 6) {
			switch(currentValue) {
			case 1: System.out.println(" ........\n .      . \n .  *   .\n .      . \n ........"); break;
			case 2: System.out.println(" ........\n . * *  . \n .      .\n .      . \n ........"); break;
			case 3: System.out.println(" ........\n . * *  . \n .  *   .\n .      . \n ........"); break;
			case 4: System.out.println(" ........\n . * *  . \n .      .\n . * *  . \n ........"); break;
			case 5: System.out.println(" ........\n . * *  . \n .  *   .\n . * *  . \n ........"); break;
			case 6: System.out.println(" ........\n . * *  . \n . * *  .\n . * *  . \n ........"); break;
			default: System.out.println("Something went wrong..."); break;
			}
			
		}else {
			print();
		}
	}
	
	public void freeze() {
		frozen = true;
	}
	
	public void unfreeze() {
		frozen = false;
	}
	
	
}
