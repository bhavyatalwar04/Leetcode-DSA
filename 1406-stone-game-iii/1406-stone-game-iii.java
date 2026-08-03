class Solution {
    public String stoneGameIII(int[] stones) {
        int n = stones.length;
        Integer[] dp = new Integer[n];
        int diff = solve(stones, 0, n, dp);

        if (diff < 0)
            return "Bob";
        else if (diff > 0)
            return "Alice";
        else
            return "Tie";
    }

    int solve(int[] stones, int i, int n, Integer[] dp) {
        if (i >= n)
            return 0;
        if (dp[i] != null)
            return dp[i];
        int res = stones[i] - solve(stones, i + 1, n, dp);
        if (i + 1 < n)
            res = Math.max(res, stones[i] + stones[i + 1] - solve(stones, i + 2, n, dp));
        if (i + 2 < n)
            res = Math.max(res, stones[i] + stones[i + 1] + stones[i + 2] - solve(stones, i + 3, n, dp));
        return dp[i] = res;
    }
}