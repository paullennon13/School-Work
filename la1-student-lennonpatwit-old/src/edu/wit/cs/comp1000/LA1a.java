package edu.wit.cs.comp1000;

import java.util.Scanner;

public class LA1a {

	public static void main(String[] args) {
		//Sets up Scanner
		Scanner input = new Scanner(System.in);
		
		//Asks user to input 5 values
		System.out.print("Enter five numbers: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		
		//finds sum
		double sum = a + b + c + d + e;
		
		//finds mean
		double mean = sum / 5.0;
		
		//finds population standard deviation
		double difa = a - mean;
		double difb = b - mean;
		double difc = c - mean;
		double difd = d - mean;
		double dife = e - mean;
		double square = Math.pow(difa,2) + Math.pow(difb,2) + Math.pow(difc,2) + Math.pow(difd,2) + Math.pow(dife,2);
		double meanb = square / 5.0;
		double psd = Math.sqrt(meanb);
		
		//prints out findings
		System.out.printf("Sum: %.2f%n", sum);
		System.out.printf("Mean: %.2f%n", mean);
		System.out.printf("Population Standard Deviation: %.2f%n", psd);
		
	}

}
