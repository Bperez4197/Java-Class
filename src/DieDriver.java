/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: DieDriver.java
 * Specification: This program utilizes a created Die class to pass a series of tests.
 * For: CSC110 - Programming Project Die
 * Time Spent: 15 minutes
 * 
 ---------------------------------------------------------------*/

public class DieDriver {

	public static void main(String[] args) {
		
		
		System.out.println("Die Drive - Bryce Perez");
		System.out.println();
		
		//Test 1 a,b,c
		System.out.println("1. Creation of Die");
		System.out.println();
		Die defaultDie = new Die();
		System.out.print("a) ");
		defaultDie.print();
		System.out.println();
		Die fourSided = new Die(4);
		System.out.print("b) ");
		fourSided.print();
		System.out.println();
		Die tenSided = new Die(10);
		System.out.print("c) ");
		tenSided.print();
		System.out.println();
		
		//Test 2
		System.out.println();
		System.out.println("2. Setting Value of Die");
		System.out.println();
		defaultDie.setValue(3);
		fourSided.setValue(5);
		tenSided.setValue(0);
		System.out.print("a) ");
		defaultDie.print();
		System.out.println();
		System.out.print("b) ");
		fourSided.print();
		System.out.println();
		System.out.print("c) ");
		tenSided.print();
		System.out.println();
		
		
		//Test 3
		System.out.println();
		System.out.println("3. Freezing a Die");
		System.out.println();
		defaultDie.freeze();
		defaultDie.setValue(5);
		System.out.print("a) ");
		defaultDie.print();
		System.out.println();
		defaultDie.unfreeze();
		defaultDie.setValue(5);
		System.out.print("b) ");
		defaultDie.print();
		System.out.println();
		
		
		
		//Test 4
		System.out.println();
		System.out.println("4. Drawing a Die");
		System.out.println();
		System.out.println("a) ");
		defaultDie.draw();
		System.out.println();
		System.out.println("b) ");
		fourSided.draw();
		System.out.println();
		System.out.println("c) ");
		tenSided.draw();
		System.out.println();
		
		
		
		
		//Test 5
		System.out.println();
		System.out.println("5. Rolling a Die");
		System.out.println();
		System.out.print("a) ");
		for(int i = 0; i < 10; i++) {
			defaultDie.roll();
			defaultDie.print();
		}
		
		System.out.println();
		System.out.print("b) ");
		for(int i = 0; i < 3; i++) {
			fourSided.roll();
			fourSided.print();
		}
		
		System.out.println();
		System.out.print("c) ");
		for(int i = 0; i < 10; i++) {
			tenSided.roll();
			tenSided.print();
		}
	}

}
