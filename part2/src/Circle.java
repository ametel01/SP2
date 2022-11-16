/** 
 * A Circle is a type of GeometricObject. I addition to the properties and behaviours
 * of GeometricObject, it has a radious parameter.
 * @author Alessandro Metelli
  */
public class Circle extends GeometricObject {
    final double PI =  3.1415926535; // Pi value
    private double radious; // The radious of the Circle

    /**
	* Construct a default circle object with radious 1.0
	*/
    public Circle() {
        this.radious = 1.0;
    }

    /**
     * Construct a circle object with the specified radious
     * @param radious the radious of the circle
     */
    public Circle(double radious) {
        this.radious = radious;
    }

    /**
     * Getter method of the diameter of the circle
     * @return double diameter accessor
     */
    public double getDiameter() {
        return this.radious * 2.0;
    }

    /**
     * Getter method for the area of the cicle
     * @return double area accessor
     */
    public double getArea() {
        return Math.pow(radious, 2) * PI;
    }

    /**
     * Getter method for the perimeter of the circle
     * @return double perimeter accessor
     */
    public double getPerimeter() {
        return 2 * PI * radious;
    }

    /**
     * Changes the size of the rectangle object base on the factor specified
     * The object stay unchanged if the scaling factor is less then or equal to 0
     * @param factor the amount width and height need to be scale of
     */ 
    @Override
    public void scale(double factor) {
        if (factor <= 0) {
            return;
        } 
        this.radious *= factor;
    }


}