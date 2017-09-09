package lab1;

import java.util.Scanner;

// Here you had to calculate years and days
public class Howmanyyears27 {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		
		// Get user input in minutes
		System.out.print("Enter time in minutes ");
		int Minutes = input.nextInt();
		
		// convert minutes into hours
		double Hours = (int)(Minutes) / (60); // JA: Use lowercase for variable names
		
		// hours into days
		double Days = (int)(Hours) / (24);
		
		// days into years
		int Years = Minutes / (365 * 24 * 60);
		
		// find remainder in days
		int Remainder = (Minutes / (24 * 60)) % 365;
		
		// remove reminder from year
		//double Finalyears = (Years - Remainder);
		
		// display results
		System.out.print(Years + " And " + Remainder + " Days ");

	}

}
