package lab3;

import java.util.Scanner;

public class Leo65 {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);

		//get numbers from user
		System.out.print("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

		//sort
		displaySortedNumbers(num1, num2, num3);
	}

	//new method that orders numbers
	public static void displaySortedNumbers(
		double num1, double num2, double num3) {
		double x;
		
		if (num2 < num1 && num2 < num3){
			x = num1;
			num1 = num2;
			num2 = x;
		}
		else if (num3 < num1 && num3 < num2) {
			x = num1; 
			num1 = num3;
			num3 = x;
		}
		if (num3 < num2) {
			x = num2;
			num2 = num3;
			num3 = x;
		}
		
		//display result
		System.out.println(num1 + " " + num2 + " " + num3);

	}

}
