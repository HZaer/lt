package com.lt.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 234. 回文链表
 * low 的方法，先遍历出来，再判断
 */
public class FindSubstring
{
    public static void main(String[] args)
    {
        /*String[] a = {"fooo", "barr", "wing", "ding", "wing"};
        System.out.println(findSubstring(
            "lingmindraboofooowingdingbarrwingmonkeypoundcake",
            a));*/

        String[] a = {"fooo", "barr", "wing", "ding", "wing"};
        System.out.println(findSubstring(
            "lingmindraboofooowingdingbarrwingmonkeypoundcake",
            a));
    }

    private static List<Integer> findSubstring(String s, String[] words)
    {
        List<Integer> result = new ArrayList<>();
        if (s.length() == 0 || words.length == 0)
        {
            return result;
        }
        int sLen = s.length();
        int wordsLen = words[0].length();
        if (wordsLen > sLen)
        {
            return result;
        }
        int begin = 0;
        while (begin < sLen - 1 - wordsLen * words.length)
        {
            List<String> wordList = new ArrayList<>(Arrays.asList(words));
            boolean flag = true;
            String substring;
            if (begin + wordsLen < sLen)
            {
                substring = s.substring(begin, begin + wordsLen);
            }
            else
            {
                substring = s.substring(begin, sLen);
            }
            int begin2 = begin + wordsLen;
            while (wordList.size() > 0 && begin2 <= sLen)
            {
                if (wordList.contains(substring))
                {
                    for (int i = 0; i < wordList.size(); i++)
                    {
                        if (wordList.get(i).equals(substring))
                        {
                            wordList.remove(i);
                            break;
                        }
                    }
                }
                else
                {
                    flag = false;
                    break;
                }
                if (begin2 + wordsLen < sLen)
                {
                    substring = s.substring(begin2, begin2 + wordsLen);
                }
                else
                {
                    substring = s.substring(begin2, sLen);
                }
                begin2 = begin2 + wordsLen;
            }
            if (flag && wordList.size() == 0)
            {
                result.add(begin);
            }
            begin++;
        }

        return result;
    }
}
