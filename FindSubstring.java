import java.util.Scanner;

public class FindSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.println("Enter string s2: ");
        String s2 = input.nextLine();
        int index = s1.indexOf(s2);
        if (index != -1) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is a not a substring of " + s1);
        }
    }
}
