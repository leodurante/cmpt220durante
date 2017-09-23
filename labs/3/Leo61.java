package lab3;

public class Leo61 {

	public static void main(String[] args) {
		//display 100 numbers
		int numofpent = 100;
		
		//limiter per line value
		int numlines = 10; 

		//display numbers
		for (int x = 1; x <= numofpent; x++) {
			//limit per line
			if (x % numlines == 0) 
				System.out.printf("%7d\n", getPentagonalNumber(x));
			else
				System.out.printf("%7d", getPentagonalNumber(x));
		}
	}

	//pentaganol numbers creator
	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1)) / 2;
	

	}

}
