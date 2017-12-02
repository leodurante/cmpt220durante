
import java.util.Scanner;

public class Lab18_13 {
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);

		//prompt user for 8 integers
		System.out.print("enter eight integers: ");
		
		//create array
		int[] list = new int[8];
		
		//populate array with entered integers
		for (int n = 0; n < list.length; n++) {list[n] = input.nextInt();
		}

		//print result
		System.out.println("the largest number is: " + max(list));
	}

	//find largest number in array
	public static int max(int[] list) {
		//largest number
		int max = list[list.length - 1];
		
		//index
		int index = list.length - 1;
		
		//return
		return max(list, index, max);
	}

	private static int max(int[] list, int index, int max) {
		//default
		if (index < 0)
			return max;
		
		//recursions
		else if (list[index] > max) { 
			return max(list, index - 1, list[index]);
		}
		else
			return max(list, index - 1, max);
	}
}