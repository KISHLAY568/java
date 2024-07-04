import java.util.Scanner;

public class FindingRunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter velocity in m/s : ");
        double  v = input.nextDouble();
        System.out.print("Enter acceleration in m/s^2 : ");
        double a = input.nextDouble();

        double length = (Math.pow(v, 2))/(2*a);

        System.out.println("The minimum run-way length is : "+ length);

        input.close();
    }
}
