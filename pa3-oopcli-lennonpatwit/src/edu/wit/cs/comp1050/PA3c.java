package edu.wit.cs.comp1050;

//TODO: document this class
public class PA3c {
	
	/**
	 * Error to display if the command-line arguments are invalid
	 */
	public static final String ERR_USAGE = "Please supply 2 numbers (x y).";
	
	/**
	 * Computes the distance using three methods
	 * from the origin to a point supplied via
	 * command-line arguments
	 * 
	 * @param args command-line args: x y
	 */
	public static void main(String[] args) {
		double x = 0.0, y = 0.0;
		if(args == null || args.length < 2) {
			System.out.println(ERR_USAGE);
			System.exit(0);
		}
			  try {
			  x = Double.parseDouble(args[0]);
			  y = Double.parseDouble(args[1]);
			  }catch(NumberFormatException ex) {
				  System.out.println(ERR_USAGE);
				  System.exit(0);
			  }
		
		// replace the following line
		// with whatever code you see fit
		// in order to validate command-line
		// arguments and, if valid, construct
		// p via the two doubles supplied
		final Point2D p = new Point2D(x, y);
		
		//////////////////////////////////////
		// !! DO NOT CHANGE THE LINES BELOW !!
		// 
		// They assume p has been
		// properly constructed and perform
		// all necessary output for the
		// program
		//////////////////////////////////////
		final Point2D o = new Point2D();
		System.out.printf("Point 1: %s%n", o);
		System.out.printf("Point 2: %s%n", p);
		System.out.printf("Static method distance: %.3f%n", Point2D.distance(o, p));
		System.out.printf("Distance from P1: %.3f%n", o.distanceTo(p));
		System.out.printf("Distance from P2: %.3f%n", p.distanceTo(o));
	}

}
