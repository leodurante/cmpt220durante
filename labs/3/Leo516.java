package lab3;

import java.util.Scanner;

public class Leo516 {

	public static void main(String[] args) {
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user for input
		System.out.println("Enter an integer");
		
		//record user input as integer
		int number = input.nextInt();
		
		//create value to use for testing
		int test = 2;
		
		//create loop
		while (number / test >= 1) { // JA: Changed != to >=
			
			// Test potential factors
			if (number % test  == 0) {
				//print the results
				System.out.print(test + ", ");
				number /= test; 
			}
			
			//increase test until all factors are found
			else
				test++;
		}
		//end of results
		System.out.print("are its integers.");

	}

}
