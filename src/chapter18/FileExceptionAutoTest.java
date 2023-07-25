package chapter18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionAutoTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
