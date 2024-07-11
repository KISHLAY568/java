import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
    public static void main(String[] args) throws IOException {
        File f = new File("file1.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        int c;
        int countWords = 0;
        while ((c = br.read()) != -1) {
            if ((char) c == ' ' || (char) c == '\n') {
                countWords++;
            }
        }
        countWords++;
        System.out.println(countWords);

        br.close();
        fr.close();

    }
}
