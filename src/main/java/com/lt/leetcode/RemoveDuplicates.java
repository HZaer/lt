package com.lt.leetcode;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        int[] a = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(a));
        for(int aa :a)
        System.out.print(aa+"  ");
    }

    private static int removeDuplicates(int[] nums)
    {
        if (nums.length==0){
            return 0;
        }
        int sum = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != nums[sum-1])
            {
                nums[sum] = nums[i];
                sum++;
            }
        }
        return sum;
    }
}
