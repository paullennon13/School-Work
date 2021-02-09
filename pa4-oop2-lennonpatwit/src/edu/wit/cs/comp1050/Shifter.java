package edu.wit.cs.comp1050;

import java.util.ArrayList;
//TODO: document this class
public class Shifter {
	
	// think about what class variables you will need here
	private String s = null;
	/**
	 * Number of letters in the English alphabet
	 */
	public static final int NUM_LETTERS = ('z' - 'a') + 1;
	
	/**
	 * Initializes the shifter
	 * 
	 * @param s encrypted string
	 */
	public Shifter(String s) {
		this.s = s;
	}
	
	/**
	 * Returns the result of shifting
	 * by a supplied amount
	 * 
	 * @param n number of places to shift 
	 * @return shifted string
	 */
	public String shift(int n) {	 
		StringBuffer result= new StringBuffer(); 
		  
        for (int i=0; i<s.length(); i++) 
        { 
            if (Character.isUpperCase(s.charAt(i))) { 
            	char ch = (char)(Math.floorMod(((int)s.charAt(i) + n - 65), 26)+ 65); 
                result.append(ch); 
            } 
            else if (Character.isLowerCase(s.charAt(i))) { 
                char ch = (char)(Math.floorMod(((int)s.charAt(i) + n - 97), 26)+ 97); 
                result.append(ch); 
            } 
            else {
            	result.append(s.charAt(i));
            }
        } 
        return result.toString();
	}
	
	/**
	 * Finds all shifts that contain
	 * the supplied substring
	 * 
	 * @param sub substring to find
	 * @return array of shifts (0-25) that contain the substring (in order)
	 */
	public int[] findShift(String sub) {
		int b=0;
		for(int i = 0; i < 26; i++) {
			String s = shift(i);
			if(s.contains(sub)) {
				b++;
			}
			
		}
		int[] a = new int[b];
		b=0;
		for(int i = 0; i < 26; i++) {
			String s = shift(i);
			if(s.contains(sub)) {
				a[b] = i;
				b++;
			}
			
		}
		
		return a;
	}

}
