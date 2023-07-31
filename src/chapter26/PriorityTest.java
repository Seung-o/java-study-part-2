package chapter26;

class PriorityThread extends Thread {
    public void run() {
        int sum = 0;
        Thread thread = Thread.currentThread();
        System.out.println(thread + " start");

        for (int i = 0; i <= 10000000; i++) {
            sum += i;
        }

        System.out.println(thread.getPriority() + "end");
    }
}

public class PriorityTest {
    public static void main(String[] args) {
        int i;
        for (i = Thread.MIN_PRIORITY; i < Thread.MAX_PRIORITY; i++) {
            PriorityThread thread = new PriorityThread();
            thread.setPriority(i);
            thread.start();
        }
    }
}
