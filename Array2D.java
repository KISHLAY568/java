import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the row : ");
        int row = input.nextInt();
        System.out.print("Enter the size of the column : ");
        int column = input.nextInt();
        int arr[][] = new int[row][column];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Generated MATRIX : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        input.close();

    }
}
