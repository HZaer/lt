package com.lt.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 38. 报数
 * 难度 简单
 */
public class CountAndSay
{
    public static void main(String[] args)
    {

        System.out.println(countAndSay(5));

    }

    public static String countAndSay(int n)
    {
        String result = "1";
        for (int i = 2; i <= n; i++)
        {
            StringBuilder sb = new StringBuilder();
            int j = 0;
            char a = result.charAt(j);
            int count = 1;
            while (j < result.length())
            {
                j++;
                if (j >= result.length())
                {
                    sb.append(count).append(a);
                    result = sb.toString();
                    break;
                }
                if (result.charAt(j) != a)
                {
                    sb.append(count).append(a);
                    count = 1;
                    a = result.charAt(j);
                    continue;
                }
                count++;
            }
        }
        return result;
    }

}
