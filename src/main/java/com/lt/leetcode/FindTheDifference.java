package com.lt.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 389. 找不同
 */
public class FindTheDifference
{
    public static void main(String[] args)
    {
        int[] a = {2, 0, 6, 8, 9, 3};
        System.out.println(findTheDifference("a", "aa"));

    }

    private static char findTheDifference(String s, String t)
    {
        char[] sAr = s.toCharArray();
        char[] tAr = t.toCharArray();
        int[] sWords = new int[26];
        int[] tWords = new int[26];
        for (char sCh : sAr)
        {
            sWords[sCh - 'a']++;
        }
        for (char tCh : tAr)
        {
            tWords[tCh - 'a']++;
        }
        char result = 0;
        for (int i = 0; i < tWords.length; i++)
        {
            if (sWords[i] != tWords[i])
            {
                result = (char)(i + 'a');
            }
        }
        return result;
    }
}
