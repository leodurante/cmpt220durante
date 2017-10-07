package lab5;

import java.util.Scanner;

public class Lab8_11 {

	public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        //create array
        int[][] a = new int[3][3];
        
        //prompt user for input
        System.out.print("Enter a number between 0 and 511: ");
        int n = input.nextInt();
        String binary = decimalToBinaryModified(n);

        //assign 0s & 1s w/ binary index
        int bIndex = 0;
        for (int x = 0; x < a.length; x++) {
            for (int k = 0; k < a[x].length; k++) {
                int side = (binary.charAt(bIndex++) == '0') ? 0 : 1;
                a[x][k] = side;
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                char ch = (a[i][k] == 0) ? 'H' : 'T';
                System.out.print(ch + " ");
            }
            System.out.println("");
        }

    }
	
	//create method decimalToBinaryModified
    public static String decimalToBinaryModified(int n) {

        StringBuilder s = new StringBuilder();
        while (n != 0) {
            s.append(n & 1);
            n = n >> 1;
        }
        while (s.length() < 9) {
            s.insert(0, "0");
        }
        return s.toString();
    }


}