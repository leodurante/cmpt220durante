package lab1;

import java.util.Scanner;

public class Degree21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//get temperature from user
		System.out.print("Enter a temperate in farenheit ");
		double fahrenheit = input.nextDouble();
		
		//Convert to celcius
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in celsius. ");



	}

}
