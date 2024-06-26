import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try {
            URL url = new URL(URLString); // create a URL Object
            int count = 0;
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                String line = input.nextLine();
                System.out.println(line);
                count += line.length();
            }

            System.out.println("The file size is: " + count + " characters");
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (IOException ex) {
            System.out.println("I/O errors: file does not exist");
        }

    }

}