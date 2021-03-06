package com.GodisLin.easy;

public class $006_Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for(int i = 1;i < prices.length;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(-prices[i],dp[i-1][1]);
        }
        return dp[n-1][0];
    }
}
