package 字符串;

/**
 * 给你两个字符串haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回 -1 。
 */
public class Strstr {

    public static int strStr1(String haystack, String needle) {
        int i = 0;
        int j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
            if (j == needle.length()) {
                return i - j;
            }
        }
        return -1;
    }

    public static int strStr2(String haystack, String needle) {
        int limit = haystack.length() - needle.length();
        for (int i = 0; i <= limit; i++) {
            String substring = haystack.substring(i, i + needle.length());
            if (substring.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr1("leetcode", "leeto"));
        System.out.println(strStr2("mississippi", "issip"));
        System.out.println(strStr2("mississippi", "pi"));
    }
}
