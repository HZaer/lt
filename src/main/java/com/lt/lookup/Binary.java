package com.lt.lookup;


/**
 * 折半查找
 */
public class Binary {
    public static void main(String[] args) {
        int[] a = new int[10000];
        for (int i = 0; i < 10000; i++) {
            a[i] = i;
        }
        int key = 8999;
        long front = System.currentTimeMillis();
        System.out.println(binaryLookup(a, key));
        System.out.println(System.currentTimeMillis() - front);
    }

    private static int binaryLookup(int[] a, int key) {
        int left, mid, right;
        left = 0;
        right = a.length - 1;
        while (left <= right) {
            mid = (left + right) / 2;
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
