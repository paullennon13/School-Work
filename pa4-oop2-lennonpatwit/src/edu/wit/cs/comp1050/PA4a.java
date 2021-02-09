package edu.wit.cs.comp1050;

//TODO: document this class
public class PA4a {
	
	/**
	 * Error if incorrect command-line arguments are supplied
	 */
	public static final String ERR_USAGE = "Please supply correct inputs: <encrypted string> <substring>";
	
	/**
	 * Error if shift could not be found
	 */
	public static final String ERR_NONE = "No valid shifts found.";

	/**
	 * Outputs all shifts of the encrypted string
	 * that contain the supplied substring
	 * 
	 * @param args command-line arguments: <encrypted string> <substring>
	 */
	public static void main(String[] args) {
			Shifter a = null;
			int[] b = null;
		if(args.length > 2) {
			System.out.printf("%s%n", ERR_USAGE);
			System.exit(0);
		}
		try{
			a = new Shifter(args[0]);
			b = a.findShift(args[1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.printf("%s%n", ERR_USAGE);
			System.exit(0);
		}
		
		if(b.length < 1) {
			System.out.printf("%s%n", ERR_NONE);
			System.exit(0);
		}
		for(int i = 0; i < b.length; i++) {
			if(b[i] < 10) {
				System.out.printf("0%d: %s%n", b[i], a.shift(b[i]));
			}
			else {
				System.out.printf("%d: %s%n", b[i], a.shift(b[i]));
			}
		}
	}

}
