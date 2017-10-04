/*
Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321
 */
public class Reverse {
    public static int reverse(int x) {
        try {
            Integer integer = new Integer(x);
            String xString = integer.toString();
            StringBuffer xStringBuffer = new StringBuffer();
            StringBuffer result = new StringBuffer();
            if (xString.substring(0, 1).equalsIgnoreCase("-")) {
                xStringBuffer.append(xString.substring(1));

                result.append("-").append(xStringBuffer.reverse().toString());
            } else {
                xStringBuffer.append(xString);

                result.append(xStringBuffer.reverse().toString());
            }

            return Integer.parseInt(result.toString());
        } catch (Exception e) {
            return 0;
        }

    }

    public static int reverse1(int x) {
        boolean isPos = true;
        int num = Math.abs(x);
        long result = 0;
        long[] number = new long[10];
        if (x < 0) {
            isPos = false;
        }
        int i;
        for (i = 0; i < number.length && num != 0; i++) {
            number[i] = num % 10;
            num = num / 10;
        }
        for (int k = 0; k < i; k++) {
            for (int j = i - k - 2; j >= 0; j--) {
                number[k] = number[k] * 10;
            }
        }
        for (int j = 0; j < i; j++) {
            result += number[j];

        }
        if (!isPos) {
            result = (-1) * result;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }

    public int reverseMostLeastTime(int x) {
        int res = 0;
        while (x != 0) {
            int newRes = res * 10 + x % 10;
            if ((newRes - x % 10) / 10 != res)
                return 0;
            res = newRes;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse1(2136478999));
    }
}
