package com.lt.sort;

public class MyQuickSort
{
    private void sort(int[] a, int low, int height)
    {
        if (low < height)
        {
            int result = choose(a, low, height);
            sort(a, low, result - 1);
            sort(a, result + 1, height);
        }
    }

    private int choose(int[] a, int low, int height)
    {
        int key = a[low];
        while (low < height)
        {
            while (low < height && a[height] >= key)
            {
                height--;
            }
            a[low] = a[height];
            while (low < height && a[height] <= key)
            {
                low++;
            }
            a[height] = a[low];
        }
        a[low] = key;
        return low;
    }
}
