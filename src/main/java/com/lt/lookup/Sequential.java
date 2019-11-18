package com.lt.lookup;


/**
 * 顺序查找
 */
public class Sequential {
    public static void main(String[] args) {
        int[] a = new int[10000];
        for (int i = 0; i < 10000; i++) {
            a[i] = i;
        }
        int key = 8999;
        long front = System.currentTimeMillis();
        System.out.println(sequentialLookup(a, key));
        System.out.println(System.currentTimeMillis() - front);
    }

    private static int sequentialLookup(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
