package chapter27;

class BankSync {
    private int money = 10000;

    public synchronized void saveMoney(int save) { // Method 방식으로 동기화 구현
        int m = this.getMoney();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.setMoney(m + save);
    }

    public synchronized void minusMoney(int minus) {
        int m = this.getMoney();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        this.setMoney(m - minus);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class ParkSync extends Thread {

    public void run() {
        synchronized (SyncMainTest2.bankSync) { // Block 방식으로 동기화 구현. 매개 변수는 Critical Section의 인스턴스이다.
            System.out.println("Start save");
            SyncMainTest2.bankSync.saveMoney(3000);
            System.out.println("End save: " + SyncMainTest2.bankSync.getMoney());
        }
    }
}


class ParkWifeSync extends Thread {
    public void run() {
        System.out.println("Start minus");
        SyncMainTest2.bankSync.minusMoney(1000);
        System.out.println("End minus: " + SyncMainTest2.bankSync.getMoney());
    }

}

public class SyncMainTest2 {
    public static BankSync bankSync = new BankSync();

    public static void main(String[] args) throws InterruptedException {
        ParkSync parkSync = new ParkSync();
        parkSync.start();

        Thread.sleep(200);

        ParkWifeSync parkWifeSync = new ParkWifeSync();
        parkWifeSync.start();

        /*
        <result>
        * Start save
        * Start minus
        * End save: 13000
        * End minus: 12000
        * */
    }
}
