/**
 * @author Moaz Aamir
 * @date 02/08/2024
 * A system that takes in a specific number of cupcakes, and then subtracts that by the number of students to give us the remaining amount
 */
package ccc;

import java.util.Scanner;

public class CupcakeParty {

	 /**
     * This function will accept user inputs for the cupcake amounts, and then calculate the amount of total cupcakes, and the amount leftover
     * @param args Command Line Arguments
     */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Accept two inputs, one for the regular box and one for small 
		int reg = input.nextInt();
		int sml = input.nextInt();
		
		// Calculates the total number of cupcakes available for distribution 
		int totalCupcakes = (reg * 8 + sml * 3);
		
		// Calculates the total number of cupcakes after the students have had one each
		int cupcakesLeftOver = (totalCupcakes % 28);
		
		System.out.println(cupcakesLeftOver);
		
		// Closes the input to prevent any resource leaks
		input.close();
		}
		
	}