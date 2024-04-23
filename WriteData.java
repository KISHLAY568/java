import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {

    public static void main(String[] args) {

        File file = new File("src/exceptionHandlingIO/scores.txt");
        try {
            PrintWriter output = new PrintWriter(file);

            System.out.println("File Writing Started...");
            // Write formatted output to file
            output.print("Harsh Singh Jadon ");
            output.println(100);
            output.print("Shivam Gupta ");
            output.println(50);

            output.close(); // saved properly to the file
            System.out.println("File Writing Completed...");
        } catch (FileNotFoundException e) {
            System.out.println("File already exists");
        }
    }

}