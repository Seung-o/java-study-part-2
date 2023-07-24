package chapter16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();

        sList.add("Tom");
        sList.add("James");
        sList.add("Edward");

        Stream<String> stream1 = sList.stream();
        stream1.filter(s -> s.length() > 5).forEach(s -> System.out.println(s));

        System.out.println("===================");
        Stream<String> stream2 = sList.stream();
        stream2.sorted().forEach(s -> System.out.println(s));

        System.out.println("===================");
        Stream<String> stream3 = sList.stream();
        stream3.map(s -> s.length()).forEach(l -> System.out.println(l)); // map은 중간 연산, forEach는 최종 연산

    }
}
