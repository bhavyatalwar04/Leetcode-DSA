class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer>arr=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
           else if(nums1[i]>nums2[j]){
                j++;
            }
           else {
            arr.add(nums1[i]);
                i++;
                j++;
            }
           
        }
        int[] result=new int[arr.size()];
        int k=0;
        for(int val:arr){
            result[k]=val;
            k++;
        }

    return result;
    }
}