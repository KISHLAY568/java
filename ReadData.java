import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File file = new File("src/exceptionHandlingIO/scores.txt");

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String firstName = input.next();
                String lastName = input.next();
                int score = input.nextInt();
                System.out.println(firstName + " " + lastName + " " + score);
            }

            input.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}