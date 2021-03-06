public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	//default triangle of side length 1.0
	Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	//constructor that creates a triangle with specified sides
	Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//accessor methods
	public double getside1(){
		return side1;
	}
	
	public double getside2(){
		return side2;
	}
	
	public double getside3(){
		return side3;
	}
	
	//perimeter 
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	//calculate & return area
	public double getArea() {
		return Math.sqrt(getPerimeter()/2 * (getPerimeter()/2 - side1) * 
				(getPerimeter()/2 - side2) * (getPerimeter()/2 - side3)); // JA
	}
	
	//method named toString() that returns a 
	//string description for a triangle ('return' from textbook)
	public String getString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}
}