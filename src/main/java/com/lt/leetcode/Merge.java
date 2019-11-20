package com.lt.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 56. 合并区间
 */
public class Merge
{
    public static void main(String[] args)
    {
        //int[][] request = {{1, 4}, {1, 5}};
        //int[][] request = {{1, 4}, {2, 3}};
        //int[][] request = {{1, 4}, {1, 4}};
        //int[][] request = {{1, 4}, {4, 5}};
        //int[][] request = {{1, 4}, {5, 6}};
        int[][] request = {{1, 4}, {0, 4}};

        //int[][] request = {{2, 3}, {5, 8}, {2, 4}, {6, 9}, {12, 14}};
        //int[][] request = {{2, 3}, {5, 8}, {2, 4}, {6, 9}, {12, 14}, {1, 15}};
        Merge a = new Merge();
        int[][] o = a.merge(request);
        for (int[] r : o)
        {
            for (int rr : r)
            {
                System.out.println(rr);
            }
        }

    }

    private int[][] merge(int[][] intervals)
    {
        if (intervals.length == 1 || intervals.length == 0)
        {
            return intervals;
        }
        sort(intervals, 0, intervals.length-1);
        /*for (int i = 0; i < intervals.length - 1; i++)
        {
            for (int j = i + 1; j < intervals.length; j++)
            {
                if (intervals[i][0] > intervals[j][0])
                {
                    int[] temp = intervals[i];
                    intervals[i] = intervals[j];
                    intervals[j] = temp;
                }
            }
        }*/
        List<Integer> sub = new ArrayList<>();

        for (int i = 0, j = 1; j < intervals.length; j++)
        {
            if (intervals[i][1] < intervals[j][1])
            {
                if (intervals[i][1] >= intervals[j][0])
                {
                    intervals[i][1] = intervals[j][1];
                }
                else
                {
                    sub.add(i);
                    i = j;
                }
            }
            if (j == intervals.length - 1)
            {
                sub.add(i);
            }
        }
        int[][] result = new int[sub.size()][];
        for (int i = 0, j = 0; i < sub.size(); i++)
        {
            result[j++] = intervals[sub.get(i)];
        }
        return result;
    }

    public void sort(int[][] sortArray, int low, int height)
    {
        if (low < height)
        {
            int result = partition(sortArray, low, height);
            sort(sortArray, low, result - 1);
            sort(sortArray, result + 1, height);
        }
    }

    public int partition(int[][] sortArray, int low, int height)
    {
        int key = sortArray[low][0];// 刚开始以第一个数为标志数据
        while (low < height)
        {
            while (low < height && sortArray[height][0] >= key)
                height--;// 从后面开始找，找到比key值小的数为止
            sortArray[low] = sortArray[height];// 将该数放到key值的左边
            while (low < height && sortArray[low][0] <= key)
                low++;// 从前面开始找，找到比key值大的数为止
            sortArray[height] = sortArray[low];// 将该数放到key值的右边
        }
        sortArray[low][0] = key;// 把key值填充到low位置，下次重新找key值
        return low;
    }
}
