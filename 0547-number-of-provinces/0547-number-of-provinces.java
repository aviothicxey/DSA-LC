class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < isConnected.length ; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0 ; i < isConnected.length ; i++){
            for(int j = 0 ; j < isConnected[0].length ; j++){
                if(isConnected[i][j] == 1 && i != j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        boolean[] vis = new boolean[isConnected.length];
        vis[0] = false;
        int cnt =0 ;
        for(int i = 0 ; i < isConnected.length ; i++){
            if(vis[i] == false){
                cnt++;
                dfs(adj , i , vis);
            }

        }
        return cnt;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj , int node , boolean[]vis){
        vis[node] = true;
        for(int i : adj.get(node)){
            if(vis[i] == false){
                dfs(adj , i , vis);
            }
        }
    }
}