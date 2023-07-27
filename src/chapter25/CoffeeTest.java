package chapter25;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing();

        System.out.println("========================");

        Coffee kenyaLatte = new Latte(new KenyaAmericano());
        kenyaLatte.brewing();

        System.out.println("========================");

        Coffee mochaEtiopiaLatte = new Mocha(new Latte(new EtiopiaAmericano()));
        mochaEtiopiaLatte.brewing();
    }
}
