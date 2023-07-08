package search;

public class BinarySearch {
    /**
     * 在有序数组中查找目标值的下标
     */
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int searchRecursion(int[] arr, int start, int end, int target) {
        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] < target) {
            return searchRecursion(arr, mid + 1, end, target);
        } else if (arr[mid] > target) {
            return searchRecursion(arr, start, mid - 1, target);
        } else {
            return mid;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 9, 10, 10, 13};
        System.out.println(search(arr, 10));
        System.out.println(searchRecursion(arr, 0, arr.length -1 ,10));
    }
}
