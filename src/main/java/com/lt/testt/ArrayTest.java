package com.lt.testt;

public class ArrayTest
{
    public static void main(String[] args)
    {
        int[][] a = {{1, 2}, {2, 3}, {3, 4}, {1, 2}};
        a[0] = a[1];
        a[1][1] = 4;
        System.out.println(a[0][0] + "" + a[0][1]);
    }
}
