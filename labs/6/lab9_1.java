package lab6;

public class lab9_1 {

	public static void main(String[] args) {
		//create a rectangle of height and width 1
		Rectangle rectangle1 = new Rectangle();
		//display everything in order
		System.out.println("the width of this rectangle is "
		+ rectangle1.width + " the height is " + rectangle1.height 
		+ " the area is " + rectangle1.getArea() 
		+ " and the perimiter is " + rectangle1.getPerimiter());
		
		//create a rectangle with height of 40 and width of 4
		Rectangle rectangle2 = new Rectangle(4, 40);
		//display all that in order
		System.out.println("the width of this rectangle is "
		+ rectangle2.width + " the height is " + rectangle2.height 
		+ " the area is " + rectangle2.getArea() 
		+ " and the perimiter is " + rectangle2.getPerimiter());
		
		//create a rectangle with width of 3.5 and height of 35.9
		Rectangle rectangle3 = new Rectangle(3.5, 35.9);
		//display
		System.out.println("the width of this rectangle is "
		+ rectangle3.width + " the height is " + rectangle3.height 
		+ " the area is " + rectangle3.getArea() 
		+ " and the perimiter is " + rectangle3.getPerimiter());
	}
	
	//(the rectangle class)
	//set to static because main class is static
	static class Rectangle {
		//create two double data fields for width and height with default
		//values of 1 for both
		double width = 1;
		double height = 1;
	
		//construct a rectangle object with height and width 1
		Rectangle() {
			width = 1;
			height = 1;
		}
		
		//create a rectangle with a specified radius
		Rectangle(double newheight, double newwidth){
			width = newwidth;
			height = newheight;
		}

		//create method getArea()
		double getArea(){
			return width * height;
		}
				
		//create method getPerimiter()
		double getPerimiter(){
			return width + width + height + height;
		}

	}

}
