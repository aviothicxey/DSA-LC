class Solution {
    public boolean isBipartite(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = graph.length;
        int m = graph[0].length;
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int neighbour : graph[i]) {
                adj.get(i).add(neighbour);
            }
        }
        int V = adj.size();
        int color[] = new int[V];
        for (int i = 0; i < V; i++) {
            color[i] = -1;
        }
        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (dfs(i, 0, color, adj) == false)
                    return false;
            }
        }
        return true;
    }

    boolean dfs(int node, int col, int color[], ArrayList<ArrayList<Integer>> adj) {
        color[node] = col;
        for (int i : adj.get(node)) {
            if (color[i] == -1) {
                if (dfs(i, 1 - col, color, adj) == false)
                    return false;
            } else if (color[i] == col)
                return false;
        }
        return true;
    }
}