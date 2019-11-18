package com.lt.leetcode;

/**
 * 27. 移除元素
 */
public class RemoveElement
{
    public static void main(String[] args)
    {
        int[] a = {1};
        System.out.println(removeElement(a, 1));
        for (int aa : a)
            System.out.print(aa + "  ");
    }

    private static int removeElement(int[] nums, int val)
    {
        int result = 0;
        if (nums.length == 0)
        {
            return 0;
        }
        int temp = 0;
        int sub = nums.length - 1;
        for (int i = 0; i <= sub; i++)
        {
            while (sub >= 0 && nums[sub] == val)
            {
                sub--;
                result++;
            }
            if (nums[i] == val && i < sub)
            {
                temp = nums[i];
                nums[i] = nums[sub];
                nums[sub] = temp;
                sub--;
                result++;
            }
        }
        return nums.length - result;
    }
}
