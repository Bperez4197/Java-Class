/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: BrandName.java
 * Specification: This program generates ten brand names each time it is run. The brand names are made up of random vowels and consonants
 * depending on the index of the string.
 * For: CSC110 - Programming Project Brand Name Generator
 * Time Spent: 40 minutes
 * 
 ---------------------------------------------------------------*/



public class BrandName {

	public static void main(String[] args) {
		
		
		System.out.println("Brand Name Generator - Bryce Perez");
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			int random = (int) (Math.random() * 6) + 7;
			System.out.printf("%d) %s \n", i+1, generateName(random));
		}

	}
	
	public static String generateName(int size) {
		String brandName = "";
		String vowels = "aeiou";
		String consonants = "bcdfghjklmnprstvwxz";
		
		for(int i = 1; i <= size; i++) {
			if(i % 2 == 0) {
				brandName += vowels.charAt((int) (Math.random() * 5));
			}else {
				brandName += consonants.charAt((int) (Math.random() * consonants.length()));
			}
		}
		
		brandName = brandName.substring(0,1).toUpperCase() + brandName.substring(1);
		
		return brandName;
	}

}
