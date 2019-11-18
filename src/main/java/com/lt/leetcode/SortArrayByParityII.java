package com.lt.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 922. 按奇偶排序数组 II
 */
public class SortArrayByParityII
{
    public static void main(String[] args)
    {
        int[] a = {0, 1};
        System.out.println(sortArrayByParityII(a));
        for (int c : sortArrayByParityII(a))
        {
            System.out.println(c);
        }
    }

    private static int[] sortArrayByParityII(int[] A)
    {
        int[] B = new int[A.length];
        int doub = 0;
        int one = 1;
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] % 2 == 0)
            {
                B[doub] = A[i];
                doub += 2;
            }
            else
            {
                B[one] = A[i];
                one += 2;
            }
        }
        return B;
    }
}
