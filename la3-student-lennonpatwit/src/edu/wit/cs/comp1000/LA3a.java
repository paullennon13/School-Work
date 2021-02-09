package edu.wit.cs.comp1000;

import java.util.Scanner;

public class LA3a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n1, n2, n3, sqr;
		String op;
		System.out.print("Enter three numbers: ");
		n1 = in.nextDouble();
		n2 = in.nextDouble();
		n3 = in.nextDouble();
		
		System.out.print("Enter operation: ");
		op = in.next();
		
		double min = 0;
		double l1, l2;
		if(op.equals("min")) {
			if(n1 <= n2 && n1 <= n3) {
				min = n1;
			}
		else if(n2 <= n1 && n2 <= n3) {
			min = n2;
		}
		else if(n3 <= n1 && n3 <= n2) {
			min = n3;
		}
			System.out.printf("min(%.2f, %.2f, %.2f) = %.2f%n", n1, n2, n3, min); 
		}
		else if(op.equals("l1")) {
			l1 = Math.abs(n1) + Math.abs(n2) + Math.abs(n3);
			System.out.printf("l1(%.2f, %.2f, %.2f) = %.2f%n", n1, n2, n3, l1);
		}
		else if(op.equals("l2")) {
			sqr = Math.pow(n1, 2) + Math.pow(n2, 2) + Math.pow(n3, 2);
			l2 = Math.sqrt(sqr);
			System.out.printf("l2(%.2f, %.2f, %.2f) = %.2f%n", n1, n2, n3, l2);
		}
		else {
			System.out.println("Invalid operation!");
		}
		
	}

}
