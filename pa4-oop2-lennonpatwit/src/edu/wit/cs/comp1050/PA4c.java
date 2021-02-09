package edu.wit.cs.comp1050;

import java.util.ArrayList;
import java.util.Scanner;

//TODO: document this class
public class PA4c {
	
	/**
	 * Removes all duplicate values
	 * from the supplied list
	 * 
	 * @param list list from which to remove repeated elements
	 */
	public static void removeRepeated(ArrayList<Integer> list) {
		for(int i= 0; i < list.size(); i++) {
			for(int j = 0; j < i; j++) {
				int a = list.get(j);
				int b = list.get(i);
				if(a == b) {
					list.remove(i);
					i -=1;
				}
			}
		}
	}

	/**
	 * Reads numbers from the keyboard and
	 * outputs the list of distinct values
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>(1);
		System.out.printf("Enter integers: ");
		if(!s.hasNextInt()) {
			System.out.printf("No values entered.%n");
			System.exit(0);
		}
		while(s.hasNextInt()) {
			a.add(s.nextInt());
		}
		removeRepeated(a);
		
		System.out.printf("The distinct integer(s):");
		for(int i = 0; i < a.size(); i++) {
			System.out.printf(" %d", a.get(i));
		}
		System.out.println();
		
	}

}
