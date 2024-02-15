import java.util.Scanner;

class arithmetic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int num1 = s.nextInt();
        System.out.println("Enter the second Number:");
        int num2 = s.nextInt();
        System.out.println("sum:");
        System.out.println(num1 + num2);
        System.out.println();
        System.out.println("subtraction:");
        System.out.println(num1 - num2);
        System.out.println();
        System.out.println("multiplication:");
        System.out.println(num1 * num2);
        System.out.println();
        System.out.println("division:");
        System.out.println(num1 / num2);
        System.out.println();
        System.out.println("mod:");
        System.out.println(num1 % num2);
        System.out.println();
        s.close();

    }
}