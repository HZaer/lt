package com.lt.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 989. 数组形式的整数加法
 */
public class AddToArrayForm
{
    public static void main(String[] args)
    {
        int[] a = {2, 0, 6, 8, 9, 3};
        System.out.println(addToArrayForm(a, 237));

    }

    private static List<Integer> addToArrayForm(int[] A, int K)
    {
        List<Integer> result = new ArrayList<>();
        int i = A.length - 1;
        int count = A[i] + K;
        i--;
        if (count == 0)
        {
            result.add(0);
            return result;
        }
        while (count > 0 || i >= 0)
        {
            result.add(count % 10);
            count = count / 10;
            if (i >= 0)
            {
                count = count + A[i];
                i--;
            }
        }
        Collections.reverse(result);
        return result;
    }
}
