package chapter25;

public class Mocha extends CoffeeDecorator {
    public Mocha(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Adding mocha");
    }
}
