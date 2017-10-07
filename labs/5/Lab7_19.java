package lab5;

import java.util.Scanner;

public class Lab7_19 {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);

		//prompt the user for input
		System.out.print("Enter list: ");
		int[] list = new int[input.nextInt()];
		for (int i = 0; i < list.length; i++)
			list[i] = input.nextInt();

		//print results
		System.out.println(
			"The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
	}

	//create method isSorted to test if input list is sorted
	public static boolean isSorted(int[] list) {
		for (int x = 0; x < list.length - 1; x++) {
			if (list[x] > list[x + 1])
				return false;
		}
		return true;
	}

}
