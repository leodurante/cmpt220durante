package lab3;

public class Leo513 {

	public static void main(String[] args) {
		//create n
		int n = 0;
		
		//solve for highest value of n^3 while less than 12000
		while (Math.pow(n + 1, 3) < 12000) {
			//increase n until answer is found
			n++; 
		}
		
		//display result
		System.out.println("The highest value of n below 12000 is " + n);
		
	}

}
