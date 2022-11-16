/**
 * A Rectangle is a type of GeometricObject. In addition to the properties and behaviours
 *  of GeometricObject, it has a height and a width
 * @author Paul Nulty
 */
public class Rectangle extends GeometricObject implements Rotatable {
	private double width;  // The width of a rectangle
	private double height;  // The height of a rectangle

	/**
	* Construct a default rectangle object with height 1.0 and width 1.0
	*/
	public Rectangle() {
		this(1.0, 1.0);
	}

	/**
	* Construct a rectangle object with the specified width, height, color and filled value
	* @param width  width of the rectangle
	* @param height height of the rectangle
	*/
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}


	/**
	* Construct a rectangle object with the specified width, height, color and filled value
	* @param width  width of the rectangle
	* @param height height of the rectangle
	* @param color color of the rectangle
	* @param filled initial filled value of the rectangle
	*/
	public Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}

	
	/**
	 * Getter method of the width of the rectangle 
	 * @return double width accessor
	 */ 
	public double getWidth() {
		return width;
	}

	
	/** 
	 * Changes the width of the rectangle to the value specified by the method parameter
	 * @param width width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	
	/** 
	 * Getter method of the width of the rectangle
	 * @return double height accessor
	 */
	public double getHeight() {
		return height;
	}

	
	/**
	 * Changes the height of the rectangle to the value specified by the method parameter 
	 * @param height height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	
	/** 
	 * Getter method of the area of the rectangle
	 * @return double area of the rectangle
	 */
	@Override 
	public double getArea() {
		return width * height;
	}

	
	/** 
	 * Getter method of the perimeter of the rectangle
	 * @return double perimeter of the rectangle
	 */
	@Override 
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	
	/** 
	 * Displays to stdout the width and height of the rectangle in a formatted string
	 * @return String simple string showing properties of the rectangle
	 */
	@Override
	public String toString() {
		return super.toString() + ", width: " + width + ", height: " + height;
	}

	/**
	 * Changes the size of the rectangle object base on the factor specified
	 * The object stay unchanged if the scaling factor is less than or equal to 0
	 * @param factor the amount width and height need to be scale of
	 */
	@Override
	public void scale(double factor) {
		if (factor <= 0) {
            return;
        } 
		this.height *= factor;
		this.width *= factor;
	}

	/**
	 * Rotates the rectangle object by 90 degrees.
	 */
	@Override
	public void rotate() {
		double temp = this.width;

		this.width = this.height;
		this.height = temp;
	}
}
