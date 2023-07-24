package chapter15;


@FunctionalInterface
interface PrintString {
    void showString(String str);
}

public class LambdaTest {
    public static void showMyString(PrintString str) {
        str.showString("showMyString");
    }

    public static void main(String[] args) {
        PrintString printString = (str -> System.out.println(str));
        printString.showString("main");

        showMyString(printString); // 자바스크립트처럼 함수를 매개변수로 사용할 수도 있다.
    }
}
