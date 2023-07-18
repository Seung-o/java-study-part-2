package chapter7;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");
        queue.enQueue("D");
        queue.enQueue("E");
        queue.printAll();

        System.out.println("======================");

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        queue.printAll();
    }

}
