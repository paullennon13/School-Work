package edu.wit.cs.comp1000;

import java.util.Scanner;

public class LA2a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of sides: ");
		double n = input.nextDouble();
		System.out.print("Enter side length: ");
		double s = input.nextDouble();
		
		if(n < 3) {
			System.out.println("A polygon must have at least 3 sides.");
			return;
		}
		if(s <= 0) {
			System.out.println("Side length must be positive.");
			return;
		}
		
		double area = (Math.pow(s, 2) * n) / (4 * Math.tan(Math.PI / n));
		double p = n * s;
		double angle = 180 - (360.0 / n);
		
		System.out.printf("Area: %.3f%n", area);
		System.out.printf("Perimeter: %.3f%n", p);
		System.out.printf("Interior Angle: %.3f degrees%n", angle);
	}

}
