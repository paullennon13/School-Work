/*********************************************************************
*	Lab 9 - PA7a
*	Paul Lennon
*
*	COMP1000-09  (09/10)
*	11/1/2019   
*
**********************************************************************
*	Problem Description
*
*	Write a program that takes the year and what day January starts on and prints out a whole calendar
*
***********************************************************************
*	Analysis
*
*	Inputs:  Two integers, read from the user.
*
*	Outputs: calendar of year and start date
*
**********************************************************************/

package edu.wit.cs.comp1000;

import java.util.Scanner;  

public class PA7a {
	
	/**
	 * Error to output if year is not positive
	 */
	static final String E_YEAR = "The year must be positive!";
	
	/**
	 * Error to output if the day is not between 0 and 6
	 */
	static final String E_DAY = "The day of January 1st must be between 0 and 6!";
	
	/**
	 * Determines if an input is a leap year
	 * 
	 * @param year year in question
	 * @return true if a leap year
	 */
	public static boolean isLeapYear(int year) {
		if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Outputs a month to the console
	 * 
	 * @param month title
	 * @param startDay 0=Sunday ... 6=Saturday
	 * @param numDays number of days in the month
	 * @return day of the week of the last day of the month
	 */
	public static int printMonth(String month, int startDay, int numDays) {
		System.out.println(month);
		int i, a=0;
		for(i = 0; i < startDay; i++) {
			System.out.print("   ");
			if(startDay == 0) {
				System.out.print(" ");
			}
			}
		for(i = 1; i <= numDays; i++) {
			System.out.printf("%3d", i);
				a = startDay + i;
				if(a%7 == 0) {
					System.out.println();
			}
			
			
		}
		if(a % 7 != 0) {
			System.out.println();
		}
		System.out.println();
		startDay =  (numDays + startDay)%7;
		return startDay;
	}

	/**
	 * Program execution point:
	 * input year, day of the week (0-6) of January 1
	 * output calendar for that year
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int years, startday;
		System.out.print("Enter the year: ");
		years = in.nextInt();
		System.out.print("Enter the day of the week of January 1st (0=Sunday, 1=Monday, ... 6=Saturday): ");
		startday = in.nextInt();
		
		if(years < 0) {
			System.out.println(E_YEAR);
			return;
		}
		if(startday < 0 || startday > 6) {
			System.out.println(E_DAY);
			return; 
		}
		
		boolean leapyear = isLeapYear(years);
		
		String[] months = {"", 
				"January", "February", "March", "April", 
				"May", "June", "July", "August", 
				"September", "October", "November", "December"
		};
		int[] days = {
	            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	        };
		
		if(leapyear == true) {
			days[2] = 29;
		}
		
		
		int i;
		for(i=1; i <= 12; i++) {	
		startday = printMonth(months[i], startday, days[i]);
		}
	}

}
