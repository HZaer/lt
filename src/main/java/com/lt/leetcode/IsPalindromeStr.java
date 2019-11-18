package com.lt.leetcode;

/**
 * 125. 验证回文串
 * 我使用了递归，但是把解法复杂化了，可以直接当字符不为数字、大小写字母时直接continue。
 */
public class IsPalindromeStr
{
    public boolean isPalindrome(String s)
    {
        if (s.length() == 0 || s.length() == 1)
        {
            return true;
        }
        int a = 0;
        int b = s.length() - 1;
        while (a <= b)
        {
            a = check(s, a, 1);
            if (a == s.length())
            {
                return true;
            }
            b = check(s, b, 0);
            if (!(s.charAt(a) == s.charAt(b) || (s.charAt(a) >= 65 &&
                (s.charAt(a) - 32 == s.charAt(b) ||
                    s.charAt(a) + 32 == s.charAt(b)))))
            {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }

    private int check(String s, int a, int flag)
    {
        if ((s.charAt(a) >= 48 && s.charAt(a) <= 57) ||
            (s.charAt(a) >= 65 && s.charAt(a) <= 90) ||
            (s.charAt(a) >= 97 && s.charAt(a) <= 122))
        {
            return a;
        }
        if (flag == 1)
        {
            a++;
        }
        else
        {
            a--;
        }
        if (a == s.length())
        {
            return s.length();
        }
        return check(s, a, flag);
    }

    public static void main(String[] args)
    {
        System.out.println(new IsPalindromeStr().isPalindrome(
            "0P"));
    }
}
