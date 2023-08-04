package chapter31.fibonacci;

public class Fibonacci {
    int[] values;
    int number;

    public Fibonacci(int number) {
        this.number = number;
        values = new int[number];
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(100);

        int resultByRecur = fib.fibonacciRecur(10);
        System.out.println("Result by recur: " + resultByRecur);

        int resultByIter = fib.fibonacciIter(10);
        System.out.println("Result by iter: " + resultByIter);
    }

    public int fibonacciRecur(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacciRecur(n - 1) + fibonacciRecur(n - 2);
    }

    public int fibonacciIter(int n) {
        int ppre = 0;
        int pre = 1;

        int current = 0;

        if (n == 0) return 0;
        if (n == 1) return 1;

        for (int i = 2; i <= n; i++) {
            current = pre + ppre;
            ppre = pre;
            pre = current;
        }

        return current;
    }
}
