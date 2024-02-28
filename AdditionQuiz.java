import java.util.Scanner;

public class AdditionQuiz {

    public static void main(String[] args) {
        int num1 = (int) (System.currentTimeMillis() % 10);
        int num2 = (int) ((System.currentTimeMillis() + 15) % 10);

        Scanner i = new Scanner(System.in);
        System.out.println("what is " + num1 + " + " + num2 + " ?");

        int n = i.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + n + " is " + (num1 + num2 == n));
        i.close();

    }

}
