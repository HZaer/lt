package com.lt.leetcode;

/**
 * 11. 盛最多水的容器
 * 双指针法
 */
public class MaxArea2 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        int max = 0;
        while (left < right) {
            area = height[left] < height[right] ? height[left] * (right - left) : height[right] * (right - left);
            if (area > max) {
                max = area;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

}
