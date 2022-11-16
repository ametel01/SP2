/**
 * A GeometricObject has a color, a dateCreated, and a boolean filled.
 *
 * @author Paul Nulty
 */

import java.util.Date;
public abstract class GeometricObject implements Comparable<GeometricObject>, Scalable{
	private String color; // The color
	private boolean filled; // Filled (true for yes)
	private Date dateCreated; // The date of creation

	/**
	* Construct a default GeometricObject with color white, unfilled
	*/
	protected GeometricObject() {
		this("white", false);
	}

	/**
	* Construct a GeometricObject with the specified color and filled value, initialise the dateCreated
	* @param color  color of the shape
	* @param filled is the shape filled in - true for yes
	*/
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new Date();
	}

	/** 
	 * Getter method of the color of the object
	 * @return String color accessor
	 */ 
	public String getColor() {
		return color;
	}

	
	/** 
	 * Changes the color of the object to the one specified by the method parameter
	 * @param color color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/** 
	 * Getter method of the filled status of the object, true if filled false otherwise
	 * @return boolean color accessor
	 */ 
	public boolean isFilled() {
		return filled;
	}

	/** 
	 * Changes the filled status of the object with the one specified by the method parameter
	 * @param filled set the boolean value for filled
	 */ 
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** 
	 * Getter method for the date the object has been created
	 * @return Date date accessor
	 */ 
	public Date getDateCreated() {
		return dateCreated;
	}
	
	// Abstract method getArea
	public abstract double getArea();

	// Abstract method getPerimeter
	public abstract double getPerimeter();

	/** 
	 * @return String return a string describing the GeometricObject
	 */ 
	@Override
	public String toString() {
		return "created: " + dateCreated + ", color: " + color + ", filled: " + filled;
	}

	/**
	 * 
	 * @param o the geometric object to with compare to
	 * @return 1 if this object is bigger, -1 otherwise
	 */
	@Override
	public int compareTo(GeometricObject o) {
		if (this.getArea() > o.getArea()) {
            return 1;
        } else  {
            return -1;
        }
	}

}

