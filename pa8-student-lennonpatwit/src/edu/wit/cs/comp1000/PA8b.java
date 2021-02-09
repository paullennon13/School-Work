/*********************************************************************
*	Lab 11 - PA8b
*	Paul Lennon
*	COMP1000-09  (09/10)
*	11/18/2019  
*
**********************************************************************
*	Problem Description
*
*	Write a program that reads characters and outputs how many of what character you inputed
*
***********************************************************************
*	Analysis
*
*	Inputs:  string
*
*	Outputs: number of letters you input
*
**********************************************************************/

package edu.wit.cs.comp1000;

import java.util.Scanner;

//TODO: document this class
public class PA8b {

	/**
	 * Program execution point:
	 * input text via console input,
	 * output counts for each letter
	 * found in the input (case-insensitive)
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter text: ");
		int[] nums = new int[26];
		char holder;
		int val;
		int i;
		while(in.hasNextLine() == true) {
			String input = in.nextLine();
			for(i = 0; i < input.length(); i++) {
				holder = input.charAt(i);
				if(Character.isLetter(holder) == true) {
					val = (int) holder;
					if(val >= 97) {
						val = val - 97;
					}
					else {
						val = val - 65;
					}
					nums[val]= nums[val] + 1;
				}
			}
		}
		int a = 0;
		for(i = 0; i < 26; i++) {
			if(nums[i] > 0) {
				val = i + 65;
				holder = (char) val;
				System.out.println(holder + ": " + nums[i]);
				a++;
			}
		}
		if(a == 0) {
			System.out.println();
		}
	}

}
