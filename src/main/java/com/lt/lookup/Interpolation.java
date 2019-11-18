package com.lt.lookup;


/**
 * 折半查找
 */
public class Interpolation {
    public static void main(String[] args) {
        int[] a = new int[10000];
        for (int i = 0; i < 4; i++) {
            a[i] = i;
        }
        int key = 2;
        long front = System.currentTimeMillis();
        System.out.println(interpolationLookup(a, key));
        System.out.println(System.currentTimeMillis() - front);
    }

    private static int interpolationLookup(int[] a, int key) {
        int left, mid, right;
        left = 0;
        right = a.length - 1;
        while (left <= right) {
            mid = left + (right - left) * (key - a[left]) / (a[right] - a[left]);
            if (key > a[mid]) {
                left = mid + 1;
            }
            if (key < a[mid]) {
                right = mid - 1;
            }
            if (key == a[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
