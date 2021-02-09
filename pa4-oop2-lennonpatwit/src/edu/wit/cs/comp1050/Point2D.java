package edu.wit.cs.comp1050;

//TODO: document this class
public class Point2D {
	
	private double x;
	private double y;
	
	/**
	 * Constructor to initialize coordinates
	 * 
	 * @param x x value
	 * @param y y value
	 */
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Initializes to (0., 0.)
	 */
	public Point2D() {
		// replace with your code
		// MUST be a single call
		// to the constructor above
		x = 0.0;
		y = 0.0;
	}
	
	/**
	 * Get the x coordinate
	 * 
	 * @return x coordinate
	 */
	public double getX() {
		return x; // replace with your code
	}
	
	/**
	 * Get the y coordinate
	 * 
	 * @return y coordinate
	 */
	public double getY() {
		return y; // replace with your code
	}
	
	/**
	 * Gets a String representation
	 * of the coordinate in the form
	 * "(x, y)" (each with three decimal
	 * places of precision)
	 * 
	 * #return "(x, y)"
	 */
	public String toString() {
		String s;
		
		s = String.format("(%.3f, %.3f)", x, y);
		
		return s;
	}
	
	/**
	 * Returns true if provided another
	 * point that is at the same (x,y)
	 * location (that is, the distance
	 * is "close enough" according to
	 * Shape2D)
	 * 
	 * @param o another object
	 * @return true if the other object is a point and the same location (within threshold)
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof Point2D) {
			if(((Point2D) o).getX() == x && ((Point2D) o).getY() == y) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Method to compute the Euclidean/L2
	 * distance between two points in 2D
	 * space
	 * 
	 * @param p1 point 1
	 * @param p2 point 2
	 * @return straightline distance between p1 and p2
	 */
	public static double distance(Point2D p1, Point2D p2) {
		return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
	}
	
	/**
	 * Method to compute the Euclidean
	 * distance between this point
	 * and a supplied point
	 * 
	 * @param p input point
	 * @return straightline distance between this point and p
	 */
	public double distanceTo(Point2D p) {
		return Math.sqrt(Math.pow((p.getX() - x), 2) + Math.pow((p.getY() - y), 2));
	}

}
