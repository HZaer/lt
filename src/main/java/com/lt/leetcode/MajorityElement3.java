package com.lt.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 229. 求众数 II
 * 我自己的方法：先排序，在查询
 */
public class MajorityElement3
{
    public static void main(String[] args)
    {
        MajorityElement3 a = new MajorityElement3();
        //int[] aa = {12, 33, 21, 1, 2, 34, 5, 1, 1,1};
        //int[] aa = {1, 1, 1, 3, 3, 2, 2, 2};
        int[] aa = {1};
        List<Integer> o = a.majorityElement(aa);
        for (int i : o)
        {
            System.out.println(i);
        }
    }

    private List<Integer> majorityElement(int[] nums)
    {
        List<Integer> result = new ArrayList<>();

        int len = nums.length;
        if (len == 0)
        {
            return result;
        }
        int flag = len / 3;
        Arrays.sort(nums);
        int s = 1;
        for (int i = 1; i < len; i++)
        {
            if (nums[i] != nums[i - 1])
            {
                if (s > flag)
                {
                    result.add(nums[i - 1]);
                }
                s = 1;
            }
            else
            {
                s++;
            }
        }
        if (s > flag)
        {
            result.add(nums[len - 1]);
        }
        return result;
    }
}
