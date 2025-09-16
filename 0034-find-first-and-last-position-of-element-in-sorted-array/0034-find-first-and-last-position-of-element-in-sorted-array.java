class Solution {

        public static int first(int[] nums,int target){

            int low=0,high=nums.length-1,res=-1;

            while(low<=high){
                int mid=low+(high-low)/2;

                if(nums[mid]==target){
                    res=mid;
                    high=mid-1;
                } else if(nums[mid]<target){
                    low=mid+1;
                } else high=mid-1;
            }
            return res;
        }
        
        // searches right
        public static int last(int[] nums,int target){

            int low=0,high=nums.length-1,res=-1;

            while(low<=high){
                int mid=low+(high-low)/2;

                if(nums[mid]==target){
                    res=mid;
                    low=mid+1;
                } else if(nums[mid]<target){
                    low=mid+1;
                } else high=mid-1;
            }
            return res;
        }

    public int[] searchRange(int[] nums, int target) {

        // searches left

        int first=first(nums,target);
        int last=last(nums,target);
        return new int[]{first,last};
    }
}