package 字符串;

/**
 * 反转字符串
 */
public class ReverseString {

    public static char[] solution1(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char t = s[left];
            s[left] = s[right];
            s[right] = t;
            left++;
            right--;
        }
        return s;
    }

    public static char[] solution2(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            int j = s.length - i - 1;
            char word = s[i];
            s[i] = s[j];
            s[j] = word;
        }
        return s;
    }
    public static void main(String[] args) {
        char [] arr1 = {'p','r','o','g','r','a', 'm'};
        System.out.println(solution1(arr1));
        System.out.println(solution2(arr1));
    }
}

