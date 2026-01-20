class Solution {
    public int findKthPositive(int[] arr, int k) {

        int s = 0;
        int l = arr.length - 1;

        while (s <= l) {
            int mid = s + (l - s) / 2;

            if (arr[mid] - (mid + 1) < k) {
                s = mid + 1;
            } else {
                l = mid - 1;
            }
        }
        return s + k;
    }
}