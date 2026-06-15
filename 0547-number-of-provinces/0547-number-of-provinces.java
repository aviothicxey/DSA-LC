class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = isConnected.length;
        int m = isConnected[0].length;
        for(int i = 0 ;i < n ; i++){
            adj.add(new ArrayList<>());

        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ;j++){
                if(isConnected[i][j] == 1 && i !=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        
        boolean[] vis = new boolean[n];
        int cnt = 0;
        for(int i = 0 ; i < n ; i++){
            if(vis[i] == false){
                cnt++;
                dfs(vis,adj,i );
            }
        }
        return cnt;
        
    }
    public void dfs(boolean[] vis , ArrayList<ArrayList<Integer>> adj ,int node ){
        vis[node] = true;
        for(int i : adj.get(node)){
            if(vis[i] == false){
                dfs(vis,adj,i);
            }
        }
    }

}