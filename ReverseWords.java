import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReverseWords {
    public static void main(String[] args) throws IOException {
        File f = new File("file1.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        StringBuilder s = new StringBuilder();
        int c;

        while ((c = br.read()) != -1) {
            s.append((char) c);
        }
        String s2[] = s.toString().split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : s2) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println(result.toString().trim());

        br.close();
        fr.close();

    }
}
