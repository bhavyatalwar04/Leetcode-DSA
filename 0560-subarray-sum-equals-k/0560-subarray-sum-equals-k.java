class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> res=new HashMap<>();
        int preSum=0,count=0;
        
        res.put(0,1);

        for(int i=0;i<nums.length;i++){
            preSum+=nums[i];

            int rest=preSum-k;

            if(res.containsKey(rest)){
                count+=res.get(rest);
            }
            res.put(preSum,res.getOrDefault(preSum,0)+1);

        }
        return count;
        
    }
}