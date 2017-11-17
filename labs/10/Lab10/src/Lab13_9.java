
public class Lab13_9 {

	public static void main(String[] args) {
		//create 2 circles
		Circle circle1 = new Circle(1);
		Circle circle2 = new Circle(2);

		//display results
		System.out.println("circle 1 radius: " + circle1.getRadius());
		System.out.println("circle 2 radius: " + circle2.getRadius());
		System.out.println("circle 1 equals circle 2: " + (circle1.equals(circle2)));

	}
}