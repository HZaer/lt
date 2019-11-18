package com.lt.testt;

public class NodeTest

{
    int size = 0;//大小

    static Node headNode;

    int i = 0;

    class Node
    {
        private Node next;//指针

        private int data;//数据域

    }

    //尾插法创建单链表  队列形式先进先出
    public void fun(Node node, int data)
    {
        if (i <= 10)
        {
            Node newNode = new Node();//创建新的结点
            newNode.data = i;//设置数据域
            newNode.next = null;
            node.next = newNode;
            fun(newNode, ++i);
        }
    }

    //头插法创建单链表  栈形式先进后出
    public void afterInsert(Node node, int data)
    {

        if (i <= 10)
        {
            Node newNode = new Node();//创建新的结点
            newNode.data = i;//设置数据域
            newNode.next = node.next;
            node.next = newNode;
            afterInsert(node, ++i);
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        NodeTest test = new NodeTest();
        headNode = test.new Node();//头指针
        new NodeTest().fun(headNode,0);//前插法
       // new NodeTest().afterInsert(headNode, 0);//后插法
        System.out.println("创建后的链表是：");//0 1 2 3 4 5 6 7 8 9 10
        while (headNode.next != null)
        {
            headNode = headNode.next;
            System.out.print(headNode.data + " ");
        }
    }

}
