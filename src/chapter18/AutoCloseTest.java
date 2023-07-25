package chapter18;

public class AutoCloseTest {
    public static void main(String[] args) {
        AutoCloseObj obj = new AutoCloseObj();
        try (obj) {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
