class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < edges.length; i++) {
            int src = edges[i][0];
            int dest = edges[i][1];
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }
        //BFS
        Queue<Integer> q = new LinkedList<>();
        int[] visit = new int[n];

        visit[source] = 1;
        q.offer(source);
        while (!q.isEmpty()) {
            int node = q.poll();
            if (node == destination)
                return true;

            for (int neigh : adj.get(node)) {
                if (visit[neigh] == 0) {
                    q.offer(neigh);
                    visit[neigh] = 1;
                }
            }
        }
        return false;
    }
}