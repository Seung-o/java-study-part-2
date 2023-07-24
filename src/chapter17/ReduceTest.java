package chapter17;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        return s1.length() >= s2.length() ? s1 : s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"안녕하세요", "hello", "Good Morning"};
        String longestGreeting = Arrays.stream(greetings).reduce("", (s1, s2) -> s1.length() >= s2.length() ? s1 : s2);
        System.out.println(longestGreeting);

        String longestGreetingByCompareString = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(longestGreetingByCompareString);
    }
}
