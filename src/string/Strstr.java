package string;

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
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean eq  = true;
            for (int j = 0; j < needle.length(); j++) {
                char c1 = haystack.charAt(i + j);
                char c2 = needle.charAt(j);
                if (c1 != c2) {
                    eq = false;
                    break;
                }
            }
            if (eq) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("mississippi", "issip"));
        System.out.println(strStr("mississippi", "pi"));
    }
}
