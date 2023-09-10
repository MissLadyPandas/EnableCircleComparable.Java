
public abstract class SimpleShape {
    // Attributes of the shape
    private String color = "white";
    private boolean isFilled;
    private java.util.Date whenMade;

    // default constructor
    SimpleShape() {
        whenMade = new java.util.Date();
    }

    // constructor with details
    SimpleShape(String color, boolean isFilled) {
        whenMade = new java.util.Date();
        this.color = color;
        this.isFilled = isFilled;
    }

    // gets the color of the shape
    public String getColor() {
        return color;
    }

    // sets the color of the shape
    public void setColor(String color) {
        this.color = color;
    }

    // checks if the shape is filled or is not filled
    public boolean isFilled() {
        return isFilled;
    }

    // sets if the shape is filled or not
    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    // date of circle made
    public java.util.Date getWhenMade() {
        return whenMade;
    }

    // Returns a string about the shape
    @Override
    public String toString() {
        return "Made on: " + whenMade + ", Color: " + color + ", Filled: " + isFilled;
    }

    // area of each shape
    public abstract double computeArea();

    // perimeter of each shape
    public abstract double computePerimeter();
}