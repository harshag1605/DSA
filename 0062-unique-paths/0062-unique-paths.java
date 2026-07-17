class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return count(m-1,n-1,dp);
    }
    public int count(int m, int n, int[][] dp){
        if(m==0 || n==0){
            return 1;
        }
        if(dp[m][n] != 0){
            return dp[m][n];
        }
        dp[m][n] = count(m,n-1,dp) + count(m-1,n,dp);
        return dp[m][n];
    }
}