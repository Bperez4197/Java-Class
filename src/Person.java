/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Person.java
 * Specification: Person class to be used in lab 9.
 * For: CSC110 - Lab 9 Person class
 * Time Spent: 
 * 
 ---------------------------------------------------------------*/
public class Person {
	
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Person(String firstName, String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge(int currentYear) {
		return currentYear - birthYear;
	}

}
