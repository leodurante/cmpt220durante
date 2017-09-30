package lab4;

import java.util.Scanner;

public class Lab6_17 {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user for input
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		//display matrix
		printMatrix(n);

	}
	//create matrix method
	public static void printMatrix(int n) {
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols < n; cols ++) {
				//print 0 or 1
				System.out.print((int)(Math.random() * 2));
			}
			
			//move to next line
			System.out.println();
		}
	}

}
