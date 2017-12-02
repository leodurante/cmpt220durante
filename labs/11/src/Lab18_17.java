
import java.util.Scanner;

public class Lab18_17 {
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);

		//prompt user for list of characters
		System.out.print("enter list of characters ");
		String str = input.nextLine();
		char[] chars = new char[str.length() - 1];
		for (int i = 0; i < chars.length; i++)
			chars[i] = str.charAt(i);
		char ch = str.charAt(str.length() - 1);

		//display frequency of character
		System.out.println(ch + " occurs " + count(chars, ch) + " times " + 
			str.substring(0, str.length() - 1));
	}

	//counts occurance of inputtet characters
	public static int count(char[] chars, char ch) {
		return count(chars, ch, chars.length - 1);
	}

	public static int count(char[] chars, char ch, int high) {
		//default
		if (high < 0)
			return 0;
		//recursions
		else if (chars[high] == ch) 
			return 1 + count(chars, ch, high - 1);
		else
			return count(chars, ch, high - 1);
	}
}