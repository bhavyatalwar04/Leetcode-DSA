class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int n : arr) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(mp.values());
        int rem = 0;
        int ans = 0;
        while (rem < arr.length / 2) {
            rem += pq.poll();
            ans++;
        }
        return ans;

    }
}