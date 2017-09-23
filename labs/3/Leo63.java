package lab3;

import java.util.Scanner;

public class Leo63 {

	public static void main(String[] args) {
		//crate scanner
		Scanner input = new Scanner(System.in);

		//get user input
		System.out.print("Enter an integer: ");
		int x = input.nextInt();

		//Report whether the integer is a palindrome.
		System.out.println(x + (isPalindrome(x) ? " is " : " is not ") + "a palindrome.");
	}

	//create new method that detects if a number is a palindrome
	public static boolean isPalindrome(int x) {
		return x == reverse(x) ? true : false;
	}
	
	//reverse return from method
	public static int reverse(int x) {
		String reverse = "";
		String n = x + "";
		// Reverse string
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse);

	}

}
