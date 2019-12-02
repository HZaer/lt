package com.lt.leetcode;

import java.util.Arrays;

/**
 * 204. 计数质数
 */
public class CountPrimes
{
    public static void main(String[] args)
    {
        CountPrimes a = new CountPrimes();
        Object o = a.countPrimes(499979);
        System.out.println(o);
    }

    private int countPrimes(int n)
    {
        int count = 0;
        boolean[] isPrimes = new boolean[n];
        Arrays.fill(isPrimes, true);
        for (int i = 2; i*i < n; i++)
        {
            if (isPrimes[i])
            {
                for (int j = i * i; j < n; j += i)
                {
                    isPrimes[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++)
        {
            if (isPrimes[i])
            {
                count++;
            }
        }
        return count;
    }
}
