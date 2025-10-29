class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum  = 0;
        int[] rsum = new int[n];
        int[] lsum = new int[n];

        for(int i = 0 ; i < n ; i++)
        {
            sum += nums[i];
            lsum[i] = sum;
        }
        sum = 0;
        for(int i = n-1 ; i >= 0 ; i--){
            sum += nums[i];
            rsum[i] = sum;
        }
        
        for(int i = 0 ; i < n ; i++){
            if(rsum[i] == lsum[i]) return i;
        }
        return -1;
    }
}