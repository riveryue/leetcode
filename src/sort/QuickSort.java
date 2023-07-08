package sort;

import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = arr[start];
        int i = start - 1;
        int j = end + 1;
        while (i < j) {
            //左指针不停移动，直至找到一个大于基准值的i
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        sort(arr, start, j);
        sort(arr, j + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 3, 7, 6, 5, 7};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
