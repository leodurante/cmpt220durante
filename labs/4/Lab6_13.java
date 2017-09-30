package lab4;

public class Lab6_13 {

	public static void main(String[] args) {
		//display table up to i=20
		double start = 1.0;
		double total = 20.0;
		
		//format head of table
		System.out.println("i          m(i)");
		
		//display table
		for (double i = start; i <= total; i++) {
			System.out.printf("%-10.0f", i);
			System.out.printf("%7.4f\n", series(i));
		}
	}
	//create series method
	public static double series(double n) {
		double sum = 0;
		for (double i = 1; i <= n; i++) {
				sum += i / (i + 1);
		}
		return sum;
	}

}
