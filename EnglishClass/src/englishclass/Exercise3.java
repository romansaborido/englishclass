package englishclass;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		// I create the variable height where will store the height that user will introduce
		double height = 0;
		
		// I create the variable heightMin where will store the minimum height that user will introduce
		double heightMin = height;
		
		// I create the variable heightMax where will store the maximum height that user will introduce 
		double heightMax = height;
		
		// I create the scanner
		Scanner reader = new Scanner(System.in);
		
		// I ask the user to enter the height 
		System.out.println("Introduce the height in meters, if you want to stop, enter 0");
		height = reader.nextDouble();
		
		// I create the loop: while the number be bigger than 0, the loop will continue to run
		while (height > 0) {
			
			// If the height is bigger than heightMax, the variable will update 
			if (height > heightMax)
				heightMax = height;
			
			// I ask the user to enter the height
			System.out.println("Introduce the height in meters, if you want to stop, enter 0");
			height = reader.nextDouble();
			
			// If the height is less than heightMin, the variable will update 
			if (height < heightMin && height > 0)
				heightMin = height;
		}
		
		// I show the results
		if (height <= 0) {
			System.out.println("End the program");
		} else {
		System.out.println("The minimum height is: " + heightMin);
		System.out.println("The maximum height is: " + heightMax);
		}
		
		// I close the scanner
		reader.close();
		
		// Corregir
		
	
	}

}
