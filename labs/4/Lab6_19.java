package lab4;

import java.util.Scanner;

public class Lab6_19 {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user for input
		System.out.print("Enter the three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		//display if area is valid or error message if invalid
		System.out.println(Valid(side1, side2, side3) ? 
				"The area of the triangle is: " + area(side1, side2, side3) :
				"Input is invalid");
		

	}
	//create method to test validity
	public static boolean Valid(double side1, double side2, double side3) {
			boolean valid = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
			return valid;
	}
	//create method to calculate area
	public static double area(double side1, double side2, double side3) {
			double x = (side1 + side2 + side3) / 2;
			return Math.sqrt(x * (x - side1) * (x - side2) * (x - side3));
	}

}
