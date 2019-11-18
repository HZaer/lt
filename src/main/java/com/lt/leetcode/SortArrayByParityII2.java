package com.lt.leetcode;

/**
 * 922. 按奇偶排序数组 II
 */
public class SortArrayByParityII2
{
    public static void main(String[] args)
    {
        int[] a = {3,1,4,2};
        System.out.println(sortArrayByParityII(a));
        for (int c : sortArrayByParityII(a))
        {
            System.out.println(c);
        }
    }

    private static int[] sortArrayByParityII(int[] A)
    {
        int doub = 0;
        int one = 1;
        int temp = 0;
        for (int i = 0; i < A.length; i += 2)
        {
            if (A[i] % 2 == 0)
            {
                temp = A[doub];
                A[doub] = A[i];
                A[i] = temp;
                doub += 2;
            }
            else
            {
                temp = A[one];
                A[one] = A[i];
                A[i] = temp;
                one += 2;
            }
        }
        return A;
    }
}
