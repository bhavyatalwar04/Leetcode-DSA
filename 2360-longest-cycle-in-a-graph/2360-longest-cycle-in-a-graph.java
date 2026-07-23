class Solution {
    int ans = -1;

    public int longestCycle(int[] edges) {
        int n = edges.length;
        int[] visit = new int[n];
        for (int i = 0; i < n; i++) {
            if (visit[i] == 0) {
                HashMap<Integer, Integer> map = new HashMap<>();
                dfs(i, 0, edges, visit, map);
            }
        }
        return ans;
    }

    void dfs(int curr, int step, int[] edges, int[] visit, HashMap<Integer, Integer> map) {
        visit[curr] = 1;
        map.put(curr, step);
        int nbr = edges[curr];
        if (nbr != -1) {
            if (visit[nbr] == 0) {
                dfs(nbr, step + 1, edges, visit, map);
            } else if (map.containsKey(nbr))
                ans = Math.max(ans, step - map.get(nbr) + 1);

        }
        map.remove(curr);
    }
}