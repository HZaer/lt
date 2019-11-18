package com.lt.leetcode;

/**
 * 11. 盛最多水的容器
 */
public class MaxArea {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int area = 0;
        int max = 0;
        int a, j;
        for (int i = 0; i < height.length; i++) {
            a = 1;
            for (j = i + 1; j < height.length; j++) {
                area = height[i] < height[j] ? height[i] * a : height[j] * a;
                if (area > max) {
                    max = area;
                }
                a++;
            }
        }
        return max;
    }
}
