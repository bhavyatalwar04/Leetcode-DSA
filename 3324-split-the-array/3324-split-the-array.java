class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        
        HashMap<Integer,Integer> count=new HashMap<>();

        if(nums.length%2!=0) return false;

        for(int n : nums){
            count.put(n,count.getOrDefault(n,0)+1);
        }

        for(int val:count.values()){
            if(val>2){
                return false;
            }
        
        }

        return true;



    }
}