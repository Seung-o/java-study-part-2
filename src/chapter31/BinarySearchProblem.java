package chapter31;

public class BinarySearchProblem {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 100};
        int target = 25;

        int left = 0;
        int right = numbers.length - 1;
        int mid = (left + right) / 2;
        int temp = numbers[mid];
        boolean find = false;

        while (left <= right) {
            if (target == temp) {
                find = true;
                break;
            } else if (target < temp) {
                right = mid - 1;
            } else if (target > temp) {
                left = mid + 1;
            }

            mid = (right + left) / 2;
            temp = numbers[mid];
        }

        if (find) {
            System.out.println("Result idx: " + mid);
        } else {
            System.out.println("No Result");
        }
    }
}
