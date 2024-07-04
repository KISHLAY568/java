import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumber {

    public static void main(String[] args) {

        // list of number objects
        ArrayList<Number> list = new ArrayList<>();
        list.add(45); // an int -> Integer
        list.add(3445.53); // an double -> Double

        // Big Integer Object
        list.add(new BigInteger("746238746278462784689238984294877498"));
        // Big Decimal Object
        list.add(new BigDecimal("2.09809797398578934745893475983756485763465"));

        System.out.println("The largest number is: " + getLargestNumber(list));

    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        Number number = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue()) {
                number = list.get(i);
            }
        }

        return number;
    }

}