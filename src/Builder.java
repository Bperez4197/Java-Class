/**------------------------------------------------------------
 * Author: Bryce Perez
 * FileName: Builder.java
 * Specification: 
 * For: CSC110 - Lab 10 - Builder class
 * Time Spent: 20 minutes
 * 
 ---------------------------------------------------------------*/

public class Builder {

		String name;
		
		public Builder(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public String makeRow(int n, String s) {
			String finalString = "";
			for(int i = 0; i < n; i++) {
				finalString = finalString.concat(s);
			}
			return finalString;
		}
		
		public void makePyramid(int n, String s) {
			String special = "";
			String spacer = "";
			int spacerNumber = n / 2;
			
			for(int i = 0; i < spacerNumber; i++) {
				spacer = spacer.concat(" ");
			}
			
			for(int i = 0; special.length() < n; i++) {
				System.out.printf("%s*%s\n",spacer,special);
				if(spacer.length() > 0) {
					spacer = spacer.substring(0,spacer.length() - 1);
				}
				special = special.concat("**");
			}
		}
}
