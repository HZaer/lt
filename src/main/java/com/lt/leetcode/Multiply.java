package com.lt.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 43. 字符串相乘
 */
public class Multiply
{
    public static void main(String[] args)
    {
        int[] a = {2, 0, 6, 8, 9, 3};
        System.out.println(multiply("123", "456"));

    }

    private static String multiply(String num1, String num2)
    {
        if ("0".equals(num1) || "0".equals(num2) || num1.length() == 0 ||
            num2.length() == 0)
        {
            return "0";
        }
        if ("1".equals(num1))
        {
            return num2;
        }
        if ("1".equals(num2))
        {
            return num1;
        }
        int num1Len = num1.length();
        int num2Len = num2.length();
        int resultLen = num1Len + num2Len;
        int[] resultArray = new int[resultLen];

        //溢出数
        int overflow = 0;
        while (num1Len > 0)
        {
            int subNum1 =
                Integer.valueOf(num1.substring(num1Len - 1, num1Len));
            int sub = resultLen--;
            int num2LenSub = num2Len;
            while (num2LenSub > 0)
            {
                int subNum2 =
                    Integer.valueOf(num2.substring(num2LenSub - 1, num2LenSub));
                int a =
                    subNum1 * subNum2 + overflow + resultArray[sub - 1];
                if (a >= 10)
                {
                    resultArray[sub - 1] = a % 10;
                    overflow = a / 10;
                }
                else
                {
                    resultArray[sub - 1] = a;
                    overflow = 0;
                }
                sub--;
                num2LenSub--;
            }
            if (overflow > 0)
            {
                resultArray[sub - 1] = resultArray[sub - 1] + overflow;
                overflow = 0;
            }
            num1Len--;

        }
        StringBuilder stringBuilder = new StringBuilder();
        int flag = 0;
        for (int num : resultArray)
        {
            if (flag == 0 && num == 0)
            {
                continue;
            }
            stringBuilder.append(num);
            flag = 1;
        }
        return stringBuilder.toString();
    }
}
