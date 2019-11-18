package com.lt.leetcode;

/**
 * 最长不重复子串
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println("asd".charAt(1));
        System.out.println(lengthOfLongestSubstring("au"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;

        char[] strChar = s.toCharArray();
        for (int i = 0; i < strChar.length; i++) {
            int count = 1;
            if (count > result) {
                result = count;
            }
            for (int j = i + 1; j < strChar.length; j++) {
                String str = s.substring(i, j);
                if (strChar[i] != strChar[j] && !str.contains(String.valueOf(strChar[j]))) {
                    count++;
                } else {
                    if (count > result) {
                        result = count;
                    }
                    count = 1;
                    break;
                }
                if (count > result) {
                    result = count;
                }
            }
        }
        return result;
    }
}
