public class GeometricObject {
	private String color;
	private boolean filled;

	//default
	public GeometricObject() {
		color = "placeholder";
	}

	//constructer based on input
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	//return
	public String getColor() {
		return color;
	}

	//set color
	public void setColor(String color) {
		this.color = color;
	}

	//return isFilled
	public boolean isFilled() {
		return filled;
	}

	//set filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	//return string of GeometricObject
	public String toString() {
		return "color: " + color + " filled: " + filled;
	}
}