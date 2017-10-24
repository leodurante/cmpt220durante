package lab6;

import java.util.Date;

public class lab9_3 {

	public static void main(String[] args) {
		//create date object under class java.until.date
		Date date = new Date();
		
		//create a for loop to multiply 10000 by ten until you reach 
		//100000000000
		//create a value to keep track of time elapsed
		//i removed 4 zeroes from the values so it could fit in integer
		for (long elapsed = 1000L; elapsed <= 100000000000L; elapsed *= 10){ // JA
			//print elapsed time with toString within loop
			date.setTime(elapsed); //JA
			System.out.println(date.toString());
		}
		

	}

}
