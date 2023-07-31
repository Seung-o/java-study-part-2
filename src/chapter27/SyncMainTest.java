package chapter27;

class Bank {
    private int money = 10000;

    public void saveMoney(int save) {
        int m = this.getMoney();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.setMoney(m + save);
    }

    public void minusMoney(int minus) {
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

class Park extends Thread {
    public void run() {
        System.out.println("Start save");
        SyncMainTest2.bankSync.saveMoney(3000);
        System.out.println("End save: " + SyncMainTest2.bankSync.getMoney());
    }
}


class ParkWife extends Thread {
    public void run() {
        System.out.println("Start minus");
        SyncMainTest2.bankSync.minusMoney(1000);
        System.out.println("End minus: " + SyncMainTest2.bankSync.getMoney());
    }

}

public class SyncMainTest {
    public static BankSync bank = new BankSync();

    public static void main(String[] args) throws InterruptedException {
        ParkSync park = new ParkSync();
        park.start();

        Thread.sleep(200);

        ParkWifeSync parkWife = new ParkWifeSync();
        parkWife.start();

        /*
        <result>
        * Start save
        * Start minus
        * End minus: 9000
        * End save: 13000

        Critical Section에 대해 동기화가 이루어지 않아서, 기대했던 결과가 나오지 않는다.
        * */
    }
}
