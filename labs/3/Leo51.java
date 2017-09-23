package lab3;

import java.util.Scanner;

public class Leo51 {

	public static void main(String[] args) {
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user for input
		System.out.println("Enter an integer, the input ends if it is 0: ");
		
		//create integer values to fill & a float value for sum
		int Value, Positive = 0, Negative = 0;
		float sum = 0;
		
		//begin loop
		while ((Value = input.nextInt()) != 0) {
			
			sum = sum + Value;
			
			//add to the positive count for each positive entered
			if (Value > 0) {
				 Positive++;
			}
			
			//add to the negative count for each negative entered
			else if (Value < 0) {
				 Negative++;
			}
			
			//end
			}
		
		//create error message for when the user only inputs a 0
		if (Positive + Negative == 0) {
		    System.out.println("No numbers are entered except 0");
		    System.exit(0);
			}
		
		//print the results
		System.out.println("The number of positives is " + Positive);
		System.out.println("The number of negatives is " + Negative);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + (sum / (Positive + Negative)));
			 
			}

	}


