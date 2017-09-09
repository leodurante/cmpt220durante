package lab1;

import java.util.Scanner;

public class Howmanyyears27 {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		
		// Get user input in minutes
		System.out.print("Enter time in minutes ");
		double Minutes = input.nextDouble();
		
		// convert minutes into hours
		double Hours = (Minutes) / (60.0);
		
		// hours into days
		double Days = (Hours) / (24);
		
		// days into years
		double Years = (Days) / (365);
		
		// find remainder in days
		double Remainder = (Days) % (365);
		
		// remove reminder from year
		double Finalyears = (Years - Remainder);
		
		// display results
		System.out.print(Finalyears + " And " + Remainder + " Days ");

	}

}
