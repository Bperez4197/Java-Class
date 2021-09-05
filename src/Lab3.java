/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Lab3
 * Specification: 
 * For: CSC110 - Lab 3
 * Time Spent: 30 minutes
 * 
 ---------------------------------------------------------------*/

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double finalExamGrade = 0;
		double homeworkGrade = 0;
		double midtermGrade = 0;
		double finalGrade = 0;
		char letterGrade = ' ';
		boolean pass = false;
		
		System.out.print("Enter homework grade: ");
		homeworkGrade = scan.nextDouble();
		if(homeworkGrade > 0 && homeworkGrade < 100) {
			System.out.print("Enter midterm grade: ");
			midtermGrade = scan.nextDouble();
			if(midtermGrade > 0 && midtermGrade < 100) {
				System.out.print("Enter final exam grade: ");
				finalExamGrade = scan.nextDouble();
					if(finalExamGrade > 0 && finalExamGrade < 200) {
					pass = true;
					}
					else 
					{
					System.out.println("Invalid input. Homework and midterm grades should be between 0 and 100 and the final grade should be between 0 and 200 ");

					}
			}
			else
			{
			System.out.println("Invalid input. Homework and midterm grades should be between 0 and 100 and the final grade should be between 0 and 200 ");
			}
			
		}
		else
		{
		System.out.println("Invalid input. Homework and midterm grades should be between 0 and 100 and the final grade should be between 0 and 200 ");
		}
		
		finalGrade = ((finalExamGrade/200)*50) + ((midtermGrade/100)*25) + ((homeworkGrade/100)*25);
		
		if(finalGrade >= 50) {
			letterGrade = 'P';
		}else {
			letterGrade = 'F';
		}
		
		if(letterGrade == 'P') {
			System.out.println("Student Passed the class");
		}else {
			System.out.println("Student Failed the class");
		}
		
	scan.close();
	}

}
