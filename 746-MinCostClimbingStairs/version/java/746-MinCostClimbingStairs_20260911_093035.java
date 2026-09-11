// Last updated: 11/09/2026, 09:30:35
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3
4        int n = cost.length;
5
6        int[] dp = new int[n + 1];
7
8        for (int i = 2; i <= n; i++) {
9            dp[i] = Math.min(
10                dp[i - 1] + cost[i - 1],
11                dp[i - 2] + cost[i - 2]
12            );
13        }
14
15        return dp[n];
16    }
17}