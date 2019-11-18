package com.lt.leetcode;

/**
 * 67. 二进制求和
 */
public class AddBinary
{
    public static void main(String[] args)
    {
        int[] a = {2, 0, 6, 8, 9, 3};
        System.out.println(addBinary("10", "1"));

    }

    public static String addBinary(String a, String b)
    {
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int sLen = (aLen > bLen ? aLen : bLen) + 1;
        char[] s = new char[sLen + 1];
        int sum, num = 0;
        while (bLen >= 0 && aLen >= 0)
        {
            sum = a.charAt(aLen) + b.charAt(bLen) - 96 + num;
            num = sum / 2;
            s[sLen--] = (char)(sum % 2 + 48);
            aLen--;
            bLen--;
        }
        while (aLen >= 0)
        {
            if (num == 0)
            {
                s[sLen--] = a.charAt(aLen--);
                continue;
            }
            sum = a.charAt(aLen) - 48 + num;
            num = sum / 2;
            s[sLen--] = (char)(sum % 2 + 48);
            aLen--;
        }
        while (bLen >= 0)
        {
            if (num == 0)
            {
                s[sLen--] = b.charAt(bLen--);
                continue;
            }
            sum = b.charAt(bLen) - 48 + num;
            num = sum / 2;
            s[sLen--] = (char)(sum % 2 + 48);
            bLen--;
        }
        s[0] = (char)(num + 48);
        String result = String.valueOf(s);
        if (s[0] == '0')
        {
            return result.substring(1, result.length());
        }
        return result;

    }

}
