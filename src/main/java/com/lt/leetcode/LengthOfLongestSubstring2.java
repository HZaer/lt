package com.lt.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring2 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("basdfs"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), a = 0;
        int[] index = new int[26];
        int i = 0;
        for (int j = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            a = Math.max(a, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return a;
    }
}