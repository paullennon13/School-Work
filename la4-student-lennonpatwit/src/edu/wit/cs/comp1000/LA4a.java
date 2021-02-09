package edu.wit.cs.comp1000;

import java.util.Scanner;

public class LA4a {
	
	/**
	 * Error to output if either input is not positive
	 */
	static final String E_POSITIVE = "Inputs must both be positive.";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a, b;
		System.out.print("Enter a: ");
		a = in.nextInt();
		System.out.print("Enter b: ");
		b = in.nextInt();
		if(a <= 0 || b <= 0) {
			System.out.println(E_POSITIVE);
			return;
		}
		int gcd = gcd(a, b);
		System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
	}
	
	/**
	 * Returns the greatest common denominator (gcd) of two positive integers
	 * 
	 * @param num1 integer 1
	 * @param num2 integer 2
	 * @return gcd of integers 1 and 2
	 */
	public static int gcd(int num1, int num2) {
		int mod;
		if(num1 > num2) {
		while(num2 != 0) {
			mod = num2;
			num2 = num1 % num2;
			num1 = mod;
		}
		return num1;
		}
		else {
			while(num1 != 0) {
				mod = num1;
				num1 = num2 % num1;
				num2 = mod;
			}
			return num2;
		}
	}

}
