class Solution {
    public int climbStairs(int n) {
        int[]dp=new int[n+1];
        return helper(n,dp);
    }
    int helper(int n,int[]dp){
        if(n==1 || n==2) return dp[n]=n;
        if(dp[n]!=0) return dp[n];
        int x=helper(n-1,dp);
        int y=helper(n-2,dp);
        dp[n]=x+y;
        return dp[n];
    }
}