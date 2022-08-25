package 字符串;

/**
 * 字符串中的第一个唯一字符
 */
public class UniqueChar {

    public int firstUniqChar(String s) {
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            boolean isRepeat = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j) {
                    char c2 = s.charAt(j);
                    if (c1 == c2) {
                        isRepeat = true;
                        break;
                    }
                }
            }
            if (!isRepeat) {
                return i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(new UniqueChar().firstUniqChar("aabc"));
    }
}
