package com.lt.lookup;

import java.util.Arrays;

public class FibonaciSearch {

    static int[] f = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

    /**
     * 斐波那契查找(黄金分割原理)
     *
     * @param a   待查询数组
     * @param key 待查找关键字
     * @return 返回关键字在a数组中的下标，返回-1表示数组中不存在此关键字
     */
    public static int fibonaciSearch(int[] a, int key) {
        int low, mid, high, k;
        low = 0;
        high = a.length - 1;
        // 斐波那契数列下标
        k = 0;
        // 获取斐波那契分割值下标
        while (high > f[k] - 1)
            k++;
        // 利用Java工具类Arrays构造长度为f[k]的新数组并指向引用a
        a = Arrays.copyOf(a, f[k]);
        // 对新数组后面多余的元素赋值最大的元素
        for (int i = high + 1; i < f[k]; i++) {
            a[i] = a[high];//当key是是最大值时候，防止角标越界异常
        }
        while (low <= high) {
            // 前半部分有f[k-1]个元素，由于下标从0开始
            // 减去 1 获取 分割位置元素的下标
            mid = low + f[k - 1] - 1;

            if (key < a[mid]) {// 关键字小于分割位置元素，则继续查找前半部分，高位指针移动
                high = mid - 1;
                // (全部元素) = (前半部分)+(后半部分)
                // f[k] = f[k-1] + f[k-2]
                // 因为前半部分有f[k-1]个元素， 则继续拆分f[k-1] = f[k-2] + f[k-3]成立
                // 即在f[k-1]个元素的前半部分f[k-2]中继续查找，所以k = k - 1,
                // 则下次循环mid = low + f[k - 1 - 1] - 1;
                k = k - 1;
            } else if (key > a[mid]) {// 关键字大于分割位置元素，则查找后半部分，低位指针移动
                low = mid + 1;
                // (全部元素) = (前半部分)+(后半部分)
                // f[k] = f[k-1] + f[k-2]
                // 因为后半部分有f[k-2]个元素， 则继续拆分f[k-2] = f[k-3] + f[k-4]成立
                // 即在f[k-2]个元素的前半部分f[k-3]继续查找，所以k = k - 2,
                // 则下次循环mid = low + f[k - 2 - 1] - 1;
                k = k - 2;
            } else {
                // 当条件成立的时候，则找到元素
                if (mid <= high)
                    return mid;
                else
                    // 出现这种情况是查找到补充的元素
                    // 而补充的元素与high位置的元素一样
                    return high;
            }
        }
        return -1;
    }
}
