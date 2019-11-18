package com.lt.leetcode;

/**
 * 19. 删除链表的倒数第N个节点
 * 难度 中等
 * 先遍历出总长度（借鉴234. 回文链表 快慢指针），再创建链表
 */
public class RemoveNthFromEnd
{
    public static void main(String[] args)
    {
        RemoveNthFromEnd r = new RemoveNthFromEnd();
        ListNode a = r.removeNthFromEnd(null, 2);
        System.out.println();
    }

    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        ListNode fast = head;
        int last = 1;
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            last++;
            if (fast != null)
            {
                last++;
            }
        }
        if (last - n == 0)
        {
            return head.next;
        }
        ListNode flagNode = head;
        for (int i = 0; i < last - n; i++)
        {
            flagNode = flagNode.next;
        }
        ListNode resultNode = new ListNode(head.val);
        fun(resultNode, head.next, last - n);
        resultNode.next = flagNode.next;
        return resultNode;
    }

    //尾插法创建单链表  队列形式先进先出
    public void fun(ListNode node, ListNode head, int i)
    {
        if (i > 0)
        {
            ListNode newNode = new ListNode(head.val);//创建新的结点
            newNode.next = null;
            node.next = newNode;
            fun(newNode, head.next, --i);
        }
        else
        {
            node.next = head.next;
        }
    }

}
