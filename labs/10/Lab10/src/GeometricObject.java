
public abstract class GeometricObject {
	//data field
	private String color = "";
	private boolean filled;

	//constructors
	protected GeometricObject() {
	}

	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	//accesor for color
	public String getColor() {
		return color;
	}

	//set a new color
	public void setColor(String color) {
		this.color = color;
	}

	//return boolean filled as isFilled
	public boolean isFilled() {
		return filled;
	}

	//reset filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	//return values color and filled in string
	public String toString() {
		return "color: " + color + " and filled: " + filled;
	}

	//abstract getArea
	public abstract double getArea();

	//abstract getPerimeter
	public abstract double getPerimeter();
}