import java.util.Arrays;
import java.util.Scanner;

public class MergeSortList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of first list: ");
        int n = input.nextInt();
        System.out.print("Enter the size of second list: ");
        int m = input.nextInt();
        int list1[] = new int[n];
        int list2[] = new int[m];
        int newList[] = new int[m + n];
        System.out.println("Enter the elements in list 1: ");
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.println("Enter the elements in list 2: ");
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        Arrays.sort(list1);
        Arrays.sort(list1);

        for (int i = 0; i < list1.length; i++) {
            newList[i] = list1[i];
        }
        for (int i = list1.length; i < list1.length + list2.length; i++) {
            newList[i] = list2[i - list1.length];
        }

        Arrays.sort(newList);

        for (int i = 0; i < m + n; i++) {
            System.out.print(newList[i] + " ");
        }

    }
}
