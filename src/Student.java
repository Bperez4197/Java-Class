/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Student.java
 * Specification: 
 * For: CSC110 - Lab 11 - Student Class
 * Time Spent: 20 minutes
 * 
 ---------------------------------------------------------------*/
public class Student {
	String studentMajor;
	String firstName;
	String lastName;
	String studentCredits;
	
	public Student(String firstName, String lastName) {
		studentMajor = "General Studies";
		this.firstName = firstName;
		this.lastName = lastName;
		studentCredits = "0";
	}
	
	public Student(String firstName, String lastName, String studentMajor, String studentCredits) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentMajor = studentMajor;
		this.studentCredits = studentCredits;
	}
	
	public String getMajor() {
		return studentMajor;
	}
	
	public String getCredits() {
		return studentCredits;
	}
	
	public void changeMajor(String major) {
		studentMajor = major;
		System.out.printf("%s has changed majors to %s\n", getFullName(), studentMajor);
	}
	
	public String getFullName() {
		String fullName = firstName + " " + lastName;
		return fullName;
	}

}
