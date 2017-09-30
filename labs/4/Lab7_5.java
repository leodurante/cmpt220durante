package lab4;

import java.util.Scanner;

public class Lab7_5 {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//specify size of array
		int[] distinctNumbers = new int[10];
		
		//store user input
		int num;
		
		//distinct numbers counter
		int count = 0;
		
		//prompt user for input of exactly ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			num = input.nextInt();

			//find distinct numbers via method
			if (distinct(distinctNumbers, num)) {
				distinctNumbers[count] = num;
				//increase distinct numbers counter for each positive return
				count++;
			}
		}

		//print results
		System.out.println("The number of distinct numbers is " + count);
		System.out.print("The distinct numbers are");
		for (int i = 0; i < distinctNumbers.length; i++) {
			if (distinctNumbers[i] > 0)
				System.out.print(" " + distinctNumbers[i]);
		}
	}
	
	//crate method to test for distinct inputs
	public static boolean distinct(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
	}
	
}
