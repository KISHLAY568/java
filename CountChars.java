import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountChars {
    public static void main(String[] args) throws IOException {
        File f = new File("file1.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        int c;
        int countChars = 0;
        while ((c = br.read()) != -1) {

            countChars++;

        }

        System.out.println(countChars);

        br.close();
        fr.close();

    }
}
