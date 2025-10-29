class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Collections.sort(nums,(a,b) -> a.get(0)-b.get(0));

        int covered=0;
        int start=nums.get(0).get(0);
        int end=nums.get(0).get(1);

        for(int i=1;i<nums.size();i++){
            int s=nums.get(i).get(0);
            int e=nums.get(i).get(1);

            if(s<=end){
                end=Math.max(end,e);
            }else{
            covered+=end-start+1;
            start=s;
            end=e;
            }
        }
        covered+=end-start+1;
        return covered;
    }
}