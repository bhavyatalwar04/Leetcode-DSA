class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int idx=m+n-1;
        int i=m-1,j=n-1;

        while(j>=0){
            if(i>=0 && nums1[i]>=nums2[j]){
                nums1[idx]=nums1[i];
                i--;
            }
            else{
                nums1[idx]=nums2[j];
                j--;
            }
            idx--;
        }


        
    }
}