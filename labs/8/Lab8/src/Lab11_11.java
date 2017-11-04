import java.util.Scanner;
import java.util.ArrayList;

public class Lab11_11 {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//craete an array list of integers
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//prompt user for 5 numbers
		System.out.print("enter 5 numbers");
		list.add(input.nextInt());
		list.add(input.nextInt());
		list.add(input.nextInt());
		list.add(input.nextInt());
		list.add(input.nextInt());
		
		//sort
		sort(list);
		
		//display list in order
		System.out.print(list.toString());

	}
	
	//create sort
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);
	}

}
