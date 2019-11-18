package com.lt.algorithm;

public class DynamicProgramming
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 5};
        System.out.println(coinChange(a, 11));
    }

    static int coinChange(int[] coins, int amount)
    {
        int[] dp = new int[amount + 1];
        for (int i = 0; i < dp.length; i++)
        {
            dp[i] = amount + 1;
        }
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++)
        {
            // 内层 for 在求所有子问题 + 1 的最小值
            for (int coin : coins)
            {
                if (i - coin < 0)
                    continue;
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return (dp[amount] == amount + 1) ? -1 : dp[amount];
    }
}
