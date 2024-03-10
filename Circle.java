// No main method inside it - normal class
public class Circle {

    // Data Fields
    double radius; // default value of 0, boolean -> false, char -> \u0000, String, Person -> null

    // Constructors -> Initialise when object is created
    // Empty Constructor or No-arg constructor
    Circle() {
        radius = 1.0;
    }

    // Parameterized Constructor
    Circle(double newRadius) {
        radius = newRadius;
    }

    // Methods
    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }

}