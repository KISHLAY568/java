import java.util.Scanner;

public class RepeatAdditionQuiz {

    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 10);

        int number2 = (int) (Math.random() * 10);

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + "?");
        int answer = inputScanner.nextInt();

        while (number1 + number2 != answer) {
            System.out.println("Wrong answer. Try again.");
            System.out.println("What is " + number1 + " + " + number2 + "?");
            answer = inputScanner.nextInt();
        }

        System.out.println("You got it!!");

        inputScanner.close();

    }

}
