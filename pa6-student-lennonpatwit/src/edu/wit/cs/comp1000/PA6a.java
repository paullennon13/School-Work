/*********************************************************************
*	Lab 8 - PA6a
*	Paul Lennon
*	
*   COMP1000-09  (09/10)
*	10/25/2019   
*
**********************************************************************
*	Problem Description
*
*	Create a program that outputs the letters H, E, L, O, W, R, D and a space vertically
*
***********************************************************************
*	Analysis
*
*	Inputs:  string from user
*
*	Outputs: letters H, E, L, O, W, R, D and a space vertically
*
**********************************************************************/

package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA6a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String a;
		System.out.print("Input message: ");
		a = in.nextLine();
		
		int length = a.length();
		int i;
		Character b;
		for(i = 0; i < length; i++) {
			b = a.charAt(i);
			if(b.equals('H') || b.equals('h')) {
				h();
			}
			if(b.equals('E') || b.equals('e')) {
				e();
			}
			if(b.equals('L') || b.equals('l')) {
				l();
			}
			if(b.equals('O') || b.equals('o')) {
				o();
			}
			if(b.equals('W') || b.equals('w')) {
				w();
			}
			if(b.equals('R') || b.equals('r')) {
				r();
			}
			if(b.equals('D') || b.equals('d')) {
				d();
			}
			if(b.equals(' ')) {
				blank();
			}
		}
	}

	public static void h() {
		System.out.println();
		System.out.println("*******");
		System.out.println("   *   ");
		System.out.println("   *   ");
		System.out.println("   *   ");
		System.out.println("*******");
		System.out.println();
	}
	
	public static void e() {
		System.out.println();
		System.out.println("*******");
		System.out.println("*  *  *");
		System.out.println("*  *  *");
		System.out.println("*  *  *");
		System.out.println("*  *  *");
		System.out.println();
	}
	
	public static void l() {
		System.out.println();
		System.out.println("*******");
		System.out.println("*      ");
		System.out.println("*      ");
		System.out.println("*      ");
		System.out.println("*      ");
		System.out.println();
		}
	
	public static void o() {
		System.out.println();
		System.out.println("*******");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println("*******");
		System.out.println();
	}
	
	public static void blank() {
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static void w() {
		System.out.println();
		System.out.println("*******");
		System.out.println("*      ");
		System.out.println("****   ");
		System.out.println("*      ");
		System.out.println("*******");
		System.out.println();
	}
	
	public static void r() {
		System.out.println();
		System.out.println("*******");
		System.out.println("   *  *");
		System.out.println("  **  *");
		System.out.println(" * ****");
		System.out.println("*      ");
		System.out.println();
	}
	
	public static void d() {
		System.out.println();
		System.out.println("*******");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println(" *   * ");
		System.out.println("  ***  ");
		System.out.println();
	}
	
}
