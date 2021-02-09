/*********************************************************************
*	Lab 6 - PA5b
*	Paul Lennon
*	
*   COMP1000-09  (09/10)
*	10/18/2019   
*
**********************************************************************
*	Problem Description
*
*	Create a guessing game where the user guesses a number between 1-100
*
***********************************************************************
*	Analysis
*
*	Inputs:  number from 1-100
*
*	Outputs: Too high! Too low! invalid! You win!
*
**********************************************************************/

package edu.wit.cs.comp1000;

import java.util.Random;
import java.util.Scanner;

public class PA5b {

	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////////////////////
		// DO NOT CHANGE IN FINAL SUBMISSION
		//////////////////////////////////////////////////////////////////////////////
		
		Long seed;
		if (args.length != 1) {
			seed = null; // you can temporarily change this to assist in debugging
			             // the value must end in L, such as 1070L
		} else {
			seed = Long.valueOf(args[0]);
		}
		
		// Gets a random number between 1 and 100
		// Use the target variable as the correct answer for guessing
		Random random;
		if (seed == null) {
			random = new Random();
		} else {
			random = new Random(seed);
		}
		int target = (Math.abs(random.nextInt()) % 100) + 1;
		
		//////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////
		
		
		
		Scanner input = new Scanner(System.in);
		boolean win = false;
		int guess;
		
		while(win == false) {
		System.out.print("Enter your guess (between 1 and 100): ");
		guess = input.nextInt();
	
			if(guess > 100 || guess < 1) {
				System.out.println("Invalid guess, try again!");
			}
			if(guess < target && guess > 0) {
				System.out.println("Too low!");
			}
			if(guess > target && guess < 101) {
				System.out.println("Too high!");
			}
		if(guess == target) {
			win = true;
		}
		}
		System.out.println("You win!");
	}

}
