package edu.wit.cs.comp1050;

//TODO: document this class
public class Rectangle extends Shape2D {
    // think about how you want to store the vertices of this rectangle
    // hint: an array might make sense
    private double[][] rectangle = new double[2][2];
    private double length;
    private double width;
    
	/**
	 * Constructs a rectangle given two points
	 * 
	 * @param color rectangle color
	 * @param p1 point 1
	 * @param p2 point 2
	 */
	public Rectangle(String color, Point2D p1, Point2D p2) {
		super(color, "Rectangle"); // replace with your code
		if(p1.getY()< p2.getY()) {
			rectangle[0][0] = p1.getX();
			rectangle[0][1] = p1.getY();
			rectangle[1][0] = p2.getX();
			rectangle[1][1] = p2.getY();
		}
		else {
			rectangle[0][0] = p2.getX();
			rectangle[0][1] = p2.getY();
			rectangle[1][0] = p1.getX();
			rectangle[1][1] = p1.getY();
		}
		Point2D a = new Point2D(rectangle[1][0], rectangle[0][1]);
		length = p2.distanceTo(a);
		width = p1.distanceTo(a);
	}
	
	/**
	 * Returns true if provided
	 * another rectangle whose 
	 * lower-left and upper-right
	 * points are equal to this
	 * rectangle
	 * 
	 * @param o another object
	 * @return true if the same rectangle
	 */
	@Override
	public boolean equals(Object o) {
		if(o instanceof Rectangle) {
			if(((Rectangle) o).getLowerLeft().equals(getLowerLeft()) && ((Rectangle) o).getUpperRight().equals(getUpperRight())){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Gets the lower-left corner
	 * 
	 * @return lower-left corner
	 */
	public Point2D getLowerLeft() {
		Point2D a = new Point2D(rectangle[1][0], rectangle[1][1]);
		return a;
	}
	
	/**
	 * Gets the upper-right corner
	 * 
	 * @return upper-right corner
	 */
	public Point2D getUpperRight() {
		Point2D a = new Point2D(rectangle[0][0], rectangle[0][1]);
		return a;
	}

    // hint: it may help to add a few private methods for distance between the two corners
    
	@Override
	public double getArea() {
		return length * width; // replace with your code
	}

	@Override
	public double getPerimeter() {
		return 2*length + 2*width; // replace with your code
	}

	@Override
	public Point2D getCenter() {
		double x = (rectangle[0][0] + rectangle[1][0]) / 2;
		double y = (rectangle[0][1] + rectangle[1][1]) / 2;
		return new Point2D(x,y);
	}

	@Override
	public Point2D[] getVertices() {
		Point2D[] a = new Point2D[4];
		a[0]= new Point2D(rectangle[0][0], rectangle[0][1]);
		a[1]= new Point2D(rectangle[0][0], rectangle[1][1]);
		a[2]= new Point2D(rectangle[1][0], rectangle[1][1]);
		a[3]= new Point2D(rectangle[1][0], rectangle[0][1]);
		return a;
	}

}
