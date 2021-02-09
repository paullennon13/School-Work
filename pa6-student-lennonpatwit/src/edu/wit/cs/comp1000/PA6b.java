/*********************************************************************
*	Lab 8 - PA6b
*	Paul Lennon
*	
*   COMP1000-09  (09/10)
*	10/25/2019   
*
**********************************************************************
*	Problem Description
*
*	find the sum of non negative numbers
*
***********************************************************************
*	Analysis
*
*	Inputs:  As many integers as user inputs, read from the user.
*
*	Outputs: The average of the inputs.
*
**********************************************************************/

package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA6b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean stop = false;
		double avg;
		String a;
		while(stop != true){
		System.out.print("Enter a stream of non-negative numbers (negative when finished): ");
		avg = getavg(in);
		System.out.printf("The average is: %.2f%n", avg);
		System.out.print("Do you want to compute another average (y/n)? ");
		a = in.next();
		if(a.equals("N") || a.equals("n")) {
			stop = true;
			break;
			}
		else if(a.equals("Y") || a.equals("y")) {
			continue;
		}
		else{
			System.out.println("invalid input!");
			continue;
		}
		}
		
	}

	public static double getavg(Scanner in) {
		double i, n = in.nextDouble();
		double sum = 0.0, avg = 0;
	for(i = 0.0; n > 0 ; i++) {
		sum = sum + n;
		n = in.nextDouble();
	}
	avg = sum / i;
	if(i == 0) {
		avg = 00.0;
	}
	return avg;
	}
}
