package com.lt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 罗马转数字
 */
public class RomanToInt
{
    public int romanToInt(String s)
    {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans =
            {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV",
                "I"};
        int num = 0;
        for (int i = 0, a = 0; a < s.length(); i++)
        {
            if (i == 13)
            {
                i = 0;
            }
            if (a + 2 <= s.length() && romans[i].equals(s.substring(a, a + 2)))
            {
                num += nums[i];
                a = a + 2;
            }
            else if (a + 1 <= s.length() &&
                romans[i].equals(s.substring(a, a + 1)))
            {
                num += nums[i];
                a = a + 1;
            }
        }

        return num;
    }

    public static void main(String[] args)
    {
        RomanToInt intToRoman = new RomanToInt();
        System.out.println(intToRoman.romanToInt("MCMXCIV"));
    }
}
