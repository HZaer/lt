package com.lt.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 989. 数组形式的整数加法
 */
public class ThreeSumClosest
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 5, 10, 11};
        System.out.println(threeSumClosest(a, 12));

    }

    private static int threeSumClosest(int[] nums, int target)
    {
        int len = nums.length;
        if (len == 0)
        {
            return 0;
        }
        int i = 0, j = 1;
        int result = 0;
        int poor = Integer.MAX_VALUE;
        while (i < len - 2)
        {
            int k = j + 1;
            while (k < len)
            {
                int a = Math.abs(target - (nums[i] + nums[j] + nums[k]));
                if (a < poor)
                {
                    poor = a;
                    result = nums[i] + nums[j] + nums[k];
                }
                k++;
            }
            j++;
            if (j > len - 2)
            {
                i++;
                j = i + 1;
            }
        }
        return result;
    }
}
