package com.lt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 234. 回文链表
 * low 的方法，先遍历出来，再判断
 */
public class IsPalindromeNode
{
    public static void main(String[] args)
    {
        ListNode h = new ListNode(1);
        System.out.println(isPalindrome(h));

    }

    private static boolean isPalindrome(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return true;
        }
        List<Integer> stock = new ArrayList<>();
        while (head != null)
        {
            stock.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < stock.size() / 2; i++)
        {
            if (!stock.get(i).equals(stock.get(stock.size() - 1 - i)))
            {
                return false;
            }
        }
        return true;
    }
}
