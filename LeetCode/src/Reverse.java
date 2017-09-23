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

    public static void main(String[] args) {
        System.out.println(reverse(47483647));
    }
}
