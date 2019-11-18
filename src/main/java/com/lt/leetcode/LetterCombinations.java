package com.lt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 125. 验证回文串
 * 我使用了递归，但是把解法复杂化了，可以直接当字符不为数字、大小写字母时直接continue。
 */
public class LetterCombinations
{
    private String[] str =
        {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits)
    {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0)
        {
            return result;
        }
        for (int j = 0;
             j < str[Integer.valueOf(digits.substring(0, 1))-2].length(); j++)
        {
            result.add(
                String.valueOf(str[Integer.valueOf(digits.substring(0,
                    1)) - 2].charAt(j)));
        }
        result = getList(result, digits, 1);
        return result;
    }

    private List<String> getList(List<String> list, String digits, int index)
    {
        List<String> newList = new ArrayList<>();
        if (index == digits.length())
        {
            return list;
        }
        else
        {
            for (String c : list)
            {
                for (int j = 0; j <
                    str[Integer.valueOf(digits.substring(index, index + 1)) -
                        2].length(); j++)
                {
                    newList.add(
                        c + String.valueOf(str[
                            Integer.valueOf(digits.substring(index,
                                index + 1)) -
                                2].charAt(j)));
                }
            }

        }
        index++;
        return getList(newList, digits, index);
    }

    public static void main(String[] args)
    {
        List<String> list = new LetterCombinations().letterCombinations(
            "5");
        System.out.println(list);
        System.out.println(list.size());

    }
}
