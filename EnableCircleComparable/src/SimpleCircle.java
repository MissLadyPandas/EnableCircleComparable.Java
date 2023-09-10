
public class SimpleCircle extends SimpleShape implements Comparable<SimpleCircle> {
    private double radius;  

    // the default circle
    SimpleCircle() {}

    // circle size
    SimpleCircle(double radius) {
        this.radius = radius;
    }

    // circle with size, color, and fill details
    SimpleCircle(double radius, String color, boolean isFilled) {
        super(color, isFilled);  // Use the shape's constructor
        this.radius = radius;
    }

    // get the circle's size
    public double getRadius() {
        return radius;
    }

    // change the circle's size
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // calculate the area of the circle
    @Override
    public double computeArea() {
        return radius * radius * Math.PI;  // Formula for circle area
    }

    // calculate how long around the circle is
    @Override
    public double computePerimeter() {
        return 2 * radius * Math.PI;  // Formula for circle perimeter
    }

    // compare two circles by size
    @Override
    public int compareTo(SimpleCircle other) {
        if (this.radius > other.radius)
            return 1;
        else if (this.radius < other.radius)
            return -1;
        else
            return 0;
    }

    // check if two circles are the same size
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SimpleCircle)) return false;
        return this.compareTo((SimpleCircle) other) == 0;
    }

    // returns a string about the circle
    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;  // Use the shape's string method
    }
}