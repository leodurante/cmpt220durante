//import array list
import java.util.ArrayList;

public class lab13_3 {
	public static void main(String[] args) {
		//create arraylist
		ArrayList<Number> list = new ArrayList<>();

		//add numbers to list
		list.add(2.0);
		list.add(3.0);
		list.add(5.0);
		list.add(6.0);
		list.add(-1.0);
		list.add(0.0);
		
		//print string
		System.out.println(list.toString());

		//sort the list
		sort(list);

		//print sorted list
		System.out.println(list.toString());
	}

	//sort the numbers in the listarray
	public static void sort(ArrayList<Number> list) {
		//for loop to find min number repeatedly
		for (int n = 0; n < list.size() - 1; n++) {
			//find min number
			Number min = list.get(n);
			int minIndex = n;

			//craete a for loop with new variable to find
			//number above already found min
			for (int x = n + 1; x < list.size(); x++) {
				if (min.doubleValue() > list.get(x).doubleValue()) {
					min = list.get(x);
					minIndex = x;
				}
			}

			//swap get.(n) with get.(minIndex) when required
			if (minIndex != n) {
				list.set(minIndex, list.get(n));
				list.set(n, min);
			} 
		}
	}
}