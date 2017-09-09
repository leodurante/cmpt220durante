package lab1;

import java.util.Scanner;

public class Acceleration29 {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// User enters v0
		System.out.print("Enter v0 ");
		double V0 = input.nextDouble();
		
		// User enters v1
		System.out.print("Enter v1 ");
		double V1 = input.nextDouble();
		
		// User enters t
		System.out.print("Enter t ");
		double T = input.nextDouble();
		
		// Calculate acceleration
		double Acceleration = (V1 - V0) / (T);
		
		// Display Result
		System.out.println(Acceleration);

	}

}
