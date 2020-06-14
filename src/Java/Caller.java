package Java;

import java.util.Arrays;

public class Caller {
    public static void main(String[] args) {
        char[] array = {'D', 'C', 'A', 'B'};
        Arrays.sort(array);
        for (char each : array) {
            System.out.println(each + " ");
            if (each == 'D') {
                continue;
            }
        }
    }
}