public class TestGeometricObject {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // You cannot create objects of abstract classes.
        // But, you can define them as types.

        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5, 3);

        System.out.println("Does the two objects have same area?" +
                equalArea(geoObject1, geoObject2));

        // Display circle
        displayGeometricObject(geoObject1);

        // Display Rectangle
        displayGeometricObject(geoObject2);
    }

    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("the area is: " + object.getArea());
        System.out.println("the perimeter is: " + object.getPerimeter());
    }

}