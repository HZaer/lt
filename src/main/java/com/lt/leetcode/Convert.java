package com.lt.leetcode;

/**
 * Z字形变换
 */
public class Convert {
    public static void main(String[] args) {
        System.out.println(convert("abcde", 5));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuffer sb = new StringBuffer();
        int interval = numRows * 2 - 2;
        int flag = 0;
        int a = 0;
        for (int i = 0; i < numRows; i++) {
            a = flag;
            for (int j = i; j < s.length(); j = j + a) {
                sb.append(s.charAt(j));
                if (i == 0 || i == numRows - 1) {
                    a = interval;
                } else {
                    a = interval - a;
                }
            }
            flag += 2;
        }
        return sb.toString();
    }

}
