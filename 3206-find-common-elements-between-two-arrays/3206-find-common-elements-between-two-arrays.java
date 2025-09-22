class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        
        int ans1=0,ans2=0;
        
        Set<Integer> set1=new HashSet<>();
        for(int num:nums1) set1.add(num);

        for(int num:nums2){
            if(set1.contains(num)) ans2++;
        }

        Set<Integer> set2=new HashSet<>();
        for(int num:nums2) set2.add(num);

        for(int num:nums1){
            if(set2.contains(num)) ans1++;
        }
        


        return new int[] {ans1,ans2};

    }
}