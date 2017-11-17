
public class Lab13_11 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		//create new octagon with side values 5 as instructed
		Octagon octagon1 = new Octagon(5);

		//display it's area and periemter
		System.out.println("octagon area: " + octagon1.getArea() + 
			" & perimeter: " + octagon1.getPerimeter());

		// Create new object using the clone method
		Octagon octagon2 = (Octagon)octagon1.clone();

		// Compare the two object using compareTo method
		int result = (octagon1.compareTo(octagon2));
		if (result == 1)
			System.out.println("greater than clone");
		else if (result == -1)
			System.out.println("less than clone"); 
		else
			System.out.println("equal to clone");
	}
}