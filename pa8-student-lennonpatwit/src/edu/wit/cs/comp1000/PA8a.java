/*********************************************************************
*	Lab 11 - PA8a
*	Paul Lennon
*	COMP1000-09  (09/10)
*	11/15/2019 
*
**********************************************************************
*	Problem Description
*
*	Write a program that reads an undefined amount of numbers and
*   prints out the numbers above the average
*
***********************************************************************
*	Analysis
*
*	Inputs:  n integers, read from the user.
*
*	Outputs: numbers above average of numbers
*
**********************************************************************/

package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA8a {

	/**
	 * Reads all values from the provided scanner into the supplied array (up to its
	 * size) and returns the number of integers read
	 * 
	 * @param input
	 *            input source
	 * @param nums
	 *            destination for read integers
	 * @return number of integers read
	 */
	public static int readIntoArray(Scanner input, int[] nums) {
		int i = 0;
		 for(i = 0; i < 100; i++){
			if(input.hasNextInt() == true) {	
			nums[i] = input.nextInt();
			}
			else {
				input.close();
				return i;
			}
		}
		 return i;
	}

	/**
	 * Prints to the screen the average of the supplied array, up to the supplied
	 * size, and all integers in the array, again up to the supplied size, that are
	 * larger than the average
	 * 
	 * @param nums
	 *            array of numbers
	 * @param size
	 *            number of valid elements
	 */
	public static void printAboveAverage(int[] nums, int size) {
		double avg, sum = 0.0;
		  int i;
		  for(i=0; i < size; i++) {
			  sum = sum + nums[i];
		  }
		  avg = sum / size;
		  if(size == 0) {
			  avg = 0.00;
		  }
		  
		  System.out.printf("Average: %.2f%n", avg);
		  int aboveavg = 0;
		  System.out.print("Values above average: ");
		  for(i = 0; i < size; i++) {
			  if(nums[i] > avg && aboveavg != 0) {
				  System.out.print(", ");
			  }
			  if(nums[i] > avg) {
				  System.out.printf("nums[%d]=%d", i, nums[i]);
				  aboveavg++;
			  }
		  }
		  if(aboveavg == 0) {
				  System.out.print("none");
			  }
		  System.out.println();
		  return;
	}

	/**
	 * Program execution point: input a sequence of integers (up to 100), output
	 * average of integers and those over the average
	 * 
	 * @param args
	 *            command-line arguments (ignored)
	 */
	public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  
	  int[] a = new int[100];
	  System.out.print("Enter up to 100 integers: ");
	  int numint = readIntoArray(in, a);
	  printAboveAverage(a, numint);
	}

}
