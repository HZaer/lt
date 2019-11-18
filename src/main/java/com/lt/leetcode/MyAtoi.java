package com.lt.leetcode;

public class MyAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("20000000000000000000"));
    }

    public static int myAtoi(String str) {
        if ("".equals(str) || " ".equals(str)) {
            return 0;
        }
        int isSpace = 0, isBegin = 0;
        boolean isMinus = false;
        StringBuffer sb = new StringBuffer();
        long result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isSpace == 0) {
                if (str.charAt(i) == ' ') {
                    continue;
                } else {
                    isSpace = 1;
                }
            }

            if (++isBegin == 1) {
                if (str.charAt(i) == '-') {
                    isMinus = true;
                    sb.append('-');
                } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    sb.append(str.charAt(i));
                } else if (str.charAt(i) == '+') {
                } else {
                    return 0;
                }
            } else {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    sb.append(str.charAt(i));
                } else {
                    break;
                }
            }
        }
        try {
            result = Long.valueOf(sb.toString());
        } catch (Exception e) {
            if (sb.toString().length() > 11) {
                if (!isMinus) {
                    return (int) Math.pow(2.0, 31);
                } else {
                    return (int) Math.pow(-2.0, 31);
                }
            }
            return 0;
        }
        if (result >= Math.pow(2.0, 31) - 1) {
            return (int) Math.pow(2.0, 31) - 1;
        }
        if (result <= Math.pow(-2.0, 31)) {
            return (int) Math.pow(-2.0, 31);
        }
        return (int) result;
    }
}
