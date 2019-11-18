package com.lt.leetcode;

/**
 * 700. 二叉搜索树中的搜索
 */
public class SearchBST
{
    public static void main(String[] args)
    {
        int[] a = {2, 0, 6, 8, 9, 3};
        System.out.println(searchBST(new TreeNode(2), 2));

    }

    public static TreeNode searchBST(TreeNode root, int val)
    {
        while (root != null)
        {
            if (root.val < val)
            {
                root = root.right;
            }
            else if (root.val > val)
            {
                root = root.left;
            }
            else
            {
                return root;
            }
        }
        return null;
    }

}

class TreeNode
{
    int val;

    TreeNode left;

    TreeNode right;

    TreeNode(int x)
    {
        val = x;
    }
}
