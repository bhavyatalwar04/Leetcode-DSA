class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstoc(nums,target); 
        int last=lastoc(nums,target); 
        return new int[]{first,last};
    }
    private int firstoc(int[] nums,int target){
        int l=0,r=nums.length-1,res=-1;

        while(l<=r){
            int mid=l+(r-l)/2;

            if(nums[mid]==target){
                res=mid;
                r=mid-1;
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
    private int lastoc(int[] nums,int target){
        int l=0,r=nums.length-1,res=-1;

        while(l<=r){
            int mid=l+(r-l)/2;

            if(nums[mid]==target){
                res=mid;
                l=mid+1;
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
}