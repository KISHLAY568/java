import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {
    public static void main(String[] args) throws IOException {
        File f = new File("file1.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        int c;
        int countLines = 0;
        while ((c = br.read()) != -1) {
            if ((char) c == '\n') {
                countLines++;
            }
        }

        System.out.println(countLines + 1);

        br.close();
        fr.close();

    }
}
