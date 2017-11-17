
public class Circle extends GeometricObject implements Comparable<Circle>{
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, 
		String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	//return radius
	public double getRadius() {
		return radius;
	}

	//set a new radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	//return area
	public double getArea() {
		return radius * radius * Math.PI;
	}

	//reaturn diameter
	public double getDiameter() {
		return 2 * radius;
	}

	//return perimeter
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	//check if radius are equal
	public boolean equals(Object circle) {
		return this.compareTo((Circle)circle) == 0;
	}

	//invoke compareTo
	public int compareTo(Circle circle) {
		if (this.radius > circle.radius)
			return 1;
		else if (this.radius < circle.radius)
			return -1;
		else
			return 0;
	}

	//create string
	public String toString() {
		return super.toString() + "radius: " + radius;
	}
}


