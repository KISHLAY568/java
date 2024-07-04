import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date {
    public static void main(String[] args) {
        // String t = "03/05/2024";
        // String t2 = "03/05/2002";
        // DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // LocalDate ld = LocalDate.parse(t, d);
        // LocalDate ld2 = LocalDate.parse(t2, d);
        // String a = ld.format(d);
        // System.out.println(a);
        // // Period d2 =
        // // Period.between(ld2,ld);
        // // System.out.println(d2.getDays());
        // LocalDate l1 = LocalDate.of(2024, 05, 01);
        // LocalDate l2 = LocalDate.of(2022, 05, 01);
        // long d2 = ChronoUnit.DAYS.between(ld2, ld);
        // System.out.println(d2);
        // System.out.println(LocalTime.now());
        LocalDate today = LocalDate.now();
        LocalDate past = today.minusMonths(100);
        System.out.println(past);
    }
}
