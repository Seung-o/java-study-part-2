package chapter22;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try {
            FileReader fis = new FileReader("reader.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            System.out.println("\nend");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
