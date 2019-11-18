package com.lt.leetcode;

/**
 * 125. 验证回文串
 * 我使用了递归，但是把解法复杂化了，可以直接当字符不为数字、大小写字母时直接continue。
 */
public class IsPalindromeStr3
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
            if (!((s.charAt(a) >= 48 && s.charAt(a) <= 57) ||
                (s.charAt(a) >= 65 && s.charAt(a) <= 90) ||
                (s.charAt(a) >= 97 && s.charAt(a) <= 122)))
            {
                a++;
                continue;
            }
            if (!((s.charAt(b) >= 48 && s.charAt(b) <= 57) ||
                (s.charAt(b) >= 65 && s.charAt(b) <= 90) ||
                (s.charAt(b) >= 97 && s.charAt(b) <= 122)))
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

    public static void main(String[] args)
    {
        System.out.println(new IsPalindromeStr3().isPalindrome(
            "A man, a plan, a canal: Panama"));
    }
}
