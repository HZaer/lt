package com.lt.leetcode;

public class SolveSudoku
{
    public static void main(String[] args)
    {
        char[][] nums = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        solveSudoku(nums);
        for (char[] a : nums)
        {
            for (char aa : a)
            {
                System.out.print(aa);
                System.out.print(' ');
            }
            System.out.println();

        }

    }

    public static void solveSudoku(char[][] board)
    {
        //需要放入的数
        int num = 1;
        int j = 0, i = 0;
        suduku(board, i, j, num);
    }

    private static void suduku(char[][] board, int i, int j, int num)
    {
        if (i == 9 && j == 9)
        {
            return;
        }
        while (i < 9)
        {
            while (board[i][j] != '.' && j < 9)
                j++;
            if (isExist(board, num, i, j))
            {
                board[i][j] = (char)(num + '0');
            }
            suduku(board, i, j, num++);
            i++;
        }
    }

    private static boolean isExist(char[][] board, int num, int x, int y)
    {
        for (int i = 0; i < 9; i++)
        {
            if (board[x][i] == num + '0' || board[y][i] == num + '0')
            {
                return false;
            }
        }
        x = x / 3;
        y = y / 3;
        for (int i = x; i < x + 3; i++)
        {
            for (int j = y; j < y + 3; j++)
            {
                if (board[i][j] == num + '0')
                {
                    return false;
                }
            }
        }
        return true;
    }
}
