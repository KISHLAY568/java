import java.util.Date;

// Asbtract class -> not allowed (new GeometricObject())
public abstract class GeometricObject {

    // Data Fields
    private String color = "white"; // by default
    private boolean filled; // by default - false
    private Date dateCreated;

    // Constructors
    public GeometricObject() {
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Any additional methods
    // Return a string representation of this object

    // Object: public String toString()

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    // We wanted to write getArea() and getPerimeter()

    // abstract methods
    public abstract double getArea();

    // abstract methods
    public abstract double getPerimeter();

}

package abstractClassesAndInterfaces;

// extends - > Inheriting from parent

public class Circle extends GeometricObject {

    // Data fields
    private double radius; // by default - 0

    // Constructors
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getters and Setters

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Custom Methods

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is : " + radius);

    }

    @Override
    public String toString() {
        return super.toString() + "\n radius: " + radius;
    }

}
