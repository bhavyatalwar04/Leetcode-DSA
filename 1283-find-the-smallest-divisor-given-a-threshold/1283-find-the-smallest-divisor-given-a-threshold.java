class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int n=nums.length;
        int min=1,max=Integer.MIN_VALUE;

        for(int x:nums){
            max=Math.max(max,x);
        }
        while(min<max){
            int mid=min+(max-min)/2;
            if(isPossible(nums,mid,threshold)){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        return min;

        
        
    }

    private boolean isPossible(int[] arr,int mid,int t){
        
        long ans=0;
        for(int n:arr){
            ans+=(n+mid-1)/mid;
        }
        if(ans>t){
            return false;
        }else{
            return true;
        }
    }
}