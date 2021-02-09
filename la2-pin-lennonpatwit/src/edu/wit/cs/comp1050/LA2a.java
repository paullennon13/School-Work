package edu.wit.cs.comp1050;

import java.util.Scanner;

public class LA2a {
	
	/**
	 * Number of digits in a valid value sequence
	 */
	public static final int SEQ_DIGITS = 10;
	
	/**
	 * Error for an invalid sequence
	 * (not correct number of characters
	 * or not made only of digits)
	 */
	public static final String ERR_SEQ = "Invalid sequence";
	
	/**
	 * Error for an invalid pin
	 * (not made entirely of 
	 * uppercase letters)
	 */
	public static final String ERR_PIN = "Invalid PIN";
	
	/**
	 * Converts an uppercase letter
	 * to the corresponding number on
	 * a standard phone
	 * 
	 * 1:
	 * 2: ABC
	 * 3: DEF
	 * 
	 * 4: GHI
	 * 5: JKL
	 * 6: MNO
	 * 
	 * 7: PQRS
	 * 8: TUV
	 * 9: WXYZ
	 * 
	 * *:
	 * 0: +
	 * #:
	 * 
	 * @param c assumed to be uppercase letter
	 * @return corresponding phone number
	 */
	public static int letterToPhone(char c) {
		String s = Character.toString(c);
		if(s.equals("A") || s.equals("B") || s.equals("C")) {
			return 2;
		}
		else if(s.equals("D") || s.equals("E") || s.equals("F")) {
			return 3;
		}
		else if(s.equals("G") || s.equals("H") || s.equals("I")) {
			return 4;
		}
		else if(s.equals("J") || s.equals("K") || s.equals("L")) {
			return 5;
		}
		else if(s.equals("M") || s.equals("N") || s.equals("O")) {
			return 6;
		}
		else if(s.equals("P") || s.equals("Q") || s.equals("R") || s.equals("S")) {
			return 7;
		}
		else if(s.equals("T") || s.equals("U") || s.equals("V")) {
			return 8;
		}
		else if(s.equals("W") || s.equals("X") || s.equals("Y") || s.equals("Z")) {
			return 9;
		}
		else {
			return 0;
		}
	}
	
	/**
	 * Takes an input PIN and produces a response
	 * via first converting each character via phone
	 * number, then using that as an index
	 * to a value sequence
	 * 
	 * @param pin input PIN (assumed to be uppercase letters)
	 * @param values input value sequence
	 * @return response
	 */
	public static int[] getResponse(String pin, int[] values) {
		int[] response = new int[pin.length()];
		
		for(int i = 0; i < pin.length(); i++) {
			int a = letterToPhone(pin.charAt(i));
			response[i] = values[a];
		}
		
		return response;
	}
	
	/**
	 * Returns true if the length of the
	 * input string is equal to the k
	 * parameter
	 * 
	 * @param s input string
	 * @param k length to check
	 * @return true if length of string 
	 */
	public static boolean stringIsKDigits(String s, int k) {
		if(s.length() == k) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Returns true if all the characters
	 * in the input string are '0' through '9'
	 * 
	 * @param s input string
	 * @return true if all characters in s are digits
	 */
	public static boolean allDigits(String s) {
		// hint: the Character class has a good method to test if one char is a digit
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			boolean isDigit = Character.isDigit(c);
			if(!isDigit) {
				return false;
			}
		}
		return true; // replace with your code
	}
	
	/**
	 * Returns true if all the characters
	 * in the input string are 'A' through 'Z'
	 * 
	 * @param s input string
	 * @return true if all characters are uppercase letters
	 */
	public static boolean allUppercaseLetters(String s) {
		// hint: the Character class has a good method to test if one char is an uppercase letter
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			boolean isUpperCase = Character.isUpperCase(c);
			if(!isUpperCase) {
				return false;
			}
		}
		return true; // replace with your code
	}
	
	/**
	 * Converts a string of digits to an
	 * array of integers (e.g. "12" -> {1, 2})
	 * 
	 * Assumes string is comprised of only digits!
	 * 
	 * @param s digit string
	 * @return corresponding integer array
	 */
	public static int[] digitStringToIntArray(String s) {
		int size = s.length();
		int[] array = new int[size]; 
		int i = 0;
		if(size < 1) {
			return array;
		}
		for(i = 0; i < s.length(); i++) {
			array[i] = Integer.parseInt(Character.toString(s.charAt(i)));
		}
		
		return array;
	}
	
	/**
	 * Returns how many times a value
	 * occurs within an array
	 * 
	 * @param value needle
	 * @param values haystack
	 * @return how many times the needle occurs in the haystack
	 */
	public static int countValues(int value, int[] values) {
		int count = 0;
		int i;
		for (i = 0; i < values.length; i++) {
			if(value == values[i]) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Returns how many ways the response could have been
	 * produced from a given value sequence
	 * 
	 * @param response output
	 * @param values value sequence
	 * @return how many PINs could have produced the same response given the value sequence
	 */
	public static int numPossible(int[] response, int[] values) {
		int possibleNum = 1;
		int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;
		if(response.length < 1 || values.length < 1) {
			return possibleNum;
		}
		for(int i = 0; i < response.length; i++) {
			if(response[i] < 0) {
				return 0;
			}
		}
		for(int i = 0; i < response.length; i++) {
			for(int j = 0; j < values.length; j++) {
				if(response[i] == values[j]) {
					if(response[i] == 0) {
						count0++;
					}
					if(response[i] == 1) {
						count1++;
					}
					if(response[i] == 2) {
						count2++;
					}
					if(response[i] == 3) {
						count3++;
					}
					if(response[i] == 4) {
						count4++;
					}
					if(response[i] == 5) {
						count5++;
					}
					if(response[i] == 6) {
						count6++;
					}
					if(response[i] == 7) {
						count7++;
					}
					if(response[i] == 8) {
						count8++;
					}
					if(response[i] == 9) {
						count9++;
					}
				}
			}
		}
		for(int i = 0; i < response.length; i++) {
			if(response[i] == 0) {
				possibleNum = possibleNum * count0;
			}
			if(response[i] == 1) {
				possibleNum = possibleNum * count1;
			}
			if(response[i] == 2) {
				possibleNum = possibleNum * count2;
			}
			if(response[i] == 3) {
				possibleNum = possibleNum * count3;
			}
			if(response[i] == 4) {
				possibleNum = possibleNum * count4;
			}
			if(response[i] == 5) {
				possibleNum = possibleNum * count5;
			}
			if(response[i] == 6) {
				possibleNum = possibleNum * count6;
			}
			if(response[i] == 7) {
				possibleNum = possibleNum * count7;
			}
			if(response[i] == 8) {
				possibleNum = possibleNum * count8;
			}
			if(response[i] == 9) {
				possibleNum = possibleNum * count9;
			}
		}
		return possibleNum;
	}
	
	/**
	 * Inputs a value sequence and PIN,
	 * outputs challenge response
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		final Scanner in = new Scanner(System.in);
		
		System.out.printf("Enter value sequence: ");
		final String seq = in.nextLine();
		
		System.out.printf("Enter PIN: ");
		final String pin = in.nextLine();
		
		// write your code here
		if(!stringIsKDigits(seq, 10)) {
			System.out.printf("%s%n", ERR_SEQ);
			System.exit(0);
		}
		if(!allDigits(seq)) {
			System.out.printf("%s%n", ERR_SEQ);
			System.exit(0);
		}
		if(!allUppercaseLetters(pin)) {
			System.out.printf("%s%n", ERR_PIN);
			System.exit(0);
		}
		
		int[] arrSeq = digitStringToIntArray(seq);
		int[] response = getResponse(pin, arrSeq);
		System.out.printf("Response: ");
		for(int i = 0; i < response.length; i++) {
			System.out.printf("%d", response[i]);
		}
		System.out.println();
		
		// hint: call stringIsKDigits(), allDigits(), allUppercaseLetters() to do error checking
		//       and be sure to use the ERR_SEQ, ERR_PIN, and SEQ_DIGITS final variables when appropriate
		// hint: then use digitStringToIntArray() to convert the sequence into an int[]
		// hint: then call getResponse() to convert the PIN into the response using the sequence
	}

}
