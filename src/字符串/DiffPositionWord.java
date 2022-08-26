package 字符串;

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

    public static void main(String[] args) {
        System.out.println(new DiffPositionWord().isAnagram("anagram", "nagaram"));
    }
}
