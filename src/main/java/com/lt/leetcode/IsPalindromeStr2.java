package com.lt.leetcode;

/**
 * 125. 验证回文串
 * 我使用了递归，但是把解法复杂化了，可以直接当字符不为数字、大小写字母时直接continue。
 */
public class IsPalindromeStr2
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
            if (!check(s, a))
            {
                a++;
                continue;
            }
            if (!check(s, b))
            {
                b--;
                continue;
            }
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

    private boolean check(String s, int a)
    {
        return (s.charAt(a) >= 48 && s.charAt(a) <= 57) ||
            (s.charAt(a) >= 65 && s.charAt(a) <= 90) ||
            (s.charAt(a) >= 97 && s.charAt(a) <= 122);
    }

    public static void main(String[] args)
    {
        System.out.println(new IsPalindromeStr2().isPalindrome(
            " "));
    }
}
