package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// Set up Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of inches: ");
		
		int inches = input.nextInt();
		
		int yards = (inches / 36);
		
		int feet = (inches - (yards*36)) /12;
		
		inches = (inches - (yards * 36)) - (feet * 12);
		
		System.out.println("Yards: " + yards);
		
		System.out.println("Feet: " + feet);
		
		System.out.println("Inches: " + inches);
		}

}
