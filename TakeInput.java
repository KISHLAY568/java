import java.util.*;

public class TakeInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter byte:");
        byte a = s.nextByte();
        System.out.println("Enter short:");
        short b = s.nextShort();
        System.out.println("Enter int:");
        int c = s.nextInt();
        System.out.println("Enter long:");
        long d = s.nextLong();
        System.out.println("Enter float:");
        float e = s.nextFloat();
        System.out.println("Enter double:");
        double f = s.nextDouble();
        s.close();

    }
}
