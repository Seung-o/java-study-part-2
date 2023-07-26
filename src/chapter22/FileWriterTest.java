package chapter22;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("writer.txt")) {
            fw.write("A");

            char[] buf = {'B', 'C', 'D', 'E' };
            fw.write(buf);

            fw.write("한글");
            fw.write(buf, 1, 2);
            fw.append("65");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
