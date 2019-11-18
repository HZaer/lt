package com.lt.leetcode;

/**
 * 寻找两个有序数组的中位数
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("qweewq"));
    }

    public static String longestPalindrome(String s) {

        return longestPalindrome(s, s.length());
    }

    private static String longestPalindrome(String s, int length) {
        return longestPalindrome(s, s.length());
    }
}
