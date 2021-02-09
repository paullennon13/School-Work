package edu.wit.cs.comp1000;

/*********************************************************************
*	Lab 4 - PA3a
*	Paul Lennon
*
*	COMP1000-09  (09/10)
*	9/27/19 
**********************************************************************
*	Problem Description
*
*	Write a program that reads 5 numbers from the user and
*	prints out the sum, sum of the postive numbers, sum of negative numbers of those 5 numbers.
*	average of positive numbers, average of negative numbers, and average of all numbers
***********************************************************************
*	Analysis
*
*	Inputs:  5 integers, read from the user.
*
*	Outputs: sum, sum of the postive numbers, sum of negative numbers of those 5 numbers.
*	average of positive numbers, average of negative numbers, and average of all numbers.
*
**********************************************************************/

import java.util.Scanner;

public class PA3a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five whole numbers: ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int sum = a + b + c + d + e;
		double avg = (a + b + c + d + e) / 5.0;
		int sum_pos = 0;
		int sum_nonpos = 0;
		double avg_pos = 0.0;
		double avg_nonpos = 0.0;
		int count_pos = 0;
		int count_nonpos = 0;
		
		if(a > 0) {
			sum_pos = sum_pos + a;
			avg_pos = avg_pos + a;
			count_pos = count_pos + 1;
		}
		else {
			sum_nonpos = sum_nonpos + a;
			avg_nonpos = avg_nonpos + a;
		count_nonpos = count_nonpos + 1;
		}
		
		if(b > 0) {
			sum_pos = sum_pos + b;
			avg_pos = avg_pos + b;
			count_pos = count_pos + 1;
		}
		else {
			sum_nonpos = sum_nonpos + b;
			avg_nonpos = avg_nonpos + b;
		count_nonpos = count_nonpos + 1;
		}
		
		if(c > 0) {
			sum_pos = sum_pos + c;
			avg_pos = avg_pos + c;
			count_pos = count_pos + 1;
		}
		else {
			sum_nonpos = sum_nonpos + c;
			avg_nonpos = avg_nonpos + c;
		count_nonpos = count_nonpos + 1;
		}
		
		if(d > 0) {
			sum_pos = sum_pos + d;
			avg_pos = avg_pos + d;
			count_pos = count_pos + 1;
		}
		else {
			sum_nonpos = sum_nonpos + d;
			avg_nonpos = avg_nonpos + d;
		count_nonpos = count_nonpos + 1;
		}
		
		if(e > 0) {
			sum_pos = sum_pos + e;
			avg_pos = avg_pos + e;
			count_pos = count_pos + 1;
		}
		else {
			sum_nonpos = sum_nonpos + e;
			avg_nonpos = avg_nonpos + e;
		count_nonpos = count_nonpos + 1;
		}
		
		String num_pos;
		
		String num_nonpos;
		
		if(count_pos == 1) {
			num_pos = "number";
		}
		else {
			num_pos = "numbers";
		}
		
		if(count_nonpos == 1) {
			num_nonpos = "number";
		}
		else {
			num_nonpos = "numbers";
		}
		
		avg_nonpos = avg_nonpos / count_nonpos;
		avg_pos = avg_pos / count_pos;
		
		if(count_pos == 0) {
			avg_pos = 0.00;
		}
		
		if(count_nonpos == 0) {
			avg_nonpos = 0.00;
		}
		
		System.out.println("The sum of the " + count_pos + " positive " + num_pos + ": " + sum_pos);
		
		System.out.println("The sum of the " + count_nonpos + " non-positive " + num_nonpos + ": " + sum_nonpos);
		
		System.out.println("The sum of the 5 numbers: " + sum);
		
		System.out.printf("The average of the " + count_pos + " positive " + num_pos + ": %.2f%n" , avg_pos);
		
		System.out.printf("The average of the " + count_nonpos + " non-positive " + num_nonpos + ": %.2f%n" , avg_nonpos);
		
		System.out.printf("The average of the 5 numbers: " + "%.2f%n" , avg);

	}

}

