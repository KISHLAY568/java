import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num1 = 0, num2 = 1;
        int sum;

        System.out.print(num1 + " " + num2 + " ");

        for (int i = 2; i < n; i++) {
            sum = num1 + num2;
            System.out.print(sum + " ");
            num1 = num2;
            num2 = sum;
        }

        input.close();
    }

}
