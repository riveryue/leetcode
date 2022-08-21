package 字符串;

/**
 * 整数反转
 */
public class ReverseInteger {

    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        String s = String.valueOf(x);
        StringBuilder res = new StringBuilder();
        int f = x > 0 ? 1 : -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != '-') {
                res.append(s.charAt(i));
            }
        }
        try {
            return Integer.parseInt(res.toString()) * f;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        int i = -143;
        int reverse = reverse(i);
        System.out.println(reverse);

    }
}
