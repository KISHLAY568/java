import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List {
    



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Original list: " + list);

        // Rotate the list by 2 positions to the right
        Collections.rotate(list, 2);
        System.out.println("After rotating by 2 positions to the right: " + list);

        // Rotate the list by 1 position to the left
        Collections.rotate(list, -1);
        System.out.println("After rotating by 1 position to the left: " + list);
    }
}


