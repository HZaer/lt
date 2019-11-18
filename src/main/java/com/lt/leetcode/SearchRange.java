package com.lt.leetcode;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * 正确的方法使用二分查找
 */
public class SearchRange
{
    public static void main(String[] args)
    {
        int[] a = {1};
        SearchRange s = new SearchRange();
        int[] result = s.searchRange(a, 1);
        System.out.println(result[0] + "，" + result[1]);

    }

    public int[] searchRange(int[] nums, int target)
    {
        int a = -1;
        int b = -1;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == target)
            {
                a = i;
                b = i;
                break;
            }
        }
        if (a != -1)
        {
            for (int i = a + 1; i < nums.length; i++)
            {
                if (nums[i] != target)
                {
                    break;
                }
                b = i;
            }
        }

        int[] result = {a, b};
        return result;
    }

}
