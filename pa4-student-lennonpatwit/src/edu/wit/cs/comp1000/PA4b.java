package edu.wit.cs.comp1000;

/*********************************************************************
*	Lab 5 - PA4b
*	Paul Lennon
*
*	COMP1000-09  (09/10)
*	10/04/2019   
**********************************************************************
*	Problem Description
*
*	Write a program that reads a month and a date from the user
*	prints out their astrological sign
*
***********************************************************************
*	Analysis
*
*	Inputs:  Two integers, read from the user.
*
*	Outputs: The astrological sign of the date
*
**********************************************************************/

import java.util.Scanner;

public class PA4b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//takes user input
		int month;
		int date;
		System.out.print("Enter your birth month (1-12): ");
		month = input.nextInt();
		System.out.print("Enter your birth day (1-31): ");
		date = input.nextInt();
		
		//checks if inputs are valid
		if((month < 1) || (month > 12)) {
			System.out.println("Month must be between 1 and 12!");
			return;
		}
		if((date < 1) || (date > 31)) {
			System.out.println("Day must be between 1 and 31!");
			return;
		}
		
		//finds horoscope
		if(month == 1) {
			if(date < 20) {
				System.out.println("You are a Capricorn!");
				System.out.println("You will become very rich.");
			}
			else {
				System.out.println("You are an Aquarius!");
				System.out.println("You will live a long life.");
			}
		}
		
		if(month == 2) {
			if(date > 28) {
				System.out.println("Day must be between 1 and 28!");
				return;
			}
			if(date < 19) {
				System.out.println("You are an Aquarius!");
				System.out.println("You will live a long life.");
			}
			else {
				System.out.println("You are a Pisces!");
				System.out.println("You are going to be alone forever.");
			}
		}
		
		if(month == 3) {
			if(date < 21) {
				System.out.println("You are a Pisces!");
				System.out.println("You are going to be alone forever.");
			}
			else {
				System.out.println("You are an Aries!");
				System.out.println("You will own a business.");
			}
		}
		
		if(month == 4) {
			if(date > 30) {
				System.out.println("Day must be between 1 and 30!");
				return;
			}
			if(date < 20) {
				System.out.println("You are an Aries!");
				System.out.println("You will own a business.");
			}
			else {
				System.out.println("You are a Taurus!");
				System.out.println("You will rule the world!");
			}
		}
		
		if(month == 5) {
			if(date < 21) {
				System.out.println("You are a Taurus!");
				System.out.println("You will rule the world!");
			}
			else {
				System.out.println("You are a Gemini!");
				System.out.println("You will die young.");
			}
		}
		
		if(month == 6) {
			if(date > 30) {
				System.out.println("Day must be between 1 and 30!");
				return;
			}
			if(date < 22) {
				System.out.println("You are a Gemini!");
				System.out.println("You will die young.");
			}
			else {
				System.out.println("You are a Cancer!");
				System.out.println("You will have 5 children.");
			}
		}
		
		if(month == 7) {
			if(date < 23) {
				System.out.println("You are a Cancer!");
				System.out.println("You will have 5 children.");
			}
			else {
				System.out.println("You are a Leo!");
				System.out.println("You will get married.");
			}
		}
		
		if(month == 8) {
			if(date < 23) {
				System.out.println("You are a Leo!");
				System.out.println("You will get married.");
			}
			else {
				System.out.println("You are a Virgo!");
				System.out.println("You will be a hermit.");
			}
		}
		
		if(month == 9) {
			if(date > 30) {
				System.out.println("Day must be between 1 and 30!");
				return;
			}
			if(date < 23) {
				System.out.println("You are a Virgo!");
				System.out.println("You will be a hermit.");
			}
			else {
				System.out.println("You are a Libra!");
				System.out.println("You will be a billionaire.");
			}
		}
		
		if(month == 10) {
			if(date < 23) {
				System.out.println("You are a Libra!");
				System.out.println("You will be a billionaire.");
			}
			else {
				System.out.println("You are a Scorpio!");
				System.out.println("You are destin for greatness.");
			}
		}
		
		if(month == 11) {
			if(date > 30) {
				System.out.println("Day must be between 1 and 30!");
				return;
			}
			if(date < 22) {
				System.out.println("You are a Scorpio!");
				System.out.println("You are destin for greatness.");
			}
			else {
				System.out.println("You are a Sagittarius!");
				System.out.println("You are going to do great things.");
			}
		}
		
		if(month == 12) {
			if(date < 22) {
				System.out.println("You are a Sagittarius!");
				System.out.println("You are going to do great things.");
			}
			else {
				System.out.println("You are a Capricorn!");
				System.out.println("You will become very rich.");
			}
		}
		
	}

}
