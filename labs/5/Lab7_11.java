package lab4;

import java.util.Scanner;

public class Lab7_11 {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//specify legnth of array
		double[] numbers = new double[10];

		//prompt user to input exactly ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();

		//display results from methods
		System.out.println("The mean is " + mean(numbers));
		System.out.println("The standard deviation is " + deviation(numbers));
	}

	//create method to calculate standard deviation
	public static double deviation(double[] x) {
		double deviation = 0;
		double mean = mean(x);
		for (double e: x) {
			deviation += Math.pow(e - mean, 2);
		}
		return Math.sqrt(deviation / (x.length - 1));
	}

	//create method to calculate mean
	public static double mean(double[] x) {
		double mean = 0;
		for (double e: x) {
			mean += e;
		}
		return mean / x.length;
	}

}
