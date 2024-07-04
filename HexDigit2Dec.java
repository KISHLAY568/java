import java.util.Scanner;

public class HexDigit2Dec {

    public static void main(String[] args) {
        /**
         * The hexadecimal number system has 16 digits: 0–9, A–F.
         * The letters A, B, C, D, E, and F correspond to the decimal numbers
         * 10, 11, 12, 13, 14, and 15.
         * We now write a program that prompts the user to enter a hex digit
         * and display its corresponding decimal value.
         */

        // 1. take input from user -> character
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit: ");
        String hexString = input.nextLine();

        // 2. Check if the hex string has exactly one character
        if (hexString.length() != 1) {
            System.out.println("You must exactly enter one character");
            System.exit(1); // The program will terminate here.
        }

        // 3. Display of decimal value corresponding to hex value

        // 3a. (smallcase, uppercase) -> uppercase letter
        char inputCharacter = hexString.charAt(0); // hexString[0]
        char ch = Character.toUpperCase(inputCharacter);

        // 3b. Check the character range
        if (Character.isDigit(ch)) { // '0' to '9'
            int value = ch - '0'; // ch = '1' -> 48, '0' - 47
            System.out.println("Decimal value: " + value);
        } else if (ch >= 'A' && ch <= 'F') {
            int value = ch - 'A' + 10; // A -> 10, B -> 11
            System.out.println("Decimal value: " + value);
        } else {
            System.out.println(ch + " is an invalid character");
        }

        input.close();

    }

}
