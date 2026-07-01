class Solution {
    static int[] dp;

    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int case1 = helper(0, n - 2, nums);
        Arrays.fill(dp, -1);
        int case2 = helper(1, n - 1, nums);
        return Math.max(case1, case2);
    }

    int helper(int i, int end, int[] nums) {
        if (i > end)
            return 0;
        if (dp[i] != -1)
            return dp[i];
        int pick = nums[i] + helper(i + 2, end, nums);
        int skip = helper(i + 1, end, nums);
        return dp[i] = Math.max(pick, skip);
    }
}