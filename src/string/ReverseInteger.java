package string;

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

    public static int reverse1(int x) {
        long result = 0;
        while (Math.abs(x) > 0) {
            int remain = x % 10;
            result = result * 10 + remain;
            x = x / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
        return (int) result;
    }

    public static void main(String[] args) {
        int a = 50;
        int b = 4;
        int yu = a % b;
        while (yu != 0) {
            yu = a % b;
            b = b / yu;
            a = b;
        }
        int i = -143;
        int reverse = reverse1(i);
        System.out.println(reverse);
    }

}
