package englishclass;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		// I create the variable number where will store the number that the user will introduce
		int number;
		
		// I create the scanner
		Scanner reader = new Scanner(System.in);
		
		// I ask the user to enter the number
		System.out.println("Introduce a whole positive number, if you want to stop, introduce a negative number");
		number = reader.nextInt();
		
		// I create the loop: if the number is bigger than 0, the loop will continue to run
		while (number >= 0) {
			
			// If the number is divisible by 2, the number is even
			if (number % 2 == 0) {
				System.out.println("The number that you have introduced is even");
			} else {
				System.out.println("The number that you have introduced is odd");
			}
			
			System.out.println("Introduce a whole positive number");
			number = reader.nextInt();
		}
		
		// End of the program
		System.out.println("End of the program");
		
		// I close the scanner
		reader.close();

		
	}

}
