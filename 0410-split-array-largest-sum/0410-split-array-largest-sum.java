class Solution {
    public int splitArray(int[] nums, int k) {

        int low=0,high=0;
        for(int x:nums){
            low=Math.max(x,low);
            high+=x;
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            if(canSplit(nums,k,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;        
    }

    private boolean canSplit(int[] arr,int k,int sum){
        
        int part=1,curr=0;
        for(int n:arr){
            if(curr+n>sum){
                part++;
                curr=n;
                if(part>k) return false;
            }else{
                curr+=n;
            }
        }
        return true;
    }
}