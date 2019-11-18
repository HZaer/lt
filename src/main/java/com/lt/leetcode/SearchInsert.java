package com.lt.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SearchInsert
{
    public static void main(String[] args)
    {
        int[] nums = {1, 3, 5, 6};
        int a = searchInsert(nums, 7);
        System.out.println(a);
        for (int aa : nums)
        {
            System.out.println(aa);
        }

    }

    public static int searchInsert(int[] nums, int target)
    {
        if (nums.length == 0)
        {
            return 0;
        }
        int min = 0, max = nums.length - 1;
        int index = -1;
        while (min <= max)
        {
            int mid = (min + max) / 2;
            if (nums[mid] < target)
            {
                min = mid + 1;
            }
            if (nums[mid] > target)
            {
                max = mid - 1;
            }
            if (nums[mid] == target)
            {
                index = mid;
                break;
            }
        }
        if (index != -1)
        {
            return index;
        }
        for (int i = 0; i < nums.length; i++)
        {
            if (target < nums[i])
            {
                return i;
            }
        }
        return nums.length;
    }

}
