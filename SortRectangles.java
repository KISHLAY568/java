import java.util.Arrays;

public class SortRectangles {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ComparableRectangle[] rectangles = {
                new ComparableRectangle(3, 5),
                new ComparableRectangle(5, 10.3),
                new ComparableRectangle(7.4, 35.4),
                new ComparableRectangle(1.4, 2.4)
        };

        Arrays.sort(rectangles);

        for (Rectangle rectangle : rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }

    }

}