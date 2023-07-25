package chapter18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionTest {
    public static void main(String[] args) {
        ThrowsExceptionTest test = new ThrowsExceptionTest();
        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            throw new RuntimeException(e);
        }

        System.out.println("done");
    }

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

}
