class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        HashSet<Integer>hs=new HashSet<>();
        for(int num:nums){
            if(num>max) max=num;
            if(num<min) min=num;
            hs.add(num);
        }
        for(int i=min;i<=max;i++){
            if(!hs.contains(i)) ans.add(i);
        }
        return ans;
    }
}