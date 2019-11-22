package com.lt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 229. 求众数 II
 * 我自己的方法：先排序，在查询
 */
public class MajorityElement
{
    public static void main(String[] args)
    {
        MajorityElement a = new MajorityElement();
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
        quickSort(nums, 0, len - 1);
        int s = 1, num = nums[0];
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

    private void quickSort(int[] nums, int low, int high)
    {

        if (low < high)
        {
            int key = getKey(nums, low, high);
            quickSort(nums, low, key - 1);
            quickSort(nums, key + 1, high);
        }
    }

    private int getKey(int[] nums, int low, int high)
    {
        int key = nums[low];
        while (low < high)
        {
            while (low < high && nums[high] >= key)
                high--;
            nums[low] = nums[high];
            while (low < high && nums[low] <= key)
                low++;
            nums[high] = nums[low];
        }
        nums[low] = key;
        return low;
    }
}
