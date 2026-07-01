class Solution {
    public int fib(int n) {
        int[]dp=new int[n+1];
        return fibo(dp,n);
    }
    int fibo(int[]dp,int n){
        if(n==0 || n==1) return dp[n]=n;
        if(dp[n]!=0) return dp[n];
        int x=fibo(dp,n-1);
        int y=fibo(dp,n-2);
        dp[n]=x+y;
        return dp[n];
    }
}