package com.lt.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 22. 括号生成
 * 难度 中等
 */
public class GenerateParenthesis
{
    public static void main(String[] args)
    {

        System.out.println(generateParenthesis(2));

    }

    public static List<String> generateParenthesis(int n)
    {
        List<String> result = new ArrayList<>();

        if (n == 0)
        {
            return result;
        }
        Stack<String> par = new Stack<>();
        return result;
    }

}
