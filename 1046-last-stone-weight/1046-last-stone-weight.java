class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : stones)
            pq.add(ele);
        while (pq.size() > 1) {
            int st1 = pq.remove();
            int st2 = pq.remove();
            if (st1 != st2)
                pq.add(st1 - st2);
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}