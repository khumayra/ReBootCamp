package Java;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 9, 8, 7, 6, 5};
        System.out.println(Arrays.toString(reversingArray(arr1)));

    }
    public static int[] reversingArray(int[]arr){

        int lastIndex = arr.length-1;

        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[lastIndex-i];

            arr[lastIndex-i]=temp;

        }
        return arr;
    }
}
