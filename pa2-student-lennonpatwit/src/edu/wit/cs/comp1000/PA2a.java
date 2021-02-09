package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		
		//Set up Scanner
		Scanner input = new Scanner(System.in);
		
		//Takes input from user
		System.out.print("Enter number of yards: ");
		int yards = input.nextInt();
		
		System.out.print("Enter number of feet: ");
		int feet = input.nextInt();
		
		System.out.print("Enter number of inches: ");
		int inches = input.nextInt();
		
		//Converts to inches
		inches = inches + (yards * 36 ) + (feet * 12);
		
		//prints out total
		System.out.println("Total number of inches: " + inches);
	}

}
