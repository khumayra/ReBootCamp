package Java;

import java.util.Arrays;

public class SortArrayWithoutMethod {
    public static void main(String[] args) {
        int[] arr = {9, 1, 7, 0, 2, 6, 4, 8, 5, 3};
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
