import java.util.Scanner;
public class incrementDecrement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value :");
        int a = s.nextInt();
        int b = a++ + ++a + --a;
        System.out.println(b);
        s.close();
    }
}
