package lab5;

import java.util.Scanner;

public class Lab8_5 {

	public static void main(String[] args) {
		//create two matrix for summation
		double[][] matrix1 = getmatrix(1);
		double[][] matrix2 = getmatrix(2);

		//create a third matrix to display the sim
		double[][] matrix3 = addMatrix(matrix1, matrix2);

		//display the final results
		print(matrix1, matrix2, matrix3);
	}

	//create getmatrix method
	public static double[][] getmatrix(int matnumber) {
		//create a scanner
		Scanner input = new Scanner(System.in);

		//prompt the user for specific input
		System.out.print("Enter matrix " + matnumber);
		
		double[][] m = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				m[i][j] = input.nextDouble();
		}
		return m;
	}

	//create method to add two matrix
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

	//create method print to set elements into a row
	public static void print(double[][] m, int x) {	
		for (int j = 0; j < m[x].length; j++) {
			System.out.print(m[x][j] + " ");
		}	
	}

	//print results & add +/= signs
	public static void print(double[][] m1, double[][] m2, double[][] m3) {
		System.out.println("The matrices are added as follows");
		
		for (int i = 0; i < 3; i++) {
			print(m1, i);
			System.out.print((i == 1 ? "  +  " : "     "));
			print(m2, i);
			System.out.print((i == 1 ? "  =  " : "     "));
			print(m3, i);
			System.out.println();
		}
	}
}