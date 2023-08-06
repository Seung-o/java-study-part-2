package chapter31.Greedy;

public class GreedyProblem {
    public static void main(String[] args) {
        int[] coins = {500, 100, 50, 10};
        int price = 8370;

        for (int i = 0; i < coins.length; i++) {
            int count = price / coins[i];
            price = price % coins[i];

            System.out.println(coins[i] + ": " + count + "개");

        }
    }
}
