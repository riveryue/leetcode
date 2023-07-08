package sort;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 4, 2, 4, 7, 6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
