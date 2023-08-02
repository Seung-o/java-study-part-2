package chapter31;

public class InsertionSortProblem {
    public static void insertionSort(int[] arr, int count) {
        int i = 0, j = 0;
        int temp = 0;

        for (i = 1; i < count; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;
            System.out.println("i: " + i);
            printArr(arr);
        }

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {80, 50, 70, 10, 60, 20, 40, 30};
        insertionSort(arr, arr.length);
    }
}
