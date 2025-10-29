class Solution {
    public int pivotIndex(int[] nums) {
        int lsum=0,tsum=0;

        for(int num:nums){
            tsum+=num;
        }

        for(int i=0;i<nums.length;i++){
            if(lsum==tsum-lsum-nums[i]) return i;
            lsum+=nums[i];
        }
        return -1;       
    }
}