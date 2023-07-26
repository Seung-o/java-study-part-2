package chapter21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("output.txt");

        try (fos) {
            fos.write(65);
            fos.write(66);
            fos.write(67);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }
}
