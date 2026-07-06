class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        int n = graph.length;

        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for(int i = 0; i < n; i++){
            for(int neighbour : graph[i]){
                adj.get(i).add(neighbour);
            }
        }

        int[] vis = new int[n];
        int[] pathVis = new int[n];
        int[] check = new int[n];

        for(int i = 0; i < n; i++){
            if(vis[i] == 0){
                dfsCheck(i, adj, vis, pathVis, check);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(check[i] == 1)
                ans.add(i);
        }

        return ans;
    }

    boolean dfsCheck(int node,List<List<Integer>> adj,int[] vis,int[] pathVis,int[] check){

        vis[node] = 1;
        pathVis[node] = 1;
        check[node] = 0;

        for(int it : adj.get(node)){

            if(vis[it] == 0){
                if(dfsCheck(it, adj, vis, pathVis, check))
                    return true;
            }

            else if(pathVis[it] == 1){
                return true;
            }
        }

        check[node] = 1;
        pathVis[node] = 0;

        return false;
    }
}