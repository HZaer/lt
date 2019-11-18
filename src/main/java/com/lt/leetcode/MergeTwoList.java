package com.lt.leetcode;

/**
 * 21. 合并两个有序链表
 */
public class MergeTwoList
{
    public static void main(String[] args)
    {
        ListNode node1 = new ListNode(1);

        ListNode node11 = new ListNode(2);
        node1.next = node11;
        ListNode node111 = new ListNode(4);
        node1.next.next = node111;
        ListNode node2 = new ListNode(1);
        ListNode node22 = new ListNode(3);
        node2.next = node22;
        ListNode node222 = new ListNode(4);
        node2.next.next = node222;
        ListNode node = mergeTwoLists(node1, node2);
        while (node != null)
        {
            System.out.println(node.val);
            node = node.next;
        }

    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        if (l1 == null)
        {
            return l2;
        }
        if (l2 == null)
        {
            return l1;
        }
        ListNode current1 = l1;
        while (l2 != null)
        {
            while (current1 != null)
            {
                if (l1.val <= l2.val)
                {
                    current1 = l1.next;
                    ListNode node = new ListNode(l2.val);
                    l1.next = node;
                    l1.next.next = current1;

                }
            }
            l2 = l2.next;
        }
        return l1;
    }
}

class ListNode
{
    int val;

    ListNode next;

    ListNode(int x)
    {
        val = x;
    }
}
