package com.lt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 989. 数组形式的整数加法
 */
public class AddToArrayForm2
{
    public static void main(String[] args)
    {
        int[] a = {0};
        System.out.println(addToArrayForm(a, 23));

    }

    private static List<Integer> addToArrayForm(int[] A, int K)
    {
        int i = 0;
        int[] num = new int[5];
        while (K > 0)
        {
            num[i] = K % 10;
            K = K / 10;
            i++;
        }
        i = i - 1;
        List<Integer> result = new ArrayList<>();
        if (A == null || A.length == 0)
        {

            for (int j = i; j >= 0; j++)
            {
                result.add(num[j]);
            }
            return result;
        }
        int temp;
        for (int j = 0; i >= 0 && j <= i / 2; j++)
        {
            temp = num[j];
            num[j] = num[i - j];
            num[i - j] = temp;
        }
        int flag = 0;
        List<Integer> backResult = new ArrayList<>();
        if (A.length - 1 >= i)
        {
            int aLen = A.length - 1;
            for (int j = aLen; j >= 0; j--)
            {
                int count;
                if (i >= 0)
                {
                    count = A[j] + num[i] + flag;
                }
                else
                {
                    count = A[j] + flag;
                }
                if (count >= 10)
                {
                    backResult.add(count % 10);
                    flag = 1;
                }
                else
                {
                    backResult.add(count);
                    flag = 0;
                }
                i--;
            }
        }
        else
        {
            int aLen = A.length - 1;
            for (int j = i; j >= 0; j--)
            {
                int count;
                if (aLen >= 0)
                {
                    count = A[aLen] + num[j] + flag;
                }
                else
                {
                    count = num[j] + flag;
                }
                if (count >= 10)
                {
                    backResult.add(count % 10);
                    flag = 1;
                }
                else
                {
                    backResult.add(count);
                    flag = 0;
                }
                aLen--;
            }
        }
        if (flag == 1)
        {
            backResult.add(1);
        }
        for (int j = backResult.size() - 1; j >= 0; j--)
        {
            result.add(backResult.get(j));
        }
        return result;
    }
}
