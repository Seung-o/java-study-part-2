package chapter6;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printAll();

        System.out.println("Top Element: " + stack.pop());
        stack.printAll();
    }
}
