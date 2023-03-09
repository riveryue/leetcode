package string;

public class StrToInt {

    public static int myAtoi(String s) {
        s = s.trim();
        int f = s.startsWith("-") ? -1 : 1;
        if (s.startsWith("-") || s.startsWith("+")) {
            s = s.substring(1);
        }
        char[] chars = s.toCharArray();
        int index = 0;
        int temp;
        int result = 0;
        while (index < chars.length) {
            int num = chars[index] - '0';
            if (num < 0 || num > 9) {
                break;
            }
            temp = result;
            result = result * 10 + num;
            if (result / 10 != temp) {
                if (f > 0) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            index++;
        }
        return result * f;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("+988F1234"));
    }
}
