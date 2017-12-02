
import java.util.Scanner;

public class Lab18_15 {
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);

		//prompt user for string & character
		System.out.print("enter string & character: ");
		String[] str = input.nextLine().split("[ ]");

		//display frequency of character in string
		System.out.println("character " + str[1] + " occurs " +
			count(str[0], str[1].charAt(0)) + " times in \"" + str[0] + "\".");
	}

	//counts frequency of specified character in inputted string
	public static int count(String str, char a) {
		return count(str, a, str.length() - 1);
	}

	private static int count(String str, char a, int high) {
		//default
		if (high < 0)
			return 0;
		
		//recursions
		else if (str.charAt(high) ==  a) {
			return 1 + count(str, a, high - 1);
		}
		else
			return count(str, a, high - 1);
	}
}