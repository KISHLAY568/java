import java.io.File;
import java.util.Date;

import javax.print.CancelablePrintJob;

public class TestFileClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        File file = new File("src/exceptionHandlingIO/test.txt");
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Last Modified on: " + new Date(file.lastModified()));
    }

}
