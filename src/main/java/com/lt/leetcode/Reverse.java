package com.lt.leetcode;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(1563847412));
    }

    public static int reverse(int x) {
        int a[] = new int[10];
        int sum = x;
        int count = 1;
        for (int i = 0; i < 10; i++) {
            a[i] = sum % 10;
            sum = sum / 10;
            if (sum == 0) {
                break;
            }
            count = count * 10;
        }
        if (sum != 0 || (Math.abs(a[0]) > 2 && a[9] != 0)) {
            return 0;
        }
        long result = 0;
        for (int j = 0; j < a.length; j++) {
            result += a[j] * count;
            count = count / 10;
        }
        if (result > Math.pow(2.0, 31.0) - 1 || result < Math.pow(-2.0, 31.0)) {
            return 0;
        }
        return (int) result;
    }
}
