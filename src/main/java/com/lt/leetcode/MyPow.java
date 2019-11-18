package com.lt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 50. Pow(x, n)
 */
public class MyPow
{
    public static void main(String[] args)
    {
        int[] a = {0};
        System.out.println(myPow(12.0, 23));

    }

    private static double myPow(double x, int n)
    {
        if (n == 0)
        {
            return 1.0D;
        }
        double count = 1d;
        int a = 0;
        while (x == 2D)
        {
            x = x / 2;
            a = 2 << n - 1;
            count = count * a;
        }
        if (n < 0)
        {
            count = 1 / count;
        }
        return count;
    }
}
