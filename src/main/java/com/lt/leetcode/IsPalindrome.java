package com.lt.leetcode;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));

    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x / 10 == 0) {
            return true;
        }
        String str = String.valueOf(x);
        for (int i = 0; i < str.length() - 1 - i; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
