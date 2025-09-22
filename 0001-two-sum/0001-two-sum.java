class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> hs=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(hs.containsKey(target-num)){
                return new int[] {i,hs.get(target-num)};
            }
            hs.put(num,i);
        }
        return new int[] {};
    }
}