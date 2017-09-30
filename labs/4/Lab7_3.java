package lab4;

import java.util.Scanner;

public class Lab7_3 {

	public static void main(String[] args) {
		//create value to store counts
		int[] counts = new int[100];

		//prompt user for input
		System.out.print("Enter the integers between 1 and 100: ");

		//count times of numbers appearing
		count(counts);

		//display results
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0)
				System.out.println((i + 1) + " occurs " + counts[i] + " times");
		}
	}
	//create method to recieve and count user input
	public static void count(int[] counts){
		//create scanner
		Scanner input = new Scanner(System.in);
		//create place for user input
		int num;
		//count number of each integer
		do {num = input.nextInt();
			if (num >= 1 && num <= 100)counts[num - 1]++;
		} 
		//terminate when user inputs 0
		while (num != 0);
	}

}
