package chapter4;

public class MyArrayTest {
    public static void main(String[] args) {
        MyArray arr = new MyArray();

        arr.addElement(10);
        arr.addElement(20);
        arr.addElement(30);
        arr.insertElement(1,50);
        arr.printAll();

        System.out.println("======================");

        arr.removeElement(1);
        arr.printAll();
        System.out.println("======================");

    }
}
