package lab1;

import java.util.Scanner;

public class Gratuity25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//get subtotal and gratuity % from user
		System.out.print("Enter the subtotal ");
		double Subtotal = input.nextDouble();
		
		//get gratuity % from user
		System.out.print("Enter the gratuity ");
		double Gratuity = input.nextDouble();
		
		//convert user gratuity into percentage
		double Gratuitypercent = (Gratuity) * (0.01);
		
		//calculate tax
		double Tax = (Gratuitypercent) * (Subtotal);
		
		//Calculate total
		double total = (Tax + Subtotal);
		System.out.println("Total is " + total + "$");

	}

}
