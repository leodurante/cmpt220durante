//create square class that extends grometciobject and impliments colorable
public class Square extends GeometricObject implements Colorable {
	//data fields
	private double side;

	//constructors
	public Square() {
	}

	public Square(double side) {
		this.side = side;
	}

	public Square(double side, String color, boolean filled) {
		super(color, filled);
		setSide(side);
	}

	public void setSide(double side) {
		this.side = side;
	}

	//accessor
	public double getSide() {
		return side;
	}

	//calculate area
	public double getArea() {
		return Math.pow(side, 2);
	}

	//calcualte perimeter
	public double getPerimeter() {
		return side * 4;
	}

	//define howToColor for square class
	public String howToColor() {
		return "color all four sides";
	}

	public String toString() {
		return super.toString() + "side: " + side + 
				"area: " + getArea() + "perimeter: " + getPerimeter();
	}
}