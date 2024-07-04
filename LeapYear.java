
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        // To check whether a year is a leap year or not

        /*
         * 1. Year should be divisible by 4
         * 2. Year should not be divisible by 100
         * 3. OR Year should be divisible by 400
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = input.nextInt();
        // false OR (true AND true)
        boolean isLeapYear = (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));

        System.out.println(year + " is a leap Year? " + isLeapYear);
        input.close();

    }

}
