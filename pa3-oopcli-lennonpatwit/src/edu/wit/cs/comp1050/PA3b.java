package edu.wit.cs.comp1050;

//TODO: document this class
public class PA3b {
	
	/**
	 * Error to display if the command-line arguments are invalid
	 */
	public static final String ERR_USAGE = "Please supply 6 numbers (a-f).";
	
	/**
	 * Error to display if the equation has no solution
	 */
	public static final String ERR_NOSLTN = "The equation has no solution.";
	
	/**
	 * Number of required parameters (a-f)
	 */
	public static final int NUM_PARAMS = 6;
	
	/**
	 * Validates command-line arguments and returns
	 * parameters if valid
	 * 
	 * @param args command-line arguments
	 * @return if valid an array of parameters, else null
	 */
	public static double[] validateArgs(String[] args) {
		  double[] a = new double[6];
		  if(args.length < 6 || args.length > 6) {
			 return null;
		  }
		  for(int i = 0; i < args.length; i++) {
			  try {
			  a[i] = Double.parseDouble(args[i]);
			  }catch(NumberFormatException ex) {
				  return null;
			  }
		  }
		  return a;
	}

	/**
	 * Uses command-line arguments to create 
	 * an instance of the linear equation,
	 * and reports the outcome
	 * 
	 * @param args command-line arguments, interpreted as equation parameters
	 */
	public static void main(String[] args) {
		double[] myargs = validateArgs(args);
		if(myargs == null || myargs.length < 6) {
			System.out.printf(ERR_USAGE+"%n");
			System.exit(0);
		}
		LinearEquation a = new LinearEquation(myargs);
		if(a.isSolvable() == false) {
			System.out.printf(ERR_NOSLTN + "%n");
			System.exit(0);
		}
		System.out.printf("Solution: x=%.3f, y=%.3f%n", a.getX(), a.getY());
	}

}
