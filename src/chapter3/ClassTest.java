package chapter3;

import chapter1.Book;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException { // 동적 로딩 시, 오류가 발생하면 프로그램에 치명적임.
        Class c = Class.forName("java.lang.String");
        System.out.println(c.getName());

        Constructor[] cons = c.getConstructors();
        for(Constructor con : cons) {
            System.out.println(con);
        }

        Method[] methods = c.getMethods();
        for(Method method : methods) {
            System.out.println(method);
        }

        Class book = Class.forName("chapter1.Book");
        Class[] parameterTypes = {String.class, String.class};
        Constructor bookCons = book.getConstructor(parameterTypes);
        Object[] initArgs = {"태백산맥", "조정래"};
        Book book1 = (Book)bookCons.newInstance(initArgs);
        System.out.println(book1);
    }
}
