class Solution {
    public int minimumPairRemoval(int[] nums) {
        
        int n=nums.length;
        int ans=0;

        while(!isSorted(nums,n)){
            int minSum=Integer.MAX_VALUE, minIdx=0;

            for(int i=0;i<n-1;i++){
                int sum=nums[i]+nums[i+1];
                if(sum<minSum){
                    minSum=sum;
                    minIdx=i;
                }
            }

            nums[minIdx]+=nums[minIdx+1];

            for(int i=minIdx+1;i<n-1;i++){
                nums[i]=nums[i+1];
            }
            n--;
            ans++;
        }
        return ans;
    }

    
        private boolean isSorted(int[] nums,int n){
            for(int i=0;i<n-1;i++){
                if(nums[i]>nums[i+1]) return false;
            }
            return true;
        }
    
}