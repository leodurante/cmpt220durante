package lab5;

import java.util.Scanner;

public class Lab7_15 {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//create array and specify legnth of ten
		int[] numbers = new int[10];

		//prompt user for input, specify ten numbers
		System.out.print("Enter ten number: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();

		//check if numbers are distinct using method
		int[] distinctnumbers = eliminateDuplicates(numbers);

		//print results
		System.out.print("The distinct numbers are:");
		for (int x: distinctnumbers) {
			if (x > 0)
				System.out.print(x);
		}

	}

	//create method to find and remove duplicates in an array
	public static int[] eliminateDuplicates(int[] list) {
		int[] distinct = new int[list.length];
		int i = 0;
		for (int x: list) {
			//invoke linear search method
			if (linearSearch(distinct, x) == -1) {
				distinct[i] = x;
				i++;
			}
		}
		return distinct;
	}

	//create a method for linear search
	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i])
				return i;
		}
		return -1;
	}

}
