import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the minutes : ");
        long minutes = s.nextLong();
        long hours = minutes / 60;
        long days = hours / 24;

        long years = days / 365;
        long remainingDays = days % 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days");
        s.close();

    }
}
