package chapter26;

public class JoinTest extends Thread {

    int start;
    int end;
    int total;

    public JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {
        JoinTest jt1 = new JoinTest(1, 50);
        JoinTest jt2 = new JoinTest(51, 100);

        jt1.start();
        jt2.start();

        System.out.println(Thread.currentThread());

        try {
            jt1.join();
            jt2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        int finalTotal = jt1.total + jt2.total;

        System.out.println("jt1 total: " + jt1.total); // result: 1275
        System.out.println("jt2 total: " + jt2.total); // result: 3775
        System.out.println("finalTotal: " + finalTotal);  // If not using join, expected: 5050 But result: 1275
    }

    public void run() {
        int i;
        for (i = start; i <= end; i++) {
            total += i;
        }
    }
}
