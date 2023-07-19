package chapter8;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); // Compiler가 제네릭 형을 유추할 수 있기 때문에 따로 타입을 기입하지 않아도 됨.
        powderPrinter.setMaterial(new Powder());
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());

        System.out.println(powderPrinter);
        powderPrinter.doPrinting();

        System.out.println(plasticPrinter);
        plasticPrinter.doPrinting();
    }
}
