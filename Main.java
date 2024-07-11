import java.io.*;
import java.io.FileReader;

class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("file1.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        StringBuilder s = new StringBuilder();
        int c;
        while ((c = br.read()) != -1) {
            // System.out.print((char) c);
            s.append((char)c);
        }

        br.close();
        fr.close();

        System.out.println(s.reverse().toString());

    }
}