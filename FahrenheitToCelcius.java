import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the temp. in F: ");
        double d = s.nextDouble();
        double celsius = (5.0 / 9) * (d - 32);
        System.out.println(celsius);
        s.close();
    }
}
