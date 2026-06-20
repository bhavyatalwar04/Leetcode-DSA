class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones) pq.add(ele);
        while(pq.size()>1){
            int st1=pq.remove();
            int st2=pq.remove();
            pq.add(st1-st2);
        }
        if(pq.size()==0) return 0;
        return pq.peek();
    }
}