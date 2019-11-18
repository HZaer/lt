package com.lt.leetcode;

/**
 * 66. 加一
 */
public class PlusOne
{
    public static void main(String[] args)
    {
        int[] a = {9, 9};
        for (int aa : plusOne(a))
        {
            System.out.println(aa);
        }

    }

    public static int[] plusOne(int[] digits)
    {
        int a = 0;
        int count = 0;
        digits[digits.length - 1] += 1;
        if (digits[digits.length - 1] > 10)
        {
            return digits;
        }
        for (int i = digits.length - 1; i >= 0; i--)
        {
            count = digits[i] + a;
            digits[i] = count % 10;
            a = count / 10;
            if (a == 0)
            {
                break;
            }
        }
        if (a == 1)
        {
            int[] otherResult = new int[digits.length + 1];
            otherResult[0] = 1;
            return otherResult;
        }
        return digits;
    }
}
