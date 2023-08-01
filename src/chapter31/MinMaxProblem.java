package chapter31;

public class MinMaxProblem {
    public static void main(String[] args) {
        int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

        int min = numbers[0];
        int max = numbers[0];

        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIdx = i;
            }

            if (numbers[i] > max) {
                max = numbers[i];
                maxIdx = i;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("MaxIdx: " + maxIdx);
        System.out.println("Min: " + min);
        System.out.println("MinIdx: " + minIdx);
    }
}
