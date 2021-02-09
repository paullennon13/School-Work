package edu.wit.cs.comp1000;

/*********************************************************************
*	Lab 5 - PA4a
*	Paul Lennon
*
*	COMP1000-09  (09/10)
*	10/04/2019   
**********************************************************************
*	Problem Description
*
*	Write a program that reads 3 numbers and finds the semiperimeter
*	then use the semiperimeter to find the area
*
***********************************************************************
*	Analysis
*
*	Inputs:  3 sides
*
*	Outputs: semiperimeter and area
*
**********************************************************************/

import java.util.Scanner;

public class PA4a {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Taking input from user
		double a;
		double b;
		double c;
		System.out.print("Enter the length of side a: ");
		a = input.nextDouble();
		System.out.print("Enter the length of side b: ");
		b = input.nextDouble();
		System.out.print("Enter the length of side c: ");
		c = input.nextDouble();
		
		//testing if positive and if side lengths work
		if((a == 0) || (b == 0) || (c == 0)) {
			System.out.println("Side can not equal 0");
			return;
		}
		if((a <= 0) || (b <= 0) || (c <= 0)) {
			System.out.println("Side lengths must all be positive");
			return;
		}
		if(a + b < c) {
			System.out.println("Side c is too long");
			return;
		}
		if(a + c < b) {
			System.out.println("Side b is too long");
			return;
		}
		if(b + c < a) {
			System.out.println("Side a is too long");
			return;
		}
		
		//semiperimeter
		double semi = (a + b + c) / 2;
		
		//area
		double area;
		double sqrt = semi * (semi - a) * (semi - b) * (semi - c);
		area = Math.sqrt(sqrt);
		
		//prints answer
		System.out.printf("The area is %.2f%n" , area);
		
	}

}
