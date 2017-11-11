import java.util.Scanner;

public class Lab12_3 {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//invoke method
		int[] array = getArray();
		
		//prompt user for input
		System.out.println("enter the index of the array");
		
		//display results
		try{System.out.println("the corrosponding element value to your input is "
								+ array[input.nextInt()]);
		}
		//"if the specified index is out of bounds, display the message out of bounds"
		//catch the out of bounds error and create a response
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("out of bounds");
		}

	}
	
	//creates an array with 100 random numbers
	public static int[] getArray(){
		//specify the length of the generated arrays
		int[] array = new int[100];
		//use a for loop and math.random*100 to create an array of random values
		for(int n = 0; n < array.length; n++){
			array[n] = (int)(Math.random()*100)+1;
			
		}
		//return the resulting array
		return array;
		
	}

}
