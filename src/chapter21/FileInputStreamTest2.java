package chapter21;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input.txt"); // FileInputStream은 AutoClosable이 구현되어 있음
            int i;
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
            }

            System.out.println("end");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
