package com.lt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 229. 求众数 II
 * 摩尔投票法:
 * n/3表示数组内只有2个满足条件的数，先从找出两个票数最多的候选人，之后再遍历一遍，找出大于n/3的数
 */
public class MajorityElement2
{
    public static void main(String[] args)
    {
        MajorityElement2 a = new MajorityElement2();
        int[] aa = {12, 33, 21, 1, 2, 34, 5, 1, 1, 1};
        //int[] aa = {1, 1, 1, 3, 3, 2, 2, 2};
        //int[] aa = {1};
        List<Integer> o = a.majorityElement(aa);
        for (int i : o)
        {
            System.out.println(i);
        }
    }

    private List<Integer> majorityElement(int[] nums)
    {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;
        //初始化：定义两个候选人及其对应的票数
        int candidateA = nums[0];
        int candidateB = nums[0];
        int countA = 0;
        int countB = 0;
        //遍历数组
        for (int num : nums)
        {
            if (num == candidateA)
            {
                countA++;//投A
                continue;
            }
            if (num == candidateB)
            {
                countB++;//投B
                continue;
            }

            //此时当前值和AB都不等，检查是否有票数减为0的情况，如果为0，则更新候选人
            if (countA == 0)
            {
                candidateA = num;
                countA++;
                continue;
            }
            if (countB == 0)
            {
                candidateB = num;
                countB++;
                continue;
            }
            //若此时两个候选人的票数都不为0，且当前元素不投AB，那么A,B对应的票数都要--;
            countA--;
            countB--;
        }

        //上一轮遍历找出了两个候选人，但是这两个候选人是否均满足票数大于N/3仍然没法确定，需要重新遍历，确定票数
        countA = 0;
        countB = 0;
        for (int num : nums)
        {
            if (num == candidateA)
                countA++;
            else if (num == candidateB)
                countB++;
        }
        if (countA > nums.length / 3)
            res.add(candidateA);
        if (countB > nums.length / 3)
            res.add(candidateB);
        return res;
    }
}
