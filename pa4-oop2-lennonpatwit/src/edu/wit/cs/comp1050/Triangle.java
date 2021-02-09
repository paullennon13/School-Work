package edu.wit.cs.comp1050;

//TODO: document this class
public class Triangle extends Shape2D {
	// hint: think about how you want to store the points
	private double[][] triangle = new double[3][2];
	private String color;
	/**
	 * Constructs a triangle given
	 * three points
	 * 
	 * @param color color
	 * @param p1 point 1
	 * @param p2 point 2
	 * @param p3 point 3
	 */
	public Triangle(String color, Point2D p1, Point2D p2, Point2D p3) {
		super(color, "Triangle"); // replace with your code
		triangle[0][0] = p1.getX();
		triangle[0][1] = p1.getY();
		triangle[1][0] = p2.getX();
		triangle[1][1] = p2.getY();
		triangle[2][0] = p3.getX();
		triangle[2][1] = p3.getY();
		this.color = color;
	}
	
	/**
	 * Returns the axis-aligned
	 * bounding box for this
	 * triangle
	 * 
	 * @return axis-aligned bounding box
	 */
	public Rectangle getAxisAlignedBoundingBox() {
		double x1=0, x2=0, y1=0, y2=0;
		if(triangle[0][1] > triangle[1][1] && triangle[0][1] > triangle[2][1]) {
			y1 = triangle[0][1];
		}
		else if(triangle[1][1] > triangle[2][1]) {
			y1 = triangle[1][1];
		}
		else {
			y1 = triangle[2][1];
		}
		if(triangle[0][0] > triangle[1][0] && triangle[0][0] > triangle[2][0]) {
				x1 = triangle[0][0];
		}
		else if(triangle[1][0] > triangle[2][0]) {
			x1 = triangle[1][0];
		}
		else {
			x1 = triangle[2][0];
		}
		if(triangle[0][1] < triangle[1][1] && triangle[0][1] < triangle[2][1]) {
			y2 = triangle[0][1];
		}
		else if(triangle[1][1] < triangle[2][1]) {
			y2 = triangle[1][1];
		}
		else {
			y2 = triangle[2][1];
		}
		if(triangle[0][0] < triangle[1][0] && triangle[0][0] < triangle[2][0]) {
			x2 = triangle[0][0];
		}
		else if(triangle[1][0] < triangle[2][0]) {
			x2 = triangle[1][0];
		}
		else {
			x2 = triangle[2][0];
		}
		Point2D a = new Point2D(x1,y1);
		Point2D b = new Point2D(x2,y2);
		
		return new Rectangle(color, a,b);
	}

	@Override
	public double getArea() {
		Point2D a = new Point2D(triangle[0][0], triangle[0][1]);
		Point2D b = new Point2D(triangle[1][0], triangle[1][1]);
		Point2D c = new Point2D(triangle[2][0], triangle[2][1]);
		Point2D d = new Point2D((a.getX()+b.getX())/2 , (a.getY() + b.getY()) / 2);
		return .5 * a.distanceTo(b) * d.distanceTo(c); // replace with your code
	}

	@Override
	public double getPerimeter() {
		Point2D a = new Point2D(triangle[0][0], triangle[0][1]);
		Point2D b = new Point2D(triangle[1][0], triangle[1][1]);
		Point2D c = new Point2D(triangle[2][0], triangle[2][1]);
		return a.distanceTo(b) + a.distanceTo(c) + b.distanceTo(c); // replace with your code
	}

	@Override
	public Point2D getCenter() {
		Point2D a = new Point2D(triangle[0][0], triangle[0][1]);
		Point2D b = new Point2D(triangle[1][0], triangle[1][1]);
		Point2D c = new Point2D(triangle[2][0], triangle[2][1]);
		Point2D d = new Point2D((a.getX()+b.getX())/2 , (a.getY() + b.getY()) / 2);
		return new Point2D((d.getX() + c.getX()) /2, (d.getY() + c.getY()) /2); // replace with your code
	}

	@Override
	public Point2D[] getVertices() {
		Point2D[] a = new Point2D[3];
		a[0] = new Point2D(triangle[0][0], triangle[0][1]);
		a[1] = new Point2D(triangle[1][0], triangle[1][1]);
		a[2] = new Point2D(triangle[2][0], triangle[2][1]);
		return a;
	}

}
