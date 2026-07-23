class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] state = new int[n];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (dfs(i, graph, state))
                ans.add(i);
        }
        return ans;
    }

    boolean dfs(int curr,int[][]graph,int[] state){
        if(state[curr]!=0) return state[curr]==2;
        state[curr]=1;
        for(int nbr:graph[curr]){
            if(!dfs(nbr,graph,state)) return false;
        }
        state[curr]=2;
        return true;
    }
}