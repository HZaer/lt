package com.lt.leetcode;

/**
 * 258. 各位相加
 *
 */
public class AddDigits
{
    public static void main(String[] args)
    {
        AddDigits a = new AddDigits();
        int o = a.addDigits(2322);
        System.out.println(o);
    }

    private int addDigits(int num)
    {
        if (num < 10)
        {
            return num;
        }
        while (num > 10)
        {
            num = countNum(num, 0);
        }
        return num;
    }

    private int countNum(int result, int count)
    {
        if (result < 10)
        {
            return result + count;
        }
        count = count + result % 10;
        return countNum(result / 10, count);
    }
}
