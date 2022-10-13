package 字符串;

public class MaxCommonPre {

    public static String longestCommonPrefix(String[] strs) {
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
        }
        return pre;
    }

    public static void main(String[] args) {
        System.out.println("okn".indexOf("l"));
        System.out.println("okn".indexOf("oki"));
        String[] strs = {"flowera", "flower", "flower"};
        System.out.println(longestCommonPrefix(strs));
        String [] str = {"dog","radocecar","cador"};
        System.out.println(longestCommonPrefix(str));
    }
}
