class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low=1,high=0;

        for(int p:piles){
            high=Math.max(high,p);
        }
        while(low<=high){
            long hours=0;
            int mid=low+(high-low)/2;

            for(int p:piles){
                hours+=(p+mid-1L)/mid;
            }

            if(hours>h){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}