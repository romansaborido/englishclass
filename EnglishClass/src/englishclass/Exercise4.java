package englishclass;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		// I create the variable randomNumber where will store the random mumber
		int randomNumber = (int) (Math.random() * 99) + 1;
		
		// I create the variable number where will store the number that user will introduce
		int number;
		
		// I create the scanner
		Scanner reader = new Scanner(System.in);
		
		// I ask the user to enter a number from 1 to 100
		System.out.println("Introduce a number from 1 to 100, you have to guess the number");
		number = reader.nextInt();
		
		// I create the loop: if the number is equal than the randomNumber, the loop will finish
		while (number != randomNumber) {
			
			if (number < randomNumber) {
				System.out.print("The number is less than the number to guess. ");
			} else {
				System.out.print("The number is bigger than the number to guess. ");
			}
		
			System.out.println("Try again");
			number = reader.nextInt();
		}
		
		System.out.println("Congratulations, you got the number right");
		
		// I close the scanner
		reader.close();
		
		
	}

}
