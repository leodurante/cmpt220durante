
import java.util.Scanner;

public class Lab18_11 {
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);

		//prompt user for integer input
		System.out.print("enter integer: ");
		int n = input.nextInt();

		//display results
		System.out.println(n + "'s digits sum too: " + sumDigits(n));
	}

	//summation method sumDigits
	public static int sumDigits(int n) {
		return sumDigits(n, 0);
	}

	private static int sumDigits(int n, int sum) {
		//default
		if (n == 0)
			return sum;
		//recursion
		else
			return sumDigits(n / 10, sum + (int)(n % 10));
	}
}