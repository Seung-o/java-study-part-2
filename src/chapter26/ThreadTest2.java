package chapter26;

class MyRunnable implements Runnable { // 자바는 단일 상속만 지원하기에, 이미 상속을 받은 클래스에 대해서는 Runnable 인터페이스 구현을 통해 스레드를 만들 수도 있다.
    @Override
    public void run() {
        int i;

        for (i = 0; i < 200; i++) {
            System.out.print(i + "\t");
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
