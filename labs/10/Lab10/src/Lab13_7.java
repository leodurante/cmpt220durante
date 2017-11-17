
public class Lab13_7 {

	public static void main(String[] args) {
		//create an array of squares
		GeometricObject[] squares = {new Square(1), new Square(2), 
			new Square(3), new Square(4), new Square(5)};

		//use for loop to display for entire array of squares
		for (int n = 1; n < squares.length; n++) {
		 	System.out.println("area:" + squares[n].getArea());
		 	System.out.println("how to color: " + ((Square)squares[n]).howToColor());
		 	System.out.println("");
		 } 
	}
}