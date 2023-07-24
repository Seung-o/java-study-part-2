package chapter16;

import java.util.Arrays;

public class ArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(arr).sum(); // Stream은 메모리를 따로 할당하고,최종 연산 되는 시점에 사라진다.
        System.out.println(sum);

        long count = Arrays.stream(arr).count();
        System.out.println(count);
    }
}
