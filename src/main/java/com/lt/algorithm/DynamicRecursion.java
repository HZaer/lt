package com.lt.algorithm;

public class DynamicRecursion
{
    public static void main(String[] args)
    {
        System.out.println(fib(20));
    }
    static int   fib(int n) {
        if (n < 2) return n;
        int prev = 0, curr = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }

}
