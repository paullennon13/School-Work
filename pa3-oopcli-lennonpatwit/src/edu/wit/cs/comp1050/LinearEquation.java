package edu.wit.cs.comp1050;

//TODO: document this class
public class LinearEquation {
	
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	/**
	 * Initialize the linear equation of form:
	 * ax + by = e
	 * cx + dy = f
	 * 
	 * @param a parameter a
	 * @param b parameter b
	 * @param c parameter c
	 * @param d parameter d
	 * @param e parameter e
	 * @param f parameter f
	 */
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	/**
	 * Convenience constructor to initialize
	 * the linear equation via array
	 * 
	 * THIS CONSTRUCTOR CALLS THE CONSTRUCTOR
	 * ABOVE USING THE ARRAY CONTENTS
	 * 
	 * @param p parameter array, assumed to be length 6 (a-f, in order)
	 */
	public LinearEquation(double[] p) {
		// MUST call the above constructor
		// with the contents of p
		this.a = p[0];
		this.b = p[1];
		this.c = p[2];
		this.d = p[3];
		this.e = p[4];
		this.f = p[5];
	}
	
	/**
	 * Returns parameter a
	 * 
	 * @return a
	 */
	public double getA() {
		return a; // replace with your code
	}
	
	/**
	 * Returns parameter b
	 * 
	 * @return b
	 */
	public double getB() {
		return b; // replace with your code
	}
	
	/**
	 * Returns parameter c
	 * 
	 * @return c
	 */
	public double getC() {
		return c; // replace with your code
	}
	
	/**
	 * Returns parameter d
	 * 
	 * @return d
	 */
	public double getD() {
		return d; // replace with your code
	}
	
	/**
	 * Returns parameter e
	 * 
	 * @return e
	 */
	public double getE() {
		return e; // replace with your code
	}
	
	/**
	 * Returns parameter f
	 * 
	 * @return f
	 */
	public double getF() {
		return f; // replace with your code
	}
	
	/**
	 * Returns true if the parameterized
	 * equation is solvable (i.e. denominator
	 * ad-bc is not 0)
	 * 
	 * @return true if solvable, false otherwise
	 */
	public boolean isSolvable() {
		if(a*d - b*c == 0) {
			return false;
		}
		return true; 
	}
	
	/**
	 * Returns solution for x if solvable,
	 * null otherwise
	 * 
	 * @return x if solvable, null otherwise
	 */
	public Double getX() {
		if(isSolvable() == false) {
			return null; // replace with your code
		}
		double x = (e*d - b*f) / (a*d - b*c);
		return x;
	}
	
	/**
	 * Returns solution for y if solvable,
	 * null otherwise
	 * 
	 * @return y if solvable, null otherwise
	 */
	public Double getY() {
		if(isSolvable() == false) {
			return null; // replace with your code
		}
		double y = (a*f - e*c) / (a*d - b*c);
		return y;
	}

}
