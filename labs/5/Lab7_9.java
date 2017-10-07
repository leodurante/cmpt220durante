package lab4;

import java.util.Scanner;

public class Lab7_9 {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//specify size of array
		double[] numbers = new double[10];

		//prompt user for input of exactly ten numbers
		System.out.print("Enter ten numbers:");
		for (int i = 0; i < numbers.length; i++) {numbers[i] = input.nextDouble();
		}

		//display minimum number
		System.out.println("The minimum number is: " + min(numbers));
	}

	//create method to find minimum number
	public static double min(double[] array) {
		double min = array[0];
		for (double i: array) {
			if (i < min)
				min = i;
		}
		return min;
	}

}
