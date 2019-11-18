package com.lt.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class SpiralOrder
{
    public static void main(String[] args)
    {
        int[][] a = {{1, 2, 3,4}, { 5, 6,7,8}, {9,10,11,12}};
        System.out.println(spiralOrder(a));
    }

    private static List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> result = new ArrayList<>();
        if(matrix.length==0){
           return  result;
        }

        int a = 0;//左上
        int b = matrix.length; //左下
        int c = 0;//右上
        int d = matrix[0].length;//右下
        int len = b * d - 1;
        int i = 0, j = 0;
        while (len >= 0)
        {
            while (j < d)
            {
                result.add(matrix[i][j]);
                j++;
                len--;
            }
            d--;
            i++;
            j--;
            if(len<0){
                break;
            }
            while (i < b)
            {
                result.add(matrix[i][j]);
                i++;
                len--;
            }
            b--;
            i--;
            j--;
            if(len<0){
                break;
            }
            while (j >= a)
            {
                result.add(matrix[i][j]);
                j--;
                len--;
            }
            a++;
            i--;
            j++;
            if(len<0){
                break;
            }
            while (i > c)
            {
                result.add(matrix[i][j]);
                i--;
                len--;
            }
            c++;
            i++;
            j++;
        }
        return result;
    }
}
