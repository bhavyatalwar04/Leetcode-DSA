class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int tsum = 0;
        for (int num : nums)
            tsum += num;
        if (Math.abs(target) > tsum)
            return 0;
        if ((target + tsum) % 2 != 0)
            return 0;
        int sum = (target + tsum) / 2;

        int[][] dp = new int[n + 1][sum + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }
}