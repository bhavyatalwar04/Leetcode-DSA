class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int s = 0, e = 0, idx = 0;

        Deque<Integer> dq = new LinkedList<>();

        while(e<n){
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[e]) dq.pollLast();
            dq.offerLast(e);
            if(e-s+1==k){
                ans[idx++]=nums[dq.peekFirst()];
                if(dq.peekFirst()==s) dq.pollFirst();
                s++;
                e++;
            }else e++;
        }
        return ans;
    }
}