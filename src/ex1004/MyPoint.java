package ex1004;

/**
 -x: double
 -y: double
 ---------------------
 -MyPoint()
 -MyPoint(x: double, y: double)
 -getX(): double
 -getY(): double
 -distance(): double
 -distance(x: double, y: double): double
 */

/**
 *
 * @author kristiyan
 */
public class MyPoint {
    private double x;
    private double y;
    
    /** No argument constructor that creates a point(0, 0). */
    public MyPoint() {
        this(0, 0);
    }
    /** Constructor that constructs a point with specified coordinates. */
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /** Get method. */
    public double getX() {
        return x;
    }
    
    /** Get method. */
    public double getY() {
        return y;
    }
    
    /** Method that returns the distance from this point to a
  specified point of the MyPoint type. */
    public double distance(MyPoint point) {
        return Math.sqrt(Math.pow(point.getX() - x, 2) +
                Math.pow(point.getY() - y, 2));
    }
    
    /** Method that returns the distance from this point to
    another point with specified x - and y -coordinates. */
    public double distance(double x, double y) {
        return distance(new MyPoint(x, y));
    }
}
