package com.lt.leetcode;

public class IsMatch
{
    public static void main(String[] args)
    {
        System.out.println(isMatch("", ""));
    }

    private static boolean isMatch(String s, String s1)
    {
        if (s.equals(s1))
        {
            return true;
        }
        if (s.equals("") || s1.equals(""))
        {
            return false;
        }
        
        return true;
    }
}
