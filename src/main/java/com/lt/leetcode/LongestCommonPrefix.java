package com.lt.leetcode;

/**
 * 14. 最长公共前缀
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int flag = 0;
        StringBuilder sb = new StringBuilder();
        int length = strs[0].length();
        for (int i = 0; flag == 0 && i < length; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() == i || strs[0].charAt(i) != strs[j].charAt(i)) {
                    flag = 1;
                    break;
                }
                if (j == strs.length - 1) {
                    sb.append(strs[0].charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
