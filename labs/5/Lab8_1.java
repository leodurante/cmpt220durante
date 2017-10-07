package lab5;

import java.util.Scanner;

public class Lab8_1 {

	public static void main(String[] args) {
		//create matrix
		double[][] matrix = getMatrix();

		// Display the sum of each column
		for (int col = 0; col < matrix[0].length; col++) {	
			System.out.println("Sum of the elements at column " + col + " is " + sumColumn(matrix, col));
		}
	}

	//create getMatrix method
	public static double[][] getMatrix() {
		//create scanner
		Scanner input = new Scanner(System.in);
		//specify rows and columns final so they cannot change
		final int rows = 3;
		final int columns = 4;
		double[][] m = new double[rows][columns];

		//prompt user for input of a matrix
		System.out.println("Enter a " + rows + "-by-" + columns + " matrix row by row:");
		for (int row = 0; row < m.length; row++)
			for (int col = 0; col < m[row].length; col++) 
				m[row][col] = input.nextDouble();
				return m;
			}

	//create method for sums
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int row = 0; row < m.length; row++) {
			sum += m[row][columnIndex];		
		}
		return sum;

	}

}
