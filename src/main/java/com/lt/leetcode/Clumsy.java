package com.lt.leetcode;

/**
 *
 */
public class Clumsy {
    public static void main(String[] args) {
        System.out.println(clumsy(10));
    }

    private static int clumsy(int N) {
        int sum = 0;
        int count = 0;
        int a = 0;
        for (int i = N; i > 0; i = i - 4) {
            if (i >= 3) {
                count = i * (i - 1) / (i - 2);
            }
            if (i == 2) {
                count = i * (i - 1);
            }
            if (i == 1) {
                count = i;
            }
            if (sum != 0) {
                sum = sum - count;
            } else {
                sum = count;
            }
            if (i > 3) {
                sum = sum + (i - 3);
            }
        }
        return sum;
    }
}
