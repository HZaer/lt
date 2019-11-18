package com.lt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 20. 有效的括号
 * 栈
 */
public class IsValid
{
/*    char[] small = {'(', ')'};

    char[] mid = {'[', ']'};

    char[] max = {'{', '}'};*/

    public static void main(String[] args)
    {
        System.out.println(isValid("{"));
    }

    private static boolean isValid(String s)
    {
        if ("".equals(s))
        {
            return true;
        }
        List<Character> stock = new ArrayList<>();
        int value = 0;
        int top = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char element = s.charAt(i);
            if (element == 40 || element == 91 || element == 123)
            {
                stock.add(element);
                top++;
                value = element;
            }
            else
            {
                if (element == value + 1 || element == value + 2)
                {
                    stock.remove(top - 1);
                    top--;
                    if (top != 0)
                    {
                        value = stock.get(top - 1);
                    }
                }
                else
                {
                    return false;
                }
            }
        }
        if (stock.size() != 0)
        {
            return false;
        }
        return true;
    }
}
