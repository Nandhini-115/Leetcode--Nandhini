// Last updated: 11/08/2026, 14:22:11
class Solution {
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        // first row = 1 way
        for(int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        // first column = 1 way
        for(int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // fill remaining cells
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}