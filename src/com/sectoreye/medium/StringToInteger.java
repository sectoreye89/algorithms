package com.sectoreye.medium;

/**
 * Created by sectoreye on 2019-02-27.
 */
class StringToInteger {

    private static int myAtoi(String str) {
        if (str == null) {
            return 0;
        }

        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }

        char firstChar = str.charAt(0);
        int sign = 1, numberStartIndex = 0;
        if (firstChar == '-') {
            sign = -1;
            numberStartIndex++;
        } else if (firstChar == '+') {
            numberStartIndex++;
        }

        long sum = 0;
        for (int i = numberStartIndex; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!Character.isDigit(c)) {
                return (int) sum * sign;
            }

            sum = (sum * 10) + str.charAt(i) - '0';

            if (sign == 1 && sum > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign == -1 && (-1) * sum < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) sum * sign;
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("2147483648"));
    }
}
