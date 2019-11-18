package com.lt.lookup;


/**
 * 顺序查找
 * 忽略越界条件，增家哨兵
 */
public class Sequential2 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6};
        int key = 6;
        System.out.println(sequentialLookup(a, key));
    }

    private static int sequentialLookup(int[] a, int key) {
        int flag = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
