package chapter14;

public class AddTest {
    public static void main(String[] args) {
        Add addFunction = (x, y) -> x + y;
        int result = addFunction.add(3, 5);
        System.out.println(result);
    }
}
