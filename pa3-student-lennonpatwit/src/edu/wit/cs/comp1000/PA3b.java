package edu.wit.cs.comp1000;

/*********************************************************************
*	Lab 4 - PA3b
*	Paul Lennon
*
*	COMP1000-09  (09/10)
*	9/27/2019  
**********************************************************************
*	Problem Description
*
*	Write a program that solves the quadratic equation
*
***********************************************************************
*	Analysis
*
*	Inputs:  three integers, read from the user.
*
*	Outputs: roots of the equation
*
**********************************************************************/

import java.util.Scanner;

public class PA3b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a b c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double disc = (Math.pow(b, 2)) - (4*a*c);
		double root1;
		double root2;
		if(disc < 0) {
			System.out.println("Roots: imaginary");
		}
		if (disc == 0) {
			root1 = -b / (2*a);
			System.out.printf("Root: " + "%.2f%n", root1);
		}
		if(disc > 0) {
			root1 = (-b - Math.sqrt(disc)) / (2*a);
			root2 = (-b + Math.sqrt(disc)) / (2*a);
		System.out.printf("Roots: " + "%.2f, %.2f%n", root1, root2);
	}

}
}