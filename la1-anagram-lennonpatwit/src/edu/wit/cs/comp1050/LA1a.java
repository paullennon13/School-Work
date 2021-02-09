package edu.wit.cs.comp1050;

import java.util.Scanner;

public class LA1a {
	
	/**
	 * Returns an array with counts for each
	 * letter from a-z (case-insensitive),
	 * ignoring all other characters:
	 * 
	 * [0]: number of a/A's
	 * [1]: number of b/B's
	 * ...
	 * [25]: number of z/Z's
	 * 
	 * @param word input word
	 * @return count of case-insensitive letters
	 */
	public static int[] countLetters(String word) {
		int[] counts = new int[26];
		
		for (char c : word.toCharArray()) {
			c = Character.toLowerCase(c);
			if (c >= 'a' && c <= 'z') {
				counts[c-'a']++;
			}
		}
		
		return counts;
	}
	
	/**
	 * Compares two arrays and
	 * returns true if they have
	 * the same contents
	 * 
	 * @param c1 array 1
	 * @param c2 array 2
	 * @return true if c1 and c2 have the same contents
	 */
	public static boolean sameCounts(int[] c1, int[] c2) {
		int i;
		if(c1.length == 0) {
			if(c2.length == 0){
				return true;
			}
			return false;
		}
		if (c2.length == 0) {
			return false;
		}
		for(i=0;i<c1.length;i++) {
			if(c1[i] != c2[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Inputs two phrases and outputs
	 * if they are anagrams (ignoring
	 * case and any non-letter
	 * characters)
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] array1 = new int[26];
		int[] array2 = new int[26];
		
		for(int i = 0; i <26; i++) {
			array1[i] = 0;
			array2[i] = 0;
		}
		
		System.out.printf("Enter phrase 1: ");
		String a = in.nextLine();
		System.out.printf("Enter phrase 2: ");
		String b = in.nextLine();
		in.close();
		
		array1 = countLetters(a);
		array2 = countLetters(b);
		
		if(sameCounts(array1, array2)) {
			System.out.printf("These phrases are anagrams.%n");
		}
		else {
			System.out.printf("These phrases are not anagrams.%n");
		}
		
	}

}
