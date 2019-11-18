package com.lt.leetcode;

/**
 * 58. 最后一个单词的长度
 */
public class LengthOfLastWord
{
    public static void main(String[] args)
    {
        System.out.println(lengthOfLastWord("   "));
    }

    public static int lengthOfLastWord(String s)
    {
        if (s.length() == 0)
        {
            return 0;
        }
        String[] sArr = s.split(" ");
        if (sArr.length == 0)
        {
            return 0;
        }
        return sArr[sArr.length - 1].length();
    }
}
