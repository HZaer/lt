package com.lt.leetcode;

public class FindMedianSortedArrays {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int[] b = {1, 2, 4, 5};
        System.out.println(findMedianSortedArrays(a, b));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        int maxLength = length1 > length2 ? length1 : length2;
        int[] a = new int[length1 + length2];
        for (int i = 0; i < maxLength; i++) {

        }
        return result;
    }
}
