package com.lt.leetcode;


import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {18, 1, 2, 17};
        nums = twoSum(nums, 19);
        for (int a : nums) {
            System.out.println(a);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[a++] = i;
                    result[a++] = j;
                }
            }
        }
        return result;
    }
}
