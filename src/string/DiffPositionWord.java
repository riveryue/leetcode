package string;

import java.util.Arrays;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词
 */
public class DiffPositionWord {

    public boolean isAnagram(String s, String t) {
        int[] charArr1 = new int[26];
        int[] charArr2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charArr1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            charArr2[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < charArr1.length; i++) {
            if (charArr1[i] != charArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        for (int i : charCount) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }

    /**
     * only loop one time
     */
    public boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] cArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        //26个字母中每个字母出现次数的数组
        int[] charArr = new int[26];
        //s字符串中所有
        int count = 0;
        //遍历两字符数组
        for (int i = 0; i < cArr.length; i++) {
            //若cArr数组中的某一字符在charArr是第一次出现，则计数器加一
            if (++charArr[cArr[i] - 'a'] == 1) {
                count++;
            }
            //若tArr数组中的某一字符在charArr中已出现，则计数器减一
            if (--charArr[tArr[i] - 'a'] == 0) {
                count--;
            }
        }
        return count == 0;
    }

    public static void main(String[] args) {
        System.out.println(new DiffPositionWord().isAnagram("anagram", "nagaram"));
        System.out.println(new DiffPositionWord().isAnagram1("anagram", "nagaram"));
        System.out.println(new DiffPositionWord().isAnagram2("anagram", "nagaram"));
        System.out.println(new DiffPositionWord().isAnagram3("abc", "cba"));
    }
}
