//GeometricObject

//Attributes:
//
//color: String
//filled: boolean
//dateCreated: Date

//Methods:

//getColor(): String
//isFilled(): boolean
//getDateCreated(): Date
//getArea(): double
//getPerimeter(): double

//Circle (extends GeometricObject, implements Comparable<T>)

//Attributes:
//radius: double

//Methods:
//getDiameter(): double
//equals(o: Object): boolean
//compareTo(o: Circle): int

//Comparable<T>

//Methods:
//compareTo(T t): int


public class CircleComparisonTest {
    

    public static void main(String[] args) {
        // Make three example circles
        SimpleCircle firstCircle = new SimpleCircle(5, "red", true);
        SimpleCircle secondCircle = new SimpleCircle(5, "green", false);
        SimpleCircle thirdCircle = new SimpleCircle(4, "green", false);

        // print their sizes
        System.out.println("First circle's radius: " + firstCircle.getRadius());
        System.out.println("Second circle's radius: " + secondCircle.getRadius());
        System.out.println("Third circle's radius: " + thirdCircle.getRadius());

        // check if they are the same
        System.out.println("First circle " + (firstCircle.equals(secondCircle) ? "matches" : "doesn't match") + " second circle.");
        System.out.println("First circle " + (firstCircle.equals(thirdCircle) ? "matches" : "doesn't match") + " third circle.");
    }
}
