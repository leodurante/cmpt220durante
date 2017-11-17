
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	private double side;

	public Octagon() {
	}

	//octogon contrructor
	public Octagon(double side) {
		this.side = side;
	}

	//set side
	public void setSide(double side) {
		this.side = side;
	}

	//return side
	public double getSide() {
		return side;
	}

	//return area of octagon
	public double getArea() {
		//use given formula
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	//return perimeter of octagon
	public double getPerimeter() {
		return 8 * side;
	}

	//compareTo
	public int compareTo(Octagon octagon) {
		if (getArea() > octagon.getArea())
			return 1;
		else if (getArea() < octagon.getArea())
			return -1;
		else
			return 0;
	}

	//override and return super/ increase accessibility
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	//return string of octogon properties
	public String toString() {
		return super.toString() + "area " + getArea() + "perimeter " + getPerimeter();
	}
}