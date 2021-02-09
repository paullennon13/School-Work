/*********************************************************************
*	Lab 6 - PA5a
*	Paul Lennon
*	
*   COMP1000-09  (09/10)
*	10/18/2019   
*
**********************************************************************
*	Problem Description
*
*	Write a program that adjusts costs for inflation
*
***********************************************************************
*	Analysis
*
*	Inputs:  cost # of years inflation rate
*
*	Outputs: cost of item over how many years
*
**********************************************************************/

package edu.wit.cs.comp1000;

import java.util.Scanner; 

public class PA5a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the current price of the item: $");
		double price = input.nextDouble();
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		System.out.print("Enter the inflation rate as a percentage: ");
		double inf = input.nextDouble();
		
		if(price < 0) {
			System.out.println("The current price must be at least 0!");
			return;
		}
		if(years < 0) {
			System.out.println("The number of years must be at least 0!");
			return;
		}
		if(inf < 0) {
			System.out.println("The inflation rate must be at least 0!");
			return;
		}
		
		inf = inf / 100.0;
		
		int count = 0;
		while(count < years) {
			price = price * (1 + inf);
			count ++;
		}
		
		if(years == 1) {
			System.out.printf("After %d year, the price will be $%.2f%n", years, price);
			return;
		}
		
		System.out.printf("After %d years, the price will be $%.2f%n", years, price);
	}

}
