package com.lt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 可以运用快慢指针
 * 快指针走两格，慢指针走一格，当快指针走到最后的时候，慢指针正好走到中点。
 * 第二步，翻转前半部分链表
 * 第三步，比较
 */
public class IsPalindromeNode2
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
        //快慢指针找到链表的中点
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        //翻转链表前半部分
        ListNode pre = null;
        ListNode next = null;
        while (head != slow)
        {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        //如果是奇数个节点，去掉后半部分的第一个节点。

        if (fast != null)
        {
            slow = slow.next;
        }
        //回文校验
        while (pre != null)
        {
            if (pre.val != slow.val)
            {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }
}
