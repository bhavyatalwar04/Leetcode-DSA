class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] deg = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            int src = prerequisites[i][0];
            int dest = prerequisites[i][1];
            adj.get(dest).add(src);
            deg[src]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (deg[i] == 0)
                q.offer(i);
        }
        int count = 0;
        int idx = 0;
        int[] order = new int[numCourses];
        while (!q.isEmpty()) {
            int node = q.poll();
            count++;
            order[idx] = node;
            idx++;
            for (int nbr : adj.get(node)) {
                deg[nbr]--;
                if (deg[nbr] == 0)
                    q.offer(nbr);
            }
        }
        if (count == numCourses)
            return order;
        else
            return new int[] {};
    }
}