/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Lab10.java
 * Specification: Calculates the probability of major poker hands when rolling dice 1 million times.
 * For: CSC110 - Programming Project Poker Dice
 * Time Spent: 30 minutes
 * 
 ---------------------------------------------------------------*/
public class PokerDice {

	public static void main(String[] args) {
		int numberOfTrials = 1000000;
		final String[] HANDS = {"N/A","None alike","One pair","Two Pairs","Three of a kind","Full house","Four of a kind","Five of a kind"};
		int[] tally = {0,0,0,0,0,0,0,0}; // tally[0] not used
		Die[] dice = createDice();
		
		
		for(int i = 0; i < numberOfTrials; i++) {
			rollDice(dice);
			int hand = determineHand(dice);
			tally[hand]++;
		}
		
		
		printHeading(numberOfTrials);
		
		for(int i = 1; i < tally.length; i++) {
			System.out.printf("Case %d) %15s, is %.5f\n", i, HANDS[i], (double) tally[i]/numberOfTrials);
		}
		
		
		
	}
	
	
	
		
		public static Die[] createDice() {
			Die[] group = new Die[5];
			
			for(int i = 0; i < group.length; i++) {
				Die tempDie = new Die();
				group[i] = tempDie;
			}
			
			return group;	
		}
		
		
		
		public static void printHeading(int number) {
			System.out.println("Poke Dice Probability Calculator - Bryce Perez");
			System.out.printf("Running %d trials\n", number);
			System.out.println();
		}
		
		
		
		public static void rollDice(Die[] manyDice) {
			for(int i = 0; i < manyDice.length; i++) {
				manyDice[i].roll();
			}
		}
		
		public static int determineHand(Die[] manyDice) {
			int numberOfMatches = 0;
			
			for(int i = 0; i < manyDice.length; i++) {
				
				for(int j = i+1; j < manyDice.length; j++) {
					if(manyDice[i].getValue() == manyDice[j].getValue()) {
						numberOfMatches++;
					}
				}
			}
			
			switch (numberOfMatches) {
			case 0: return 1; 
			case 1: return 2; 
			case 2: return 3; 
			case 3: return 4; 
			case 4: return 5; 
			case 6: return 6;
			case 10: return 7;
			default: return 0; 
			}
			
		}
		
		
	
		

}
