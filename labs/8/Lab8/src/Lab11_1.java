import java.util.Scanner;

public class Lab11_1 {
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);

		//prompt user for input
		System.out.print("enter three side of a triangle: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();
		System.out.print("Enter a color: ");
		String color = input.next();
		System.out.print("is the triangle filled true or false:  ");
		boolean filled = input.nextBoolean();

		//create triangle from inputed values
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		//print results
		System.out.println("the area is " + triangle.getArea());
		System.out.println("the perimeter is " + triangle.getPerimeter());
		System.out.println("the color is " + triangle.getColor());
		System.out.println("the triangle is" + (triangle.isFilled() ? "" : " not ") + "filled");
		System.out.println(triangle.toString());
	}
}