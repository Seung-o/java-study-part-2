package chapter25;

public class Latte extends CoffeeDecorator {
    public Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Adding milk");
    }
}
