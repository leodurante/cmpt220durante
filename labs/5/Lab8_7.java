package lab5;

public class Lab8_7 {

	public static void main(String[] args) {

		//create array with specific points
		double[][] points = {{-1, 0, 3}, {-1, -1, -1}, 
				{4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};

		//create starting point int
		int p1 = 0, p2 = 1, p3 = 3;
		double shortestDistance = distance(points[p1][0], 
				points[p1][1], points[p1][2], points[p2][0], points[p2][p1], points[p3][p2]); 

		//find the distances between every two points
		for (int x = 0; x < points.length; x++) {
			for (int y = x + 1; y < points.length; y++) {
				double distance = distance(points[x][0], 
						points[x][1], points[x][2], points[y][0], points[y][1], points[y][2]); 

				if (shortestDistance > distance) {
					p1 = x; 
					p2 = y; 
					shortestDistance = distance; 
				}
			}
		}

		//print results
		System.out.println("The closest two points are" +
			"(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
				points[p2][0] + ", " + points[p2][1] + ")");
	}

	//create a method to calculate distances between points
	public static double distance(
		double x1, double y1, double z1, double x2, double y2, double z2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) +  
			Math.pow(y2 - y1, 2) + Math.pow(y2 - y1, 2));
	}
}