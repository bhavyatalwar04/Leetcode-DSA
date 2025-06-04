class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>hash=new HashSet<>();
        for(int val:nums1){
            hash.add(val);
        }
        
        Set<Integer>inter=new HashSet<>();
        for(int val:nums2){
            if(hash.contains(val)){
                inter.add(val);
            }
        }

            int[]result=new int[inter.size()];
            int i=0;
        for(int val:inter){
            result[i++]=val;
        }
            
        return result;
    }
}