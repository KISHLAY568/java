import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        // 1. Generate a random number to be guessed [0 - 100]
        int number = (int) (Math.random() * 101); // [0, 1) * 100 -> [0, 101)

        // 2. Prompt the user to enter number
        Scanner inputScanner = new Scanner(System.in);

        int guess = -1;
        // 3. iteration
        while (guess != number) { // false when (guess == number)
            System.out.println("Guess a magic number between 0 and 100: ");
            guess = inputScanner.nextInt();

            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is high");
            } else {
                System.out.println("your guess is low");
            }
        }

        // End of loop
        inputScanner.close();

    }
}